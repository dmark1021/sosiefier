package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtReturn;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Simon
 * Date: 10/21/13
 * Time: 9:27 AM
 */
public class TestLoggingInstrumenter extends AbstractLoggingInstrumenter<CtMethod> {

    public TestLoggingInstrumenter() {
        super(new ArrayList<Transformation>());
    }

    @Override
    public boolean isToBeProcessed(CtMethod candidate) {
        if(candidate.isImplicit()
                || candidate.getBody() == null
                || candidate.getBody().getStatements().size() == 0
                || !classFilterContains(candidate))
            return false;

        for(CtAnnotation<?> annotation: candidate.getAnnotations())
            if(annotation.toString().startsWith("@org.junit.Test") ||
               annotation.toString().startsWith("@org.junit.Before") ||
               annotation.toString().startsWith("@org.junit.After"))
                return true;

        if(candidate.getSimpleName().contains("test"))
            return true;

        return false;
    }

    @Override
    public void process(CtMethod element) {
        String testName =  element.getPosition().getCompilationUnit().getMainType().getQualifiedName()
                + "." + element.getSimpleName();
        idFor(testName, "TEST"); //Save the id of the test to be able to count all processed tests

        String snippet = getLogName() + ".writeTestStart(Thread.currentThread(),\"" + testName + "\")";
        CtCodeSnippetStatement snippetStatement = new CtCodeSnippetStatementImpl();
        snippetStatement.setValue(snippet);
        element.getBody().insertBegin(snippetStatement);
//        SourcePosition sp = firstStmt.getPosition();
//        CompilationUnit compileUnit = sp.getCompilationUnit();

//        int index;
//        if(firstStmt.getPosition().getLine() == element.getPosition().getLine())
//            index = sp.getSourceStart();
//        else
//            index = compileUnit.beginOfLineIndex(sp.getSourceStart());
//
//        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));


        snippet = getLogName() + ".writeTestFinish()";
        snippetStatement = new CtCodeSnippetStatementImpl();
        snippetStatement.setValue(snippet);
        //Search the return statement
        boolean returnSt = false;
        List<CtStatement> sts = element.getBody().getStatements();
        for ( CtStatement st :  sts ) {
            if  ( st instanceof CtReturn ) {
//                CompilationUnit cu = st.getPosition().getCompilationUnit();
//                int pos = st.getPosition().getSourceStart();
//                cu.addSourceCodeFragment(new SourceCodeFragment(pos, getLogName() + ".writeTestFinish();\n", 0));
                st.insertBefore(snippetStatement);
                returnSt = true;
            }
        }

        if ( returnSt == false ) {
//            CompilationUnit cu = element.getPosition().getCompilationUnit();
//            int pos = element.getBody().getPosition().getSourceEnd();
//            cu.addSourceCodeFragment(new SourceCodeFragment(pos, getLogName() + ".writeTestFinish();\n", 0));
            element.getBody().insertEnd(snippetStatement);
        }

    }
}
