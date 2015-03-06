package fr.inria.diversify.testamplification.compare.diff;



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

/**
 * User: Simon
 * Date: 06/03/15
 * Time: 13:30
 */
public class MonitoringPointDiff {
    protected int id;
    protected List<String> methodsDiff;
    protected List<String> valueOriginal;
    protected List<String> valueSosie;
    protected boolean classDiff;
    protected boolean isMulti;
    protected int maxSize; //pour les multiMonitoringPoint

    protected boolean exclude = false;

    public MonitoringPointDiff(int id) {
        maxSize = -1;
        this.id = id;
        methodsDiff = new ArrayList<>();
        valueOriginal = new ArrayList<>();
        valueSosie = new ArrayList<>();
    }

    public MonitoringPointDiff(JSONObject jsonObject) throws JSONException {
        id = jsonObject.getInt("id");
        classDiff = jsonObject.getBoolean("classDiff");
        isMulti = jsonObject.getBoolean("isMulti");
        maxSize = jsonObject.getInt("maxSize");
        JSONArray diff = jsonObject.getJSONArray("methodDiff");
        int length = diff.length();
        methodsDiff = new ArrayList<>();
        valueOriginal = new ArrayList<>();
        valueSosie = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            methodsDiff.add(diff.getString(i));
        }
    }

    public void setClassDiff(boolean diff){
        classDiff = diff;
    }

    public void addMethodDiff(String method, Object oValue, Object sValue) {
        methodsDiff.add(method);
        valueOriginal.add(oValue.toString());
        valueSosie.add(sValue.toString());
    }

    public void setIsMulti(boolean isMulti) {
        this.isMulti = isMulti;
    }

    public boolean getClassDiff() {
        return classDiff;
    }

    public List<String> getMethodsDiff() {
        return methodsDiff;
    }

    public void setMaxSize(int size) {
        maxSize = size;
    }

    public void addAllMethodDiff(Collection<String> methodsDiff) {
        this.methodsDiff.addAll(methodsDiff);
    }

    public int size() {
        if(exclude)
            return 0;
        int size = 0;
        if(maxSize != -1) {
            size = 1;
        }
        if(classDiff) {
            size++;
        }
        if(isMulti) {
            size++;
        }
        return size + methodsDiff.size();
    }

    public String toString() {
        String string = "id: " +id+ "\n";
        string += "\tmaxSize: " +maxSize+"\n";
        string += "\tclassDiff: " + classDiff + "\n";
        string += "\tisMulti: " + isMulti + "\n";
        return string + "\tmethodDiff: " + methodsDiff;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject object = new JSONObject();

        object.put("id", id);
        object.put("maxSize", maxSize);
        object.put("classDiff", classDiff);
        object.put("isMulti", isMulti);
        object.put("methodDiffs", methodsDiff);

        return object;
    }

    public String buildFilter() {
        String string = "" +  id;
        string += ";" +maxSize;
        string += ";" + classDiff;
        string += ";" + isMulti;
        for(String mth : methodsDiff) {
            string += ";"+ mth;
        }
        return string;
    }

    public void filter(Set<String> strings) {
        for (String string :strings) {
            String[] split = string.split(";");
            int splitId = Integer.parseInt(split[0]);
            if(splitId == id) {
                maxSize = Math.min(maxSize, Integer.parseInt(split[1]));
                classDiff = Boolean.parseBoolean(split[2]);
                isMulti = Boolean.parseBoolean(split[3]);

                exclude = classDiff || isMulti;
                for(int i = 4; i < split.length; i++) {
                    methodsDiff.remove(split[i]);
                }
            }
        }
    }
}