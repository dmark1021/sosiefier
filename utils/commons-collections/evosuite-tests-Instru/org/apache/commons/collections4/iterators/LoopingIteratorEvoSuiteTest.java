/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.iterators.LoopingIterator;
import org.junit.BeforeClass;

public class LoopingIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.iterators.LoopingIterator.size()I: root-Branch
   * 2 org.apache.commons.collections4.iterators.LoopingIterator.reset()V: root-Branch
   * 3 org.apache.commons.collections4.iterators.LoopingIterator.<init>(Ljava/util/Collection;)V: I7 Branch 1 IFNONNULL L55 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(549,"org.apache.commons.collections4.iterators.LoopingIteratorEvoSuiteTest.test0");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LoopingIterator<String> loopingIterator0 = new LoopingIterator<String>((Collection<? extends String>) linkedList0);
      int int0 = loopingIterator0.size();
      assertEquals(0, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.LoopingIterator.remove()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(550,"org.apache.commons.collections4.iterators.LoopingIteratorEvoSuiteTest.test1");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      LoopingIterator<Object> loopingIterator0 = new LoopingIterator<Object>((Collection<?>) linkedList0);
      // Undeclared exception!
      try {
        loopingIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.LoopingIterator.<init>(Ljava/util/Collection;)V: I7 Branch 1 IFNONNULL L55 - false
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(551,"org.apache.commons.collections4.iterators.LoopingIteratorEvoSuiteTest.test2");
      LoopingIterator<Object> loopingIterator0 = null;
      try {
        loopingIterator0 = new LoopingIterator<Object>((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The collection must not be null
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.LoopingIterator.hasNext()Z: I5 Branch 2 IFLE L71 - true
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(552,"org.apache.commons.collections4.iterators.LoopingIteratorEvoSuiteTest.test3");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LoopingIterator<Object> loopingIterator0 = new LoopingIterator<Object>((Collection<?>) linkedList0);
      boolean boolean0 = loopingIterator0.hasNext();
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.LoopingIterator.hasNext()Z: I5 Branch 2 IFLE L71 - false
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(553,"org.apache.commons.collections4.iterators.LoopingIteratorEvoSuiteTest.test4");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.addFirst((Integer) null);
      LoopingIterator<Integer> loopingIterator0 = new LoopingIterator<Integer>((Collection<? extends Integer>) linkedList0);
      boolean boolean0 = loopingIterator0.hasNext();
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.LoopingIterator.next()Ljava/lang/Object;: I5 Branch 3 IFNE L84 - false
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(554,"org.apache.commons.collections4.iterators.LoopingIteratorEvoSuiteTest.test5");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      LoopingIterator<Integer> loopingIterator0 = new LoopingIterator<Integer>((Collection<? extends Integer>) linkedList0);
      // Undeclared exception!
      try {
        loopingIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // There are no elements for this iterator to loop on
         //
      }
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * 1 org.apache.commons.collections4.iterators.LoopingIterator.next()Ljava/lang/Object;: I18 Branch 4 IFNE L87 - false
   * 2 org.apache.commons.collections4.iterators.LoopingIterator.reset()V: root-Branch
   * 3 org.apache.commons.collections4.iterators.LoopingIterator.<init>(Ljava/util/Collection;)V: I7 Branch 1 IFNONNULL L55 - true
   * 4 org.apache.commons.collections4.iterators.LoopingIterator.next()Ljava/lang/Object;: I5 Branch 3 IFNE L84 - true
   * 5 org.apache.commons.collections4.iterators.LoopingIterator.next()Ljava/lang/Object;: I18 Branch 4 IFNE L87 - true
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(555,"org.apache.commons.collections4.iterators.LoopingIteratorEvoSuiteTest.test6");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.addFirst((Integer) null);
      LoopingIterator<Integer> loopingIterator0 = new LoopingIterator<Integer>((Collection<? extends Integer>) linkedList0);
      loopingIterator0.next();
      loopingIterator0.next();
  }
}
