package fr.inria.diversify.transformation.other;

import fr.inria.diversify.transformation.RefactorSpoonTransformation;
import spoon.reflect.code.CtLiteral;
import spoon.support.reflect.code.CtLiteralImpl;

/**
 * Created by Simon on 19/03/14.
 */
public class ReplaceLiteral extends RefactorSpoonTransformation<CtLiteral, CtLiteral> {


    @Override
    protected CtLiteral buildReplacementElement() {
        CtLiteral lit = new CtLiteralImpl<>();
        lit.setParent(transplant.getParent());
        lit.setValue(transplant.getValue());
        return lit;
    }
}
