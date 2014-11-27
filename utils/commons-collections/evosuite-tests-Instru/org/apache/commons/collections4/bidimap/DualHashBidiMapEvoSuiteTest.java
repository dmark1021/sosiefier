/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.bidimap;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.junit.BeforeClass;

public class DualHashBidiMapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.bidimap.DualHashBidiMap.createBidiMap(Ljava/util/Map;Ljava/util/Map;Lorg/apache/commons/collections4/BidiMap;)Lorg/apache/commons/collections4/BidiMap;: root-Branch
   * 2 org.apache.commons.collections4.bidimap.DualHashBidiMap.<init>(Ljava/util/Map;Ljava/util/Map;Lorg/apache/commons/collections4/BidiMap;)V: root-Branch
   * 3 org.apache.commons.collections4.bidimap.DualHashBidiMap.<init>()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1027,"org.apache.commons.collections4.bidimap.DualHashBidiMapEvoSuiteTest.test0");
      DualHashBidiMap<Integer, String> dualHashBidiMap0 = new DualHashBidiMap<Integer, String>();
      BidiMap<String, Integer> bidiMap0 = dualHashBidiMap0.inverseBidiMap();
      assertEquals(0, bidiMap0.size());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.bidimap.DualHashBidiMap.<init>(Ljava/util/Map;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1028,"org.apache.commons.collections4.bidimap.DualHashBidiMapEvoSuiteTest.test1");
      DualHashBidiMap<String, String> dualHashBidiMap0 = null;
      try {
        dualHashBidiMap0 = new DualHashBidiMap<String, String>((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}