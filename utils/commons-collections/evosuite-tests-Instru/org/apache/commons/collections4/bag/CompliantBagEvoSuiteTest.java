/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.CompliantBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.junit.BeforeClass;

public class CompliantBagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.bag.CompliantBag.compliantBag(Lorg/apache/commons/collections4/Bag;)Lorg/apache/commons/collections4/Bag;: root-Branch
   * 2 org.apache.commons.collections4.bag.CompliantBag.<init>(Lorg/apache/commons/collections4/Bag;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1076,"org.apache.commons.collections4.bag.CompliantBagEvoSuiteTest.test0");
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>((Collection<? extends Integer>) hashBag0);
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) treeBag0);
      Bag<Integer> bag0 = CompliantBag.compliantBag((Bag<Integer>) compliantBag0);
      assertEquals(0, bag0.size());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.bag.CompliantBag.remove(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1077,"org.apache.commons.collections4.bag.CompliantBagEvoSuiteTest.test1");
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) treeBag0);
      Object object0 = new Object();
      // Undeclared exception!
      try {
        compliantBag0.remove(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Comparable
         //
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.bag.CompliantBag.containsAll(Ljava/util/Collection;)Z: I9 Branch 1 IFEQ L96 - false
   * 2 org.apache.commons.collections4.bag.CompliantBag.containsAll(Ljava/util/Collection;)Z: I16 Branch 2 IFNE L97 - false
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1078,"org.apache.commons.collections4.bag.CompliantBagEvoSuiteTest.test2");
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>((Collection<? extends Integer>) hashBag0);
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) treeBag0);
      compliantBag0.size();
      hashBag0.add((Integer) 0);
      boolean boolean0 = compliantBag0.containsAll((Collection<?>) hashBag0);
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.bag.CompliantBag.containsAll(Ljava/util/Collection;)Z: I16 Branch 2 IFNE L97 - true
   * 2 org.apache.commons.collections4.bag.CompliantBag.containsAll(Ljava/util/Collection;)Z: I9 Branch 1 IFEQ L96 - true
   * 3 org.apache.commons.collections4.bag.CompliantBag.containsAll(Ljava/util/Collection;)Z: I9 Branch 1 IFEQ L96 - false
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1079,"org.apache.commons.collections4.bag.CompliantBagEvoSuiteTest.test3");
      TreeBag<String> treeBag0 = new TreeBag<String>();
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) hashBag0);
      compliantBag0.toString();
      treeBag0.add("[]");
      CompliantBag<String> compliantBag1 = new CompliantBag<String>((Bag<String>) treeBag0);
      HashBag<Object> hashBag1 = new HashBag<Object>((Collection<?>) compliantBag1);
      CompliantBag<Object> compliantBag2 = new CompliantBag<Object>((Bag<Object>) hashBag1);
      boolean boolean0 = compliantBag1.containsAll((Collection<?>) compliantBag2);
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 7 covered goals:
   * 1 org.apache.commons.collections4.bag.CompliantBag.addAll(Ljava/util/Collection;)Z: I25 Branch 4 IFNE L115 - true
   * 2 org.apache.commons.collections4.bag.CompliantBag.addAll(Ljava/util/Collection;)Z: I13 Branch 3 IFEQ L113 - true
   * 3 org.apache.commons.collections4.bag.CompliantBag.addAll(Ljava/util/Collection;)Z: I13 Branch 3 IFEQ L113 - false
   * 4 org.apache.commons.collections4.bag.CompliantBag.addAll(Ljava/util/Collection;)Z: I25 Branch 4 IFNE L115 - false
   * 5 org.apache.commons.collections4.bag.CompliantBag.addAll(Ljava/util/Collection;)Z: I27 Branch 5 IFEQ L115 - false
   * 6 org.apache.commons.collections4.bag.CompliantBag.add(Ljava/lang/Object;I)Z: root-Branch
   * 7 org.apache.commons.collections4.bag.CompliantBag.add(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1080,"org.apache.commons.collections4.bag.CompliantBagEvoSuiteTest.test4");
      TreeBag<String> treeBag0 = new TreeBag<String>();
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) hashBag0);
      compliantBag0.toString();
      treeBag0.add("[]");
      CompliantBag<String> compliantBag1 = new CompliantBag<String>((Bag<String>) treeBag0);
      HashBag<Object> hashBag1 = new HashBag<Object>((Collection<?>) compliantBag1);
      CompliantBag<Object> compliantBag2 = new CompliantBag<Object>((Bag<Object>) hashBag1);
      compliantBag1.add("[]");
      boolean boolean0 = compliantBag2.addAll((Collection<?>) treeBag0);
      assertEquals(2, treeBag0.size());
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I7 Branch 6 IFNULL L128 - true
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1081,"org.apache.commons.collections4.bag.CompliantBagEvoSuiteTest.test5");
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) hashBag0);
      boolean boolean0 = compliantBag0.removeAll((Collection<?>) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 8 covered goals:
   * 1 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I35 Branch 8 IFNE L133 - true
   * 2 org.apache.commons.collections4.bag.CompliantBag.add(Ljava/lang/Object;I)Z: root-Branch
   * 3 org.apache.commons.collections4.bag.CompliantBag.add(Ljava/lang/Object;)Z: root-Branch
   * 4 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I37 Branch 9 IFEQ L133 - false
   * 5 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I7 Branch 6 IFNULL L128 - false
   * 6 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I17 Branch 7 IFEQ L130 - true
   * 7 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I17 Branch 7 IFEQ L130 - false
   * 8 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I35 Branch 8 IFNE L133 - false
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1082,"org.apache.commons.collections4.bag.CompliantBagEvoSuiteTest.test6");
      TreeBag<String> treeBag0 = new TreeBag<String>();
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) hashBag0);
      compliantBag0.toString();
      treeBag0.add("[]");
      treeBag0.getCount((Object) "[]");
      TreeBag<Integer> treeBag1 = new TreeBag<Integer>();
      compliantBag0.add((Integer) 1, 1);
      CompliantBag<Integer> compliantBag1 = new CompliantBag<Integer>((Bag<Integer>) treeBag1);
      treeBag1.add((Integer) 1);
      compliantBag1.add((Integer) 1);
      boolean boolean0 = compliantBag0.removeAll((Collection<?>) compliantBag1);
      assertEquals("[2:1]", treeBag1.toString());
      assertEquals(true, boolean0);
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * 1 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I37 Branch 9 IFEQ L133 - true
   * 2 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I7 Branch 6 IFNULL L128 - false
   * 3 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I17 Branch 7 IFEQ L130 - true
   * 4 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I17 Branch 7 IFEQ L130 - false
   * 5 org.apache.commons.collections4.bag.CompliantBag.removeAll(Ljava/util/Collection;)Z: I35 Branch 8 IFNE L133 - false
   */

  @Test
  public void test7()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1083,"org.apache.commons.collections4.bag.CompliantBagEvoSuiteTest.test7");
      TreeBag<String> treeBag0 = new TreeBag<String>();
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) hashBag0);
      treeBag0.add("E:Yi's4t");
      boolean boolean0 = compliantBag0.removeAll((Collection<?>) treeBag0);
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.bag.CompliantBag.retainAll(Ljava/util/Collection;)Z: I13 Branch 10 IFEQ L143 - false
   * 2 org.apache.commons.collections4.bag.CompliantBag.retainAll(Ljava/util/Collection;)Z: I20 Branch 11 IFGT L144 - true
   * 3 org.apache.commons.collections4.bag.CompliantBag.retainAll(Ljava/util/Collection;)Z: I13 Branch 10 IFEQ L143 - true
   */

  @Test
  public void test8()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1084,"org.apache.commons.collections4.bag.CompliantBagEvoSuiteTest.test8");
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>((Collection<? extends Integer>) hashBag0);
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) treeBag0);
      compliantBag0.size();
      hashBag0.add((Integer) 0);
      CompliantBag<Integer> compliantBag1 = new CompliantBag<Integer>((Bag<Integer>) hashBag0);
      boolean boolean0 = compliantBag1.retainAll((Collection<?>) hashBag0);
      assertEquals(false, hashBag0.isEmpty());
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.bag.CompliantBag.retainAll(Ljava/util/Collection;)Z: I20 Branch 11 IFGT L144 - false
   * 2 org.apache.commons.collections4.bag.CompliantBag.<init>(Lorg/apache/commons/collections4/Bag;)V: root-Branch
   * 3 org.apache.commons.collections4.bag.CompliantBag.retainAll(Ljava/util/Collection;)Z: I13 Branch 10 IFEQ L143 - true
   * 4 org.apache.commons.collections4.bag.CompliantBag.retainAll(Ljava/util/Collection;)Z: I13 Branch 10 IFEQ L143 - false
   */

  @Test
  public void test9()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1085,"org.apache.commons.collections4.bag.CompliantBagEvoSuiteTest.test9");
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>((Collection<? extends Integer>) hashBag0);
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) treeBag0);
      compliantBag0.size();
      hashBag0.add((Integer) 0);
      CompliantBag<Integer> compliantBag1 = new CompliantBag<Integer>((Bag<Integer>) hashBag0);
      boolean boolean0 = compliantBag1.retainAll((Collection<?>) compliantBag0);
      assertEquals("[]", compliantBag1.toString());
      assertEquals(true, boolean0);
  }
}
