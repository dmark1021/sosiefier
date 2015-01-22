package fr.inria.diversify.testamplification.logger;


import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Verbose log for humans to understand
 * <p/>
 * Created by marodrig on 25/06/2014.
 */
public class AssertLogWriter extends LogWriter {
    ///File writer for each thread. Each one saved in a different file
    private Map<Thread, PrintWriter> fileWriters;
    private String separator = ":;:";
    private String simpleSeparator = ";";
    private String end = "$$$\n";

    private Map<Class, String[]> previousValues;
    private Map<Class, Method[]> getters;
    private Map<Class, String> classToId;

    private static int count = 0;


    public AssertLogWriter() {
        super();
        previousValues = new HashMap<Class, String[]>();
        getters = new HashMap<Class, Method[]>();
        classToId = new HashMap<Class, String>();
        fileWriters = new HashMap<Thread, PrintWriter>();
    }


    public void writeTestStart(Thread thread, String testSignature) {
        String semaphore = "";
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(end);
            stringBuilder.append("TS");
            stringBuilder.append(simpleSeparator);
            stringBuilder.append(testSignature);

            String string = stringBuilder.toString();
            PrintWriter fileWriter = getFileWriter(thread);
            semaphore = fileWriter.toString() + fileWriter.hashCode();
            fileWriter.append(string);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            releaseFileWriter(semaphore);
        }
    }

    public void writeTestStart(Thread thread, Object thisObject, String testSignature) {
        writeTestStart(thread, thisObject.getClass().getName() + "." + testSignature);
    }

    @Override
    public void writeTestFinish(Thread t) {
        for (Thread thread : fileWriters.keySet()) {
            String semaphore = "";
            try {
                PrintWriter flw = getFileWriter(thread);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(end);
                stringBuilder.append("TE");
                stringBuilder.append(simpleSeparator);
                stringBuilder.append(System.currentTimeMillis());
                semaphore = flw.toString() + flw.hashCode();
                flw.append(stringBuilder.toString());
                flw.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseFileWriter(semaphore);
        }
    }


    protected String observe(Thread thread, Object object) throws IOException, InterruptedException {
        Class objectClass;
        if(object == null) {
            objectClass = null;
        } else {
            objectClass = object.getClass();
        }
        Method[] classGetters = getGetters(thread, objectClass);
        String[] results = new String[classGetters.length];

        for(int i = 0; i < classGetters.length ; i++) {
            try {
                results[i] = formatVar(classGetters[i].invoke(object));
            } catch (Exception e) {
                results[i] = "null";
            }
        }

        StringBuilder sameValue = new StringBuilder();
        List<String> result = new ArrayList<String>();
        boolean sameValues = true;
        if(previousValues.containsKey(objectClass)) {
            String[] pValues = previousValues.get(objectClass);
            for (int i = 0; i < classGetters.length; i++) {
                if (pValues[i].equals(results[i])) {
                    sameValue.append("0");
                } else {
                    sameValues = false;
                    sameValue.append("1");
                    result.add(results[i]);
                    pValues[i] = results[i];
                }
            }
        } else {
            sameValues = false;
            String[] pValues = new String[classGetters.length];
            for (int i = 0; i < classGetters.length; i++) {
                sameValue.append("1");
                result.add(results[i]);
                pValues[i] = results[i];
            }
            previousValues.put(objectClass, pValues);
        }

        String classId = getClassId(thread, objectClass);

        if(sameValues) {
            return classId;
        } else {
            return classId + simpleSeparator + sameValue.toString() + separator + join(result, separator);
        }
    }

    protected String getClassId(Thread thread, Class objectClass) throws IOException, InterruptedException {
        String className;
        if(objectClass == null) {
            className = "NullClass";
        } else {
            className = objectClass.getName();
        }

        if(!classToId.containsKey(objectClass)) {
            classToId.put(objectClass, count + "");

            PrintWriter fileWriter = getFileWriter(thread);
            String semaphore = fileWriter.toString() + fileWriter.hashCode();
            fileWriter.append(end + "Cl" + simpleSeparator + className + simpleSeparator + count);
            releaseFileWriter(semaphore);
            count++;
        }
        return classToId.get(objectClass);
    }

    protected String join(List<String> list, String conjunction)
    {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String item : list)
        {
            if (first)
                first = false;
            else
                sb.append(conjunction);
            sb.append(item);
        }
        return sb.toString();
    }

    protected String formatVar(Object object) {
        if (object == null) {
            return "null";
        }
        String string;
        if (object.getClass().isArray()) {
            string = Arrays.toString((Object[]) object);
        } else {
            string = object + "";
        }
        if(string.length() > 1000)
            string = string.length() + "";

        return string;
    }

    public void logAssertArgument(Thread thread, int idAssertTarget, Object target,  int idAssertInvocation, Object invocation) {
        logAssertArgument(thread, idAssertTarget, target);
        logAssertArgument(thread, idAssertInvocation, invocation);
    }

    public void logAssertArgument(Thread thread, int idAssert, Object invocation) {
        String semaphore = "";
        if (getLogMethod(thread)) {
            try {
                StringBuilder string = new StringBuilder();
                string.append(end);
                string.append("A");
                string.append(simpleSeparator);
                string.append(idAssert + "");

                stopLogMethod(thread);
                String varsString = observe(thread, invocation);

                string.append(simpleSeparator);
                string.append(varsString);

                startLogMethod(thread);
                PrintWriter fileWriter = getFileWriter(thread);
                semaphore = fileWriter.toString() + fileWriter.hashCode();
                fileWriter.append(string.toString());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                startLogMethod(thread);
                releaseFileWriter(semaphore);
            }
        }
    }


    public void close() {
        for (Thread thread : fileWriters.keySet()) {
            String semaphore = "";
            try {
                PrintWriter flw = getFileWriter(thread);
                semaphore = flw.toString() + flw.hashCode();
                flw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseFileWriter(semaphore);
        }
    }

    protected synchronized PrintWriter getFileWriter(Thread thread) throws IOException, InterruptedException {
        if (!fileWriters.containsKey(thread)) {
            String fileName = getThreadLogFilePath(thread) + "_" + System.currentTimeMillis();
            PrintWriter f = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            fileWriters.put(thread, f);
            semaphores.put(f.toString() + f.hashCode(), new Semaphore(1));
        }
        PrintWriter f = fileWriters.get(thread);
        semaphores.get(f.toString() + f.hashCode()).tryAcquire(50, TimeUnit.MILLISECONDS);
        return f;
    }

    protected void releaseFileWriter(String id) {
        if (semaphores.containsKey(id))
            semaphores.get(id).release();
    }

    protected Method[] getGetters(Thread thread, Class aClass) throws IOException, InterruptedException {
        if(!getters.containsKey(aClass)) {
            Method[] methods;
            if(aClass == null) {
                methods = new Method[0];
            } else {
                methods = findGetters(aClass);
            }
            getters.put(aClass, methods);

            String classId = getClassId(thread, aClass);

            PrintWriter fileWriter = getFileWriter(thread);
            String semaphore = fileWriter.toString() + fileWriter.hashCode();

            fileWriter.append(end + "Gt" + simpleSeparator + classId);
            for(Method method : methods) {
                fileWriter.append(simpleSeparator + method.getName());
            }

            releaseFileWriter(semaphore);
        }

        return getters.get(aClass);
    }

    protected Method[] findGetters(Class aClass){
//        System.out.println("getter for " + aClass);
        List<Method> getters = new ArrayList<Method>();
        for(Method method : aClass.getMethods()){
            if(isGetter(method) && !methodDefinedInObject(method)) {
                getters.add(method);
            }
        }

        try {
            Method toStringMethod = aClass.getMethod("toString");
            if(!methodDefinedInObject(toStringMethod)) {
                getters.add(toStringMethod);
            }
        } catch (NoSuchMethodException e) {}

        Method[] ret = new Method[getters.size()];

       for(int i = 0; i< ret.length; i++ ) {
//           System.out.println("\t" + getters.get(i));
           ret[i] = getters.get(i);
       }
        return ret;
    }

    protected boolean isGetter(Method method) {
        return method.getName().startsWith("get")
                && method.getParameterTypes().length == 0;
    }

    protected boolean isGetter(Class aClass, Method method) {
        return getterOf(null,method);
//        for(Field field: aClass.getFields()) {
//            if (getterOf(field,method))
//                return true;
//        }
//        return false;
    }

    protected boolean methodDefinedInObject(Method method) {
        for(Method objectMethod : Object.class.getMethods()) {
            if(objectMethod.equals(method)) {
                return true;
            }
        }
        return false;
    }

    protected boolean getterOf(Field field, Method method) {
        return method.getName().startsWith("get")
                //&& method.getName().toLowerCase().contains(field.getName().toLowerCase())
                && method.getParameterTypes().length == 0
                && !method.toString().contains("java.lang.Object.");
               // && method.getReturnType().isAssignableFrom(field.getType());

    }
}