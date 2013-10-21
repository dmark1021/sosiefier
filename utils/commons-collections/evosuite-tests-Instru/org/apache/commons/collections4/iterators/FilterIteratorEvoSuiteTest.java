/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.iterators.FilterIterator;
import org.junit.BeforeClass;

public class FilterIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.FilterIterator.setIterator(Ljava/util/Iterator;)V: root-Branch
   * 2 org.apache.commons.collections4.iterators.FilterIterator.<init>()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(513,"org.apache.commons.collections4.iterators.FilterIteratorEvoSuiteTest.test0");
      FilterIterator<Integer> filterIterator0 = new FilterIterator<Integer>();
      filterIterator0.setIterator((Iterator<? extends Integer>) filterIterator0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.FilterIterator.getIterator()Ljava/util/Iterator;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(514,"org.apache.commons.collections4.iterators.FilterIteratorEvoSuiteTest.test1");
      FilterIterator<Integer> filterIterator0 = new FilterIterator<Integer>();
      Iterator<? extends Integer> iterator0 = filterIterator0.getIterator();
      assertNull(iterator0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.FilterIterator.setPredicate(Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(515,"org.apache.commons.collections4.iterators.FilterIteratorEvoSuiteTest.test2");
      FilterIterator<Object> filterIterator0 = new FilterIterator<Object>();
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      filterIterator0.setPredicate((Predicate<? super Object>) instanceofPredicate0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.FilterIterator.<init>(Ljava/util/Iterator;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(516,"org.apache.commons.collections4.iterators.FilterIteratorEvoSuiteTest.test3");
      FilterIterator<Object> filterIterator0 = new FilterIterator<Object>();
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      FilterIterator<Object> filterIterator1 = new FilterIterator<Object>((Iterator<?>) filterIterator0, (Predicate<? super Object>) instanceofPredicate0);
      assertFalse(filterIterator1.equals(filterIterator0));
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.FilterIterator.getPredicate()Lorg/apache/commons/collections4/Predicate;: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(517,"org.apache.commons.collections4.iterators.FilterIteratorEvoSuiteTest.test4");
      FilterIterator<Object> filterIterator0 = new FilterIterator<Object>();
      Predicate<? super Object> predicate0 = filterIterator0.getPredicate();
      assertNull(predicate0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.FilterIterator.hasNext()Z: I4 Branch 1 IFNE L86 - false
   * 2 org.apache.commons.collections4.iterators.FilterIterator.<init>(Ljava/util/Iterator;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(518,"org.apache.commons.collections4.iterators.FilterIteratorEvoSuiteTest.test5");
      FilterIterator<Integer> filterIterator0 = new FilterIterator<Integer>();
      FilterIterator<Object> filterIterator1 = new FilterIterator<Object>((Iterator<?>) filterIterator0);
      // Undeclared exception!
      try {
        filterIterator1.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.FilterIterator.next()Ljava/lang/Object;: I4 Branch 3 IFNE L98 - false
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(519,"org.apache.commons.collections4.iterators.FilterIteratorEvoSuiteTest.test6");
      FilterIterator<Object> filterIterator0 = new FilterIterator<Object>();
      // Undeclared exception!
      try {
        filterIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.iterators.FilterIterator.remove()V: I4 Branch 5 IFEQ L119 - true
   * 2 org.apache.commons.collections4.iterators.FilterIterator.<init>()V: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(520,"org.apache.commons.collections4.iterators.FilterIteratorEvoSuiteTest.test7");
      FilterIterator<Object> filterIterator0 = new FilterIterator<Object>();
      // Undeclared exception!
      try {
        filterIterator0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
