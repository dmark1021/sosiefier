package fr.inria.diversify.transformation;

import fr.inria.diversify.codeFragment.CodeFragment;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtSimpleType;


/**
 * User: Simon
 * Date: 7/11/13
 * Time: 4:20 PM
 */
public class Delete extends Transformation {
    @Override
    public JSONObject toJSONObject() throws JSONException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    protected void addSourceCode(CodeFragment delete) throws Exception {
        CtSimpleType<?> originalClass = getOriginalClass(delete);

        System.out.println("cfToDelete:\n " + delete);
        System.out.println(delete.getCtCodeFragment().getPosition());
        System.out.println(delete.getCodeFragmentType());

        CompilationUnit compileUnit = originalClass.getPosition().getCompilationUnit();
        SourcePosition sp = delete.getCtCodeFragment().getPosition();
        int r = sp.getSourceEnd() - sp.getSourceStart();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()), "/**\n", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), "**/\n", 0));
    }
}