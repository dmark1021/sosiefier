/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.StringValueTransformer;
import org.junit.BeforeClass;

public class StringValueTransformerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.functors.StringValueTransformer.stringValueTransformer()Lorg/apache/commons/collections4/Transformer;: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(825,"org.apache.commons.collections4.functors.StringValueTransformerEvoSuiteTest.test0");
      Transformer<Integer, String> transformer0 = StringValueTransformer.stringValueTransformer();
      assertNotNull(transformer0);
  }
}
