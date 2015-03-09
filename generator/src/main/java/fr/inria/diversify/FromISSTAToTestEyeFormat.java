package fr.inria.diversify;

import com.fasterxml.uuid.Generators;
import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.persistence.json.input.JsonAstTransformationInput;
import fr.inria.diversify.persistence.json.input.JsonSosiesInput;
import fr.inria.diversify.persistence.json.output.*;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/**
 * Converts sosies from the old format to the brand new format
 *
 * <p/>
 * Created by marodrig on 11/02/2015.
 */
public class FromISSTAToTestEyeFormat {


    //private static final String CONF_PATH = "C:\\MarcelStuff\\data\\DIVERSE\\input_configurations\\IsstaToTestEye-CommonColl.properties";
    private static final String CONF_PATH = "C:\\MarcelStuff\\data\\DIVERSE\\input_configurations\\IsstaToTestEye-gson.properties";
    //private static final String CONF_PATH = "C:\\MarcelStuff\\data\\DIVERSE\\input_configurations\\IsstaToTestEye-CommonMath.properties";

    public static void main(String[] args) throws Exception {

        Log.INFO();

        InputConfiguration inputConfiguration = new InputConfiguration(CONF_PATH);

        //Gather several JSON files into a single TestEye format
        getherIntoTestEyeFormat(inputConfiguration);

        //Test that the result can be properly loaded using the new JsonSosiesInput
        Collection<Transformation> r = loadWithSosiesInput(inputConfiguration);

        //Save the corrected(*) sosies
        JsonSosiesOutput sosiesOutput = new JsonSosiesOutput(r, inputConfiguration.getResultPath() + ".corrected.json",
                inputConfiguration.getProjectPath() + "/pom.xml", InputConfiguration.LATEST_GENERATOR_VERSION);
        sosiesOutput.write();

        //(*) Position mismatches and sources mismatches
    }

    /**
     * Loads the sosies with the JsonSosiesInput
     *
     * @param inputConfiguration Input configuration to load
     * @return The collection of transformations loaded
     * @throws Exception
     */
    public static Collection<Transformation> loadWithSosiesInput(InputConfiguration inputConfiguration) throws Exception {
        MavenDependencyResolver dr = new MavenDependencyResolver();
        dr.DependencyResolver(inputConfiguration.getProjectPath() + "\\pom.xml");

        InputProgram p = new InputProgram();
        p.setSearchLineTolerance(25);
        p.configure(inputConfiguration);

        long t = System.currentTimeMillis();
        p.setFactory(new SpoonMetaFactory().buildNewFactory(p.getAbsoluteSourceCodeDir(), 7));
        Log.info("Build: " + Math.abs(System.currentTimeMillis() - t));

        t = System.currentTimeMillis();
        p.processCodeFragments();
        Log.info("Process code fragment Time: " + Math.abs(System.currentTimeMillis() - t));

        t = System.currentTimeMillis();
        JsonSosiesInput input = new JsonSosiesInput(inputConfiguration.getResultPath(), p);
        Collection<Transformation> r = input.read();
        Log.info("Read Time: " + Math.abs(System.currentTimeMillis() - t));
        return r;
    }

    /**
     * Gather scattered files into one single TestEye JSONFile.
     *
     * @param inputConfiguration Input configuration
     * @throws JSONException
     * @throws IOException
     */
    public static void getherIntoTestEyeFormat(InputConfiguration inputConfiguration) throws JSONException, IOException {
        JSONObject result = new JSONObject();
        JsonHeaderOutput output = new JsonHeaderOutput(inputConfiguration.getProjectPath() + "/pom.xml",
                InputConfiguration.LATEST_GENERATOR_VERSION);
        output.write(result);

        JsonFailuresOutput failuresOutput = new JsonFailuresOutput();
        failuresOutput.setTransformations(new ArrayList<>());
        failuresOutput.write(result);

        JSONArray transformations = new JSONArray();
        result.put(JsonSectionOutput.TRANSFORMATIONS, transformations);

        File[] files = null;
        File tpFile = new File(inputConfiguration.getPreviousTransformationPath());
        if (tpFile.isDirectory()) files = tpFile.listFiles();
        else files = new File[]{tpFile};


        for (File f : files) {
            JSONArray a = getArray(f);
            for (int i = 0; i < a.length() - 2; i++) {
                try {
                    JSONObject tObj = a.getJSONObject(i);
                    if (tObj.has(JsonSectionOutput.TINDEX)) {
                        UUID uuid = JsonAstTransformationInput.getValidUUI(tObj.getString(JsonSectionOutput.TINDEX));
                        tObj.put(JsonSectionOutput.TINDEX, uuid);
                    }
                    if (tObj.has("variableMapping")) {
                        tObj.put(JsonSectionOutput.VARIABLE_MAP, tObj.get("variableMapping"));
                        tObj.remove("variableMapping");
                    }
                    if (tObj.has(JsonSectionOutput.TRANSPLANT)) {
                        correctSource(tObj.getJSONObject(JsonSectionOutput.TRANSPLANT));
                    }
                    if (tObj.has(JsonSectionOutput.TRANSPLANT_POINT)) {
                        correctSource(tObj.getJSONObject(JsonSectionOutput.TRANSPLANT_POINT));
                    }
                    if (tObj.has(JsonSectionOutput.STATUS) && tObj.getInt(JsonSectionOutput.STATUS) == 0) {
                        transformations.put(tObj);
                    }
                } catch (JSONException e) {
                    System.out.println("Error! ... And that's all I'm telling: " + e.getMessage());
                }
            }
        }

        //FileWriter fw = new FileWriter(inputConfiguration.getResultPath() + "/testEye.json");
        FileWriter fw = new FileWriter(inputConfiguration.getResultPath());
        result.write(fw);
        fw.close();
    }

    private static void correctSource(JSONObject o) throws JSONException {
        if (o.has("sourceCode")) {
            o.put(JsonSectionOutput.SOURCE_CODE, o.getString("sourceCode"));
        }
    }

    /**
     * Get the array from the json
     *
     * @param input A file with a JSON Array inside
     * @return
     * @throws IOException
     * @throws JSONException
     */
    private static JSONArray getArray(File input) throws IOException, JSONException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return new JSONArray(sb.toString());
    }
}
