/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.sequence.CommandVisitor;
import org.apache.commons.collections4.sequence.KeepCommand;
import org.junit.BeforeClass;

public class EditCommandEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.sequence.EditCommand.getObject()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.sequence.EditCommand.<init>(Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1147,"org.apache.commons.collections4.sequence.EditCommandEvoSuiteTest.test0");
      KeepCommand<Object> keepCommand0 = new KeepCommand<Object>((Object) null);
      // Undeclared exception!
      try {
        keepCommand0.accept((CommandVisitor<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
