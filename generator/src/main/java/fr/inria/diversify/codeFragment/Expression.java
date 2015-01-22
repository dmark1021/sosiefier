package fr.inria.diversify.codeFragment;

import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtExpression;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 4:53 PM
 */
public class Expression extends CodeFragment {

    public Expression(CtExpression<?> expression) {
        init(expression);
    }

    public Expression() {}


    public String codeFragmentString() {
        return codeFragment.toString();
    }

    @Override
    public boolean isReplaceableBy(CodeFragment other, boolean varNameMatch, boolean subType) {
        return context.isReplaceableBy(other.context, varNameMatch, subType);
    }

    public Expression clone() {
        return new Expression((CtExpression<?>) copyElem(codeFragment));
    }
}