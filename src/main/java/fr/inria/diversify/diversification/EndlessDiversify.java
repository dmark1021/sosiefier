package fr.inria.diversify.diversification;

import fr.inria.diversify.statistic.SinglePointSessionResults;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.json.JSONException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Simon on 02/10/14.
 */
public class EndlessDiversify extends AbstractDiversify {

    public EndlessDiversify(InputConfiguration inputConfiguration, String project, String src) {
        this.sourceDir = src;
        this.projectDir = project;
        transformations = new ArrayList<>();
        this.inputConfiguration = inputConfiguration;
        sessionResults = new SinglePointSessionResults();
    }

    protected void run(Transformation trans) throws Exception {
        Log.info("trial {}", trial);
        Log.debug("output dir: " + tmpDir + "/" + sourceDir);
        try {
            writeTransformation(trans);

            applyTransformation(trans);
            transformations.add(trans);
            int status = runTest(tmpDir);

            trans.setStatus(status);
            trans.setFailures(builder.getTestFail());

        } catch (Exception e) {
            trans.setStatus(-2);
            Log.debug("compile error during diversification", e);
        }
        trial++;
        ((SinglePointSessionResults) sessionResults).addRunResults(trans);
        if(trans.getStatus() != 0) {
            trans.restore(tmpDir + "/" + sourceDir);
        } else {
            Log.info(sessionResults.toString());
            copySosieProgram();
        }
    }

    private void writeTransformation(Transformation trans) throws IOException, JSONException {
        File dir = new File(getSosieSourcesDir());
        if(!dir.exists())
            dir.mkdirs();

        FileWriter results = new FileWriter(getSosieSourcesDir() + "/result.json", true);

        trans.toJSONObject().write(results);
        results.flush();
    }

    protected void applyTransformation(Transformation trans) throws Exception {
        trans.apply(tmpDir + "/" + sourceDir);
    }

    @Override
    public void run(int n) throws Exception {
        if(n <= 0) {
            while (true) {
                run(transQuery.buildTransformation());
            }
        } else {
            for(int i = 0;i < n; i++) {
                run(transQuery.buildTransformation());
            }
        }
    }
}