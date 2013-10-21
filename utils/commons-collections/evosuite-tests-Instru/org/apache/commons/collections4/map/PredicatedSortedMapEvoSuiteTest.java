/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.DefaultEquator;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.Equator;
import org.apache.commons.collections4.functors.FalsePredicate;
import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.map.PredicatedSortedMap;
import org.junit.BeforeClass;

public class PredicatedSortedMapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.map.PredicatedSortedMap.tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;: root-Branch
   * 2 org.apache.commons.collections4.map.PredicatedSortedMap.<init>(Ljava/util/SortedMap;Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   * 3 org.apache.commons.collections4.map.PredicatedSortedMap.predicatedSortedMap(Ljava/util/SortedMap;Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/map/PredicatedSortedMap;: root-Branch
   * 4 org.apache.commons.collections4.map.PredicatedSortedMap.getSortedMap()Ljava/util/SortedMap;: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(204,"org.apache.commons.collections4.map.PredicatedSortedMapEvoSuiteTest.test0");
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      hashMap0.toString();
      EqualPredicate<Object> equalPredicate0 = new EqualPredicate<Object>((Object) "{}");
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      PredicatedSortedMap<String, String> predicatedSortedMap0 = PredicatedSortedMap.predicatedSortedMap((SortedMap<String, String>) treeMap0, (Predicate<? super String>) equalPredicate0, (Predicate<? super String>) equalPredicate0);
      SortedMap<String, String> sortedMap0 = predicatedSortedMap0.tailMap("{}");
      assertEquals(0, sortedMap0.size());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.PredicatedSortedMap.comparator()Ljava/util/Comparator;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(205,"org.apache.commons.collections4.map.PredicatedSortedMapEvoSuiteTest.test1");
      TreeMap<Integer, String> treeMap0 = new TreeMap<Integer, String>();
      DefaultEquator<Object> defaultEquator0 = DefaultEquator.INSTANCE;
      EqualPredicate<Object> equalPredicate0 = new EqualPredicate<Object>((Object) "", (Equator<Object>) defaultEquator0);
      PredicatedSortedMap<Integer, String> predicatedSortedMap0 = PredicatedSortedMap.predicatedSortedMap((SortedMap<Integer, String>) treeMap0, (Predicate<? super Integer>) equalPredicate0, (Predicate<? super String>) equalPredicate0);
      Comparator<? super Integer> comparator0 = predicatedSortedMap0.comparator();
      assertNull(comparator0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.PredicatedSortedMap.lastKey()Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(206,"org.apache.commons.collections4.map.PredicatedSortedMapEvoSuiteTest.test2");
      Predicate<Object> predicate0 = FalsePredicate.INSTANCE;
      TreeMap<Integer, Integer> treeMap0 = new TreeMap<Integer, Integer>();
      PredicatedSortedMap<Integer, Integer> predicatedSortedMap0 = PredicatedSortedMap.predicatedSortedMap((SortedMap<Integer, Integer>) treeMap0, (Predicate<? super Integer>) predicate0, (Predicate<? super Integer>) predicate0);
      // Undeclared exception!
      try {
        predicatedSortedMap0.lastKey();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.PredicatedSortedMap.subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(207,"org.apache.commons.collections4.map.PredicatedSortedMapEvoSuiteTest.test3");
      Predicate<Object> predicate0 = NotNullPredicate.INSTANCE;
      TreeMap<TreeMap<Integer, String>, Object> treeMap0 = new TreeMap<TreeMap<Integer, String>, Object>();
      PredicatedSortedMap<TreeMap<Integer, String>, Object> predicatedSortedMap0 = PredicatedSortedMap.predicatedSortedMap((SortedMap<TreeMap<Integer, String>, Object>) treeMap0, (Predicate<? super TreeMap<Integer, String>>) predicate0, (Predicate<? super Object>) predicate0);
      // Undeclared exception!
      try {
        predicatedSortedMap0.subMap((TreeMap<Integer, String>) null, (TreeMap<Integer, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.map.PredicatedSortedMap.headMap(Ljava/lang/Object;)Ljava/util/SortedMap;: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(208,"org.apache.commons.collections4.map.PredicatedSortedMapEvoSuiteTest.test4");
      TreeMap<TreeMap<String, Object>, Object> treeMap0 = new TreeMap<TreeMap<String, Object>, Object>();
      Predicate<Object> predicate0 = NotNullPredicate.INSTANCE;
      PredicatedSortedMap<TreeMap<String, Object>, Object> predicatedSortedMap0 = PredicatedSortedMap.predicatedSortedMap((SortedMap<TreeMap<String, Object>, Object>) treeMap0, (Predicate<? super TreeMap<String, Object>>) predicate0, (Predicate<? super Object>) predicate0);
      // Undeclared exception!
      try {
        predicatedSortedMap0.headMap((TreeMap<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.map.PredicatedSortedMap.firstKey()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.map.PredicatedSortedMap.<init>(Ljava/util/SortedMap;Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Predicate;)V: root-Branch
   * 3 org.apache.commons.collections4.map.PredicatedSortedMap.predicatedSortedMap(Ljava/util/SortedMap;Lorg/apache/commons/collections4/Predicate;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/map/PredicatedSortedMap;: root-Branch
   * 4 org.apache.commons.collections4.map.PredicatedSortedMap.getSortedMap()Ljava/util/SortedMap;: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(209,"org.apache.commons.collections4.map.PredicatedSortedMapEvoSuiteTest.test5");
      Class<Integer> class0 = Integer.class;
      Predicate<Object> predicate0 = InstanceofPredicate.instanceOfPredicate(class0);
      TreeMap<String, Object> treeMap0 = new TreeMap<String, Object>();
      PredicatedSortedMap<String, Object> predicatedSortedMap0 = PredicatedSortedMap.predicatedSortedMap((SortedMap<String, Object>) treeMap0, (Predicate<? super String>) predicate0, (Predicate<? super Object>) predicate0);
      // Undeclared exception!
      try {
        predicatedSortedMap0.firstKey();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
