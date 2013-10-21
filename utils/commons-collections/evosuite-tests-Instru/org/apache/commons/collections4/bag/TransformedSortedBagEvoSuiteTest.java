/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.NoSuchElementException;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TransformedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.junit.BeforeClass;

public class TransformedSortedBagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 org.apache.commons.collections4.bag.TransformedSortedBag.getSortedBag()Lorg/apache/commons/collections4/SortedBag;: root-Branch
   * 2 org.apache.commons.collections4.bag.TransformedSortedBag.comparator()Ljava/util/Comparator;: root-Branch
   * 3 org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;: root-Branch
   * 4 org.apache.commons.collections4.bag.TransformedSortedBag.<init>(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1105,"org.apache.commons.collections4.bag.TransformedSortedBagEvoSuiteTest.test0");
      TreeBag<Object> treeBag0 = new TreeBag<Object>();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedSortedBag<Object> transformedSortedBag0 = TransformedSortedBag.transformingSortedBag((SortedBag<Object>) treeBag0, (Transformer<? super Object, ?>) invokerTransformer0);
      Comparator<? super Object> comparator0 = transformedSortedBag0.comparator();
      assertNull(comparator0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.bag.TransformedSortedBag.last()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.bag.TransformedSortedBag.transformingSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1106,"org.apache.commons.collections4.bag.TransformedSortedBagEvoSuiteTest.test1");
      TreeBag<Object> treeBag0 = new TreeBag<Object>();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedSortedBag<Object> transformedSortedBag0 = TransformedSortedBag.transformingSortedBag((SortedBag<Object>) treeBag0, (Transformer<? super Object, ?>) invokerTransformer0);
      // Undeclared exception!
      try {
        transformedSortedBag0.last();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * 1 org.apache.commons.collections4.bag.TransformedSortedBag.first()Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;: I11 Branch 1 IFNULL L79 - false
   * 3 org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;: I13 Branch 2 IFNULL L79 - false
   * 4 org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;: I16 Branch 3 IFLE L79 - true
   * 5 org.apache.commons.collections4.bag.TransformedSortedBag.getSortedBag()Lorg/apache/commons/collections4/SortedBag;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1107,"org.apache.commons.collections4.bag.TransformedSortedBagEvoSuiteTest.test2");
      TreeBag<Object> treeBag0 = new TreeBag<Object>();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 12);
      InvokerTransformer<Object, SynchronizedSortedBag<String>> invokerTransformer0 = new InvokerTransformer<Object, SynchronizedSortedBag<String>>("/", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedSortedBag<Object> transformedSortedBag0 = TransformedSortedBag.transformedSortedBag((SortedBag<Object>) treeBag0, (Transformer<? super Object, ?>) invokerTransformer0);
      // Undeclared exception!
      try {
        transformedSortedBag0.first();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;: I16 Branch 3 IFLE L79 - false
   * 2 org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;: I41 Branch 4 IF_ICMPGE L83 - true
   * 3 org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;: I41 Branch 4 IF_ICMPGE L83 - false
   * 4 org.apache.commons.collections4.bag.TransformedSortedBag.<init>(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   * 5 org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;: I11 Branch 1 IFNULL L79 - false
   * 6 org.apache.commons.collections4.bag.TransformedSortedBag.transformedSortedBag(Lorg/apache/commons/collections4/SortedBag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/bag/TransformedSortedBag;: I13 Branch 2 IFNULL L79 - false
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1108,"org.apache.commons.collections4.bag.TransformedSortedBagEvoSuiteTest.test3");
      TreeBag<String> treeBag0 = new TreeBag<String>((Comparator<? super String>) null);
      treeBag0.add("");
      ConstantTransformer<Object, String> constantTransformer0 = new ConstantTransformer<Object, String>("");
      TransformedSortedBag.transformedSortedBag((SortedBag<String>) treeBag0, (Transformer<? super String, ? extends String>) constantTransformer0);
      assertEquals(false, treeBag0.isEmpty());
      assertEquals("[1:]", treeBag0.toString());
  }
}
