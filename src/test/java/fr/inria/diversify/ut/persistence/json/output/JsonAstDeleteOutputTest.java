package fr.inria.diversify.ut.persistence.json.output;

import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.persistence.json.output.JsonASTDeleteOutput;
import fr.inria.diversify.persistence.json.output.JsonASTSectionOutput;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.ut.FakeCodeFragment;
import fr.inria.diversify.ut.persistence.json.SectionTestUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSPLANT;
import static fr.inria.diversify.ut.persistence.json.SectionTestUtils.list;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.TRANSPLANT_POINT;

/**
 * Created by marodrig on 08/01/2015.
 */
public class JsonAstDeleteOutputTest {

    /**
     * Test that creates a "transformation" inside the global object
     */
    @Test(expected = PersistenceException.class)
    public void testWriteEmpty() {
        SectionTestUtils.doTestWriteEmpty(new JsonASTDeleteOutput(), new ASTDelete());
    }

    /**
     * Write Delete
     *
     * @throws JSONException
     */
    @Test
    public void testWrite() throws JSONException {
        JsonASTDeleteOutput d = new JsonASTDeleteOutput();
        d.setOutputObject(new JSONObject());
        ASTDelete r = new ASTDelete();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));
        d.write(r);

        JSONObject tr = d.getOutputObject().getJSONArray(
                JsonASTSectionOutput.TRANSFORMATIONS).getJSONObject(0).getJSONObject(TRANSPLANT_POINT);

        assertEquals(tr.get("position"), "org.class:1");
        assertEquals(tr.get("type"), "CtReturn");
        assertEquals(tr.get("sourcecode"), "return 0");
    }

    /**
     * Write Delete transformations only
     *
     * @throws JSONException
     */
    @Test
    public void testWriteDeleteOnly() throws JSONException {
        JsonASTDeleteOutput d = new JsonASTDeleteOutput();
        d.setOutputObject(new JSONObject());
        ASTDelete r = new ASTDelete();
        r.setTransplantationPoint(new FakeCodeFragment("org.class:1", "CtReturn", "return 0"));

        for (Transformation t : list(new ASTReplace(), r, new ASTAdd())) d.write(t);

        JSONArray array = d.getOutputObject().getJSONArray(JsonASTSectionOutput.TRANSFORMATIONS);
        assertEquals(1, array.length());
        assertTrue(array.getJSONObject(0).has(TRANSPLANT_POINT));
        assertFalse(array.getJSONObject(0).has(TRANSPLANT));
    }
}