package fr.inria.diversify.sosie.logger;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Simon
 * Date: 7/23/13
 * Time: 10:07 AM
 */
public class LogWriter {
    static private File dir;
    static private Map<Thread, FileWriter> fileWriters;
    static private String separator = ":;:";


    protected static FileWriter init(Thread thread) throws IOException {
        if(fileWriters == null) {
            fileWriters = new HashMap<Thread, FileWriter>();
            ShutdownHookLog shutdownHook = new ShutdownHookLog();
            Runtime.getRuntime().addShutdownHook(shutdownHook);
        }
        if(!fileWriters.containsKey(thread)) {
            if(dir == null) {
                initDir();
            }
            String fileName = initFileName(thread);
            fileWriters.put(thread,new FileWriter(dir.getAbsolutePath()+"/"+fileName));
        }
        return fileWriters.get(thread);
    }

    private static void initDir() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("LogDirName"));
            dir = new File("log"+reader.readLine());

        } catch (IOException e) {
            dir = new File("log");
        }
        dir.mkdir();
    }

    private static String initFileName(Thread thread) {
        String fileName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("LogfileName"));
            fileName = reader.readLine() + "__" + thread.getName();
        } catch (IOException e) {
            fileName = "log" + thread.getName() + "__" + System.currentTimeMillis();
        }
        return fileName;
    }

    public static void writeLog(int id,Thread thread, String className, String methodSignature, Object... var) {
        FileWriter fileWriter = null;
        try {
                fileWriter = init(thread);
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {
            fileWriter.append("$$$\n");
            fileWriter.append(id+"");
            fileWriter.append(separator);
            fileWriter.append(className);
            fileWriter.append(separator);
            fileWriter.append(methodSignature);

            for (int i = 0; i < var.length/2; i = i + 2) {
                fileWriter.append(separator);
                fileWriter.append(var[i].toString());
                fileWriter.append(separator);
                fileWriter.append(var[i+1]+"");
            }
        } catch (IOException e) {
            e.printStackTrace();


        }
    }

    public static void writeError(int id,Thread thread, String className, String methodSignature, StackTraceElement[] stackTrace) {
        FileWriter fileWriter = null;
        try {
            fileWriter = init(thread);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {

            fileWriter.append("$$$\n");
            fileWriter.append("\n----------------------------------\n");
            fileWriter.append("ST");
            fileWriter.append(separator);
            fileWriter.append(id+"");
            fileWriter.append(separator);
            fileWriter.append(className);
            fileWriter.append(separator);
            fileWriter.append(methodSignature);

            for(StackTraceElement stackTraceElement :stackTrace) {
                fileWriter.append(stackTraceElement.toString());
                fileWriter.append(separator+"\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        for (FileWriter flw : fileWriters.values())
            try {
                flw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}