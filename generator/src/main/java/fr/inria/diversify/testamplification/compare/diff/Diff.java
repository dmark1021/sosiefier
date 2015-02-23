package fr.inria.diversify.testamplification.compare.diff;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

/**
 * Created by Simon on 13/02/15.
 */
public class Diff {

    List<TestDiff> testDiffs;
    Transformation sosie;

    public void add(TestDiff testDiff) {
        testDiffs.add(testDiff);
    }

    public Diff() {
        testDiffs = new ArrayList<>();
    }

    public Diff(JSONObject td, InputProgram inputProgram) throws JSONException, TransformationParserException {

        TransformationJsonParser parser = new TransformationJsonParser(true, inputProgram);
        sosie = parser.parseTransformation(td.getJSONObject("transformation"));

        JSONArray array = td.getJSONArray("testDiff");
        testDiffs = new ArrayList<>();
        for (int i = 0; i < array.length(); i++) {
            testDiffs.add(new TestDiff(array.getJSONObject(i)));
        }

    }

    public Set<String> buildFilter() {
        Set<String> filter = new HashSet<>();
        for(TestDiff d : testDiffs) {
            filter.addAll(d.buildFilter());
        }
        return filter;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject object = new JSONObject();

        if(sosie != null) {
            object.put("transformation", sosie.toJSONObject());
        }

        JSONArray array = new JSONArray();
        object.put("testDiff", array);
        for(TestDiff diff : testDiffs) {
            if(!diff.getDiff().isEmpty()) {
                array.put(diff.toJSON());
            }
        }

        return object;
    }

    public void setSosie(Transformation sosie) {
        this.sosie = sosie;
    }

    public Transformation getSosie() {
        return sosie;
    }

    public void filter(Map<String, Set<String>> filter) {
        testDiffs.stream()
            .filter(d -> filter.containsKey(d.getSignature()))
            .forEach(d -> d.filter(filter.get(d.getSignature())));
    }

    public void merge(Diff other) {

        for(TestDiff sosie : other.testDiffs) {
            String signature = sosie.getSignature();
            TestDiff original = testDiffs.stream()
                    .filter(td ->  td.getSignature().equals(signature))
                    .findAny()
                    .orElse(null);
            if(original != null) {
                original.merge(sosie);
            } else {
                testDiffs.add(sosie);
            }
        }
    }

    public int size() {
        return testDiffs.stream()
                .mapToInt(diff -> diff.size()).sum();
    }

    public int mergeSize(Diff other) {
        int mergeSize = 0;

        for(TestDiff sosie : other.testDiffs) {
            String signature = sosie.getSignature();
            TestDiff original = testDiffs.stream()
                                         .filter(td ->  td.getSignature().equals(signature))
                                         .findAny()
                                         .orElse(null);
            if(original != null) {
                mergeSize += original.mergeSize(sosie);
            } else {
                mergeSize += sosie.size();
            }
        }

        return mergeSize;
    }

    @Override
    public String toString() {
        String ret = "";
        for(TestDiff testDiff : testDiffs) {
            if(testDiff.size() != 0) {
                ret += testDiff.toString() +"\n";
            }
        }
        return ret;
    }
}