package fr.inria.diversify.codeFragment;


import spoon.reflect.code.CtBlock;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 4:28 PM
 */
public class Block extends CodeFragment<CtBlock> {
    public Block(CtBlock element) {
        codeFragment = element;
        init(element);
    }

    public Block() {}

    public String codeFragmentString() {
        return codeFragment.toString();
    }

    @Override
    //validate if this can be replaced by other
    public boolean isReplaceableBy(CodeFragment other, boolean varNameMatch, boolean subType) {
        Class<?> cl = codeFragment.getClass();
        Class<?> clOther = other.codeFragment.getClass();

        if(clOther != cl )
            return false;

        return context.isReplaceableBy(other.context, varNameMatch, subType);
    }

    public Block clone() {
        return new Block(copyElem(codeFragment));
    }
}
