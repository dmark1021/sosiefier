/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.sequence.ReplacementsFinder;
import org.apache.commons.collections4.sequence.ReplacementsHandler;
import org.junit.BeforeClass;

public class ReplacementsFinderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.sequence.ReplacementsFinder.visitKeepCommand(Ljava/lang/Object;)V: I5 Branch 1 IFLE L90 - true
   * 2 org.apache.commons.collections4.sequence.ReplacementsFinder.visitDeleteCommand(Ljava/lang/Object;)V: root-Branch
   * 3 org.apache.commons.collections4.sequence.ReplacementsFinder.<init>(Lorg/apache/commons/collections4/sequence/ReplacementsHandler;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1156,"org.apache.commons.collections4.sequence.ReplacementsFinderEvoSuiteTest.test0");
      ReplacementsFinder<Object> replacementsFinder0 = new ReplacementsFinder<Object>((ReplacementsHandler<Object>) null);
      Object object0 = new Object();
      replacementsFinder0.visitDeleteCommand(object0);
      // Undeclared exception!
      try {
        replacementsFinder0.visitKeepCommand((Object) "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.sequence.ReplacementsFinder.visitKeepCommand(Ljava/lang/Object;)V: I5 Branch 1 IFLE L90 - false
   * 2 org.apache.commons.collections4.sequence.ReplacementsFinder.visitKeepCommand(Ljava/lang/Object;)V: I9 Branch 2 IFLE L90 - false
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1157,"org.apache.commons.collections4.sequence.ReplacementsFinderEvoSuiteTest.test1");
      ReplacementsFinder<Object> replacementsFinder0 = new ReplacementsFinder<Object>((ReplacementsHandler<Object>) null);
      Object object0 = new Object();
      replacementsFinder0.visitKeepCommand(object0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.sequence.ReplacementsFinder.visitKeepCommand(Ljava/lang/Object;)V: I9 Branch 2 IFLE L90 - true
   * 2 org.apache.commons.collections4.sequence.ReplacementsFinder.visitInsertCommand(Ljava/lang/Object;)V: root-Branch
   * 3 org.apache.commons.collections4.sequence.ReplacementsFinder.<init>(Lorg/apache/commons/collections4/sequence/ReplacementsHandler;)V: root-Branch
   * 4 org.apache.commons.collections4.sequence.ReplacementsFinder.visitKeepCommand(Ljava/lang/Object;)V: I5 Branch 1 IFLE L90 - false
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1158,"org.apache.commons.collections4.sequence.ReplacementsFinderEvoSuiteTest.test2");
      ReplacementsFinder<String> replacementsFinder0 = new ReplacementsFinder<String>((ReplacementsHandler<String>) null);
      replacementsFinder0.visitInsertCommand("gFSRHYU>>aU");
      // Undeclared exception!
      try {
        replacementsFinder0.visitKeepCommand("gFSRHYU>>aU");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
