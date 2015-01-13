package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public class JsonAstDeleteInput extends JsonAstTransformationInput {


    public JsonAstDeleteInput() {
        super();
    }

    @Override
    protected ASTTransformation build() {
        return new ASTDelete();
    }

    @Override
    public void read(HashMap<Integer, Transformation> transformations) {

        try {
            ASTDelete transf = (ASTDelete)get(transformations); //add the transformation to the transformations map if not present
            JSONObject cfJson = getJsonObject().getJSONObject(TRANSPLANT_POINT);
            transf.setTransplantationPoint(getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE)));
        } catch (JSONException e) {
            throw new PersistenceException("Unable to parse delete transformation", e);
        }
    }

    @Override
    public boolean canHandleSection(String s) {
        String[] r = s.split("\\.");
        if ( r.length != 2 ) return false;
        return  r[0].equals(TRANSFORMATIONS) && r[1].equals("delete");
    }
}
