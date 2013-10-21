/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.keyvalue;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.keyvalue.DefaultKeyValue;
import org.junit.BeforeClass;

public class AbstractKeyValueEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 org.apache.commons.collections4.keyvalue.AbstractKeyValue.setValue(Ljava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.keyvalue.AbstractKeyValue.getValue()Ljava/lang/Object;: root-Branch
   * 3 org.apache.commons.collections4.keyvalue.AbstractKeyValue.getKey()Ljava/lang/Object;: root-Branch
   * 4 org.apache.commons.collections4.keyvalue.AbstractKeyValue.toString()Ljava/lang/String;: root-Branch
   * 5 org.apache.commons.collections4.keyvalue.AbstractKeyValue.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(422,"org.apache.commons.collections4.keyvalue.AbstractKeyValueEvoSuiteTest.test0");
      DefaultKeyValue<Object, String> defaultKeyValue0 = new DefaultKeyValue<Object, String>();
      String string0 = defaultKeyValue0.toString();
      assertNotNull(string0);
      
      defaultKeyValue0.setValue("null=null");
      assertEquals("null=null=null", defaultKeyValue0.toString());
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 org.apache.commons.collections4.keyvalue.AbstractKeyValue.setKey(Ljava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.keyvalue.AbstractKeyValue.getValue()Ljava/lang/Object;: root-Branch
   * 3 org.apache.commons.collections4.keyvalue.AbstractKeyValue.getKey()Ljava/lang/Object;: root-Branch
   * 4 org.apache.commons.collections4.keyvalue.AbstractKeyValue.toString()Ljava/lang/String;: root-Branch
   * 5 org.apache.commons.collections4.keyvalue.AbstractKeyValue.<init>(Ljava/lang/Object;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(423,"org.apache.commons.collections4.keyvalue.AbstractKeyValueEvoSuiteTest.test1");
      DefaultKeyValue<Object, String> defaultKeyValue0 = new DefaultKeyValue<Object, String>();
      String string0 = defaultKeyValue0.toString();
      assertNotNull(string0);
      
      defaultKeyValue0.setKey((Object) "null=null");
      assertEquals("null=null=null", defaultKeyValue0.toString());
  }
}
