/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.collection.UnmodifiableCollection;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.iterators.UnmodifiableListIterator;
import org.apache.commons.collections4.list.UnmodifiableList;
import org.junit.BeforeClass;

public class UnmodifiableListIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(Ljava/util/ListIterator;)Ljava/util/ListIterator;: I3 Branch 1 IFNONNULL L46 - false
   */

  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(671,"org.apache.commons.collections4.iterators.UnmodifiableListIteratorEvoSuiteTest.test0");
      try {
        UnmodifiableListIterator.umodifiableListIterator((ListIterator<UnmodifiableCollection<Object>>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ListIterator must not be null
         //
      }
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(Ljava/util/ListIterator;)Ljava/util/ListIterator;: I15 Branch 2 IFEQ L49 - false
   * 2 org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(Ljava/util/ListIterator;)Ljava/util/ListIterator;: I3 Branch 1 IFNONNULL L46 - true
   * 3 org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(Ljava/util/ListIterator;)Ljava/util/ListIterator;: I15 Branch 2 IFEQ L49 - true
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(672,"org.apache.commons.collections4.iterators.UnmodifiableListIteratorEvoSuiteTest.test1");
      LinkedList<UnmodifiableIterator<Object>> linkedList0 = new LinkedList<UnmodifiableIterator<Object>>();
      UnmodifiableList<UnmodifiableIterator<Object>> unmodifiableList0 = new UnmodifiableList<UnmodifiableIterator<Object>>((List<UnmodifiableIterator<Object>>) linkedList0);
      ListIterator<UnmodifiableIterator<Object>> listIterator0 = unmodifiableList0.listIterator(0);
      ListIterator<UnmodifiableIterator<Object>> listIterator1 = UnmodifiableListIterator.umodifiableListIterator(listIterator0);
      assertEquals(false, listIterator1.hasPrevious());
  }
}
