/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.comparators;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Comparator;
import org.apache.commons.collections4.comparators.NullComparator;
import org.junit.BeforeClass;

public class NullComparatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.NullComparator.<init>(Ljava/util/Comparator;Z)V: I17 Branch 1 IFNONNULL L116 - false
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(901,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test0");
      NullComparator<Object> nullComparator0 = null;
      try {
        nullComparator0 = new NullComparator<Object>((Comparator<Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null nonNullComparator
         //
      }
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I4 Branch 2 IF_ACMPNE L139 - true
   * 2 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I10 Branch 3 IFNONNULL L140 - true
   * 3 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I23 Branch 5 IFNONNULL L141 - false
   * 4 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I26 Branch 6 IFEQ L141 - true
   * 5 org.apache.commons.collections4.comparators.NullComparator.<init>(Z)V: root-Branch
   * 6 org.apache.commons.collections4.comparators.NullComparator.<init>(Ljava/util/Comparator;Z)V: I17 Branch 1 IFNONNULL L116 - true
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(902,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test1");
      NullComparator<Object> nullComparator0 = new NullComparator<Object>(false);
      int int0 = nullComparator0.compare((Object) "", (Object) null);
      assertEquals(1, int0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I4 Branch 2 IF_ACMPNE L139 - false
   * 2 org.apache.commons.collections4.comparators.NullComparator.<init>()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(907,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test2");
      NullComparator<Integer> nullComparator0 = new NullComparator<Integer>();
      int int0 = nullComparator0.compare((Integer) null, (Integer) null);
      assertEquals(0, int0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I10 Branch 3 IFNONNULL L140 - false
   * 2 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I13 Branch 4 IFEQ L140 - false
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(908,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test3");
      NullComparator<Object> nullComparator0 = new NullComparator<Object>();
      int int0 = nullComparator0.compare((Object) null, (Object) "Gv5$GCg#j^`");
      assertEquals(1, int0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I13 Branch 4 IFEQ L140 - true
   * 2 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I10 Branch 3 IFNONNULL L140 - false
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(909,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test4");
      NullComparator<Object> nullComparator0 = new NullComparator<Object>(false);
      int int0 = nullComparator0.compare((Object) null, (Object) "null nonNullComparator");
      assertEquals((-1), int0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I23 Branch 5 IFNONNULL L141 - true
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(910,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test5");
      NullComparator<Object> nullComparator0 = new NullComparator<Object>();
      NullComparator<String> nullComparator1 = new NullComparator<String>();
      NullComparator<String> nullComparator2 = new NullComparator<String>((Comparator<String>) nullComparator1, false);
      // Undeclared exception!
      try {
        nullComparator0.compare((Object) nullComparator1, (Object) nullComparator2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.collections4.comparators.NullComparator cannot be cast to java.lang.Comparable
         //
      }
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I26 Branch 6 IFEQ L141 - false
   * 2 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I4 Branch 2 IF_ACMPNE L139 - true
   * 3 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I10 Branch 3 IFNONNULL L140 - true
   * 4 org.apache.commons.collections4.comparators.NullComparator.compare(Ljava/lang/Object;Ljava/lang/Object;)I: I23 Branch 5 IFNONNULL L141 - false
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(911,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test6");
      NullComparator<Object> nullComparator0 = new NullComparator<Object>();
      int int0 = nullComparator0.compare((Object) "null nonNullComparator", (Object) null);
      assertEquals((-1), int0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.NullComparator.hashCode()I: I4 Branch 7 IFEQ L154 - true
   */

  @Test
  public void test7()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(912,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test7");
      NullComparator<Object> nullComparator0 = new NullComparator<Object>(false);
      int int0 = nullComparator0.hashCode();
      assertEquals(1769708912, int0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.NullComparator.hashCode()I: I4 Branch 7 IFEQ L154 - false
   */

  @Test
  public void test8()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(913,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test8");
      NullComparator<Integer> nullComparator0 = new NullComparator<Integer>();
      int int0 = nullComparator0.hashCode();
      assertEquals((-1769708912), int0);
  }

  //Test case number: 9
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I3 Branch 8 IFNONNULL L170 - true
   * 2 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I10 Branch 9 IF_ACMPNE L171 - true
   * 3 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I20 Branch 10 IFNE L172 - true
   * 4 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I34 Branch 11 IF_ICMPNE L176 - true
   */

  @Test
  public void test9()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(914,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test9");
      NullComparator<Integer> nullComparator0 = new NullComparator<Integer>();
      NullComparator<NullComparator<Integer>> nullComparator1 = new NullComparator<NullComparator<Integer>>(false);
      boolean boolean0 = nullComparator0.equals((Object) nullComparator1);
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I3 Branch 8 IFNONNULL L170 - false
   */

  @Test
  public void test10()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(903,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test10");
      NullComparator<Integer> nullComparator0 = new NullComparator<Integer>(true);
      boolean boolean0 = nullComparator0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I10 Branch 9 IF_ACMPNE L171 - false
   * 2 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I34 Branch 11 IF_ICMPNE L176 - false
   * 3 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I40 Branch 12 IFEQ L176 - false
   */

  @Test
  public void test11()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(904,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test11");
      NullComparator<Object> nullComparator0 = new NullComparator<Object>();
      NullComparator<NullComparator<Object>> nullComparator1 = new NullComparator<NullComparator<Object>>();
      boolean boolean0 = nullComparator1.equals((Object) nullComparator0);
      assertEquals(true, boolean0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I20 Branch 10 IFNE L172 - false
   */

  @Test
  public void test12()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(905,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test12");
      NullComparator<Object> nullComparator0 = new NullComparator<Object>();
      Object object0 = new Object();
      boolean boolean0 = nullComparator0.equals(object0);
      assertEquals(false, boolean0);
  }

  //Test case number: 13
  /*
   * 9 covered goals:
   * 1 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I40 Branch 12 IFEQ L176 - true
   * 2 org.apache.commons.collections4.comparators.NullComparator.<init>(Z)V: root-Branch
   * 3 org.apache.commons.collections4.comparators.NullComparator.<init>(Ljava/util/Comparator;)V: root-Branch
   * 4 org.apache.commons.collections4.comparators.NullComparator.<init>()V: root-Branch
   * 5 org.apache.commons.collections4.comparators.NullComparator.<init>(Ljava/util/Comparator;Z)V: I17 Branch 1 IFNONNULL L116 - true
   * 6 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I3 Branch 8 IFNONNULL L170 - true
   * 7 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I10 Branch 9 IF_ACMPNE L171 - true
   * 8 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I20 Branch 10 IFNE L172 - true
   * 9 org.apache.commons.collections4.comparators.NullComparator.equals(Ljava/lang/Object;)Z: I34 Branch 11 IF_ICMPNE L176 - false
   */

  @Test
  public void test13()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(906,"org.apache.commons.collections4.comparators.NullComparatorEvoSuiteTest.test13");
      NullComparator<Integer> nullComparator0 = new NullComparator<Integer>();
      NullComparator<NullComparator<Integer>> nullComparator1 = new NullComparator<NullComparator<Integer>>(false);
      NullComparator<NullComparator<Integer>> nullComparator2 = new NullComparator<NullComparator<Integer>>((Comparator<NullComparator<Integer>>) nullComparator1);
      boolean boolean0 = nullComparator0.equals((Object) nullComparator2);
      assertEquals(false, boolean0);
  }
}
