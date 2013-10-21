/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.junit.BeforeClass;

public class IteratorEnumerationEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.IteratorEnumeration.hasMoreElements()Z: root-Branch
   * 2 org.apache.commons.collections4.iterators.IteratorEnumeration.<init>(Ljava/util/Iterator;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(540,"org.apache.commons.collections4.iterators.IteratorEnumerationEvoSuiteTest.test0");
      IteratorEnumeration<Object> iteratorEnumeration0 = new IteratorEnumeration<Object>((Iterator<?>) null);
      // Undeclared exception!
      try {
        iteratorEnumeration0.hasMoreElements();
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
   * 1 org.apache.commons.collections4.iterators.IteratorEnumeration.setIterator(Ljava/util/Iterator;)V: root-Branch
   * 2 org.apache.commons.collections4.iterators.IteratorEnumeration.<init>(Ljava/util/Iterator;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(541,"org.apache.commons.collections4.iterators.IteratorEnumerationEvoSuiteTest.test1");
      IteratorEnumeration<Object> iteratorEnumeration0 = new IteratorEnumeration<Object>((Iterator<?>) null);
      iteratorEnumeration0.setIterator((Iterator<?>) null);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.IteratorEnumeration.getIterator()Ljava/util/Iterator;: root-Branch
   * 2 org.apache.commons.collections4.iterators.IteratorEnumeration.<init>()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(542,"org.apache.commons.collections4.iterators.IteratorEnumerationEvoSuiteTest.test2");
      IteratorEnumeration<String> iteratorEnumeration0 = new IteratorEnumeration<String>();
      Iterator<? extends String> iterator0 = iteratorEnumeration0.getIterator();
      assertNull(iterator0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.IteratorEnumeration.nextElement()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.iterators.IteratorEnumeration.<init>()V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(543,"org.apache.commons.collections4.iterators.IteratorEnumerationEvoSuiteTest.test3");
      IteratorEnumeration<String> iteratorEnumeration0 = new IteratorEnumeration<String>();
      // Undeclared exception!
      try {
        iteratorEnumeration0.nextElement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
