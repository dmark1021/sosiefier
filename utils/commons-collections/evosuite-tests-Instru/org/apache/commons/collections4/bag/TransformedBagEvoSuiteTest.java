/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.bag.CompliantBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TransformedBag;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.junit.BeforeClass;

public class TransformedBagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.bag.TransformedBag.add(Ljava/lang/Object;I)Z: root-Branch
   * 2 org.apache.commons.collections4.bag.TransformedBag.getBag()Lorg/apache/commons/collections4/Bag;: root-Branch
   * 3 org.apache.commons.collections4.bag.TransformedBag.<init>(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   * 4 org.apache.commons.collections4.bag.TransformedBag.transformedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;: I11 Branch 1 IFNULL L78 - false
   * 5 org.apache.commons.collections4.bag.TransformedBag.transformedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;: I13 Branch 2 IFNULL L78 - false
   * 6 org.apache.commons.collections4.bag.TransformedBag.transformedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;: I16 Branch 3 IFLE L78 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1101,"org.apache.commons.collections4.bag.TransformedBagEvoSuiteTest.test0");
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      HashBag<SynchronizedSortedBag<String>> hashBag1 = new HashBag<SynchronizedSortedBag<String>>();
      ConstantTransformer<Object, Object> constantTransformer0 = new ConstantTransformer<Object, Object>((Object) hashBag1);
      HashBag<Object> hashBag2 = new HashBag<Object>((Collection<?>) hashBag0);
      HashBag<?> hashBag3 = (HashBag<?>)constantTransformer0.getConstant();
      Bag<Object> bag0 = TransformedBag.transformedBag((Bag<Object>) hashBag2, (Transformer<? super Object, ?>) constantTransformer0);
      CompliantBag<Object> compliantBag0 = new CompliantBag<Object>(bag0);
      compliantBag0.add((Object) hashBag3);
      assertEquals(1, bag0.size());
      assertEquals(false, compliantBag0.isEmpty());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.bag.TransformedBag.transformingBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1102,"org.apache.commons.collections4.bag.TransformedBagEvoSuiteTest.test1");
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      HashBag<SynchronizedSortedBag<String>> hashBag1 = new HashBag<SynchronizedSortedBag<String>>();
      ConstantTransformer<Object, Object> constantTransformer0 = new ConstantTransformer<Object, Object>((Object) hashBag1);
      HashBag<Object> hashBag2 = new HashBag<Object>((Collection<?>) hashBag0);
      Bag<Object> bag0 = TransformedBag.transformingBag((Bag<Object>) hashBag2, (Transformer<? super Object, ?>) constantTransformer0);
      assertEquals(0, bag0.size());
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.bag.TransformedBag.remove(Ljava/lang/Object;I)Z: root-Branch
   * 2 org.apache.commons.collections4.bag.TransformedBag.getBag()Lorg/apache/commons/collections4/Bag;: root-Branch
   * 3 org.apache.commons.collections4.bag.TransformedBag.transformedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;: I16 Branch 3 IFLE L78 - true
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1103,"org.apache.commons.collections4.bag.TransformedBagEvoSuiteTest.test2");
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      HashBag<SynchronizedSortedBag<String>> hashBag1 = new HashBag<SynchronizedSortedBag<String>>();
      ConstantTransformer<Object, Object> constantTransformer0 = new ConstantTransformer<Object, Object>((Object) hashBag1);
      HashBag<Object> hashBag2 = new HashBag<Object>((Collection<?>) hashBag0);
      HashBag<?> hashBag3 = (HashBag<?>)constantTransformer0.getConstant();
      Bag<Object> bag0 = TransformedBag.transformedBag((Bag<Object>) hashBag2, (Transformer<? super Object, ?>) constantTransformer0);
      CompliantBag<Object> compliantBag0 = new CompliantBag<Object>(bag0);
      boolean boolean0 = compliantBag0.remove((Object) hashBag3);
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.bag.TransformedBag.transformedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;: I16 Branch 3 IFLE L78 - false
   * 2 org.apache.commons.collections4.bag.TransformedBag.transformedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;: I41 Branch 4 IF_ICMPGE L82 - true
   * 3 org.apache.commons.collections4.bag.TransformedBag.transformedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;: I41 Branch 4 IF_ICMPGE L82 - false
   * 4 org.apache.commons.collections4.bag.TransformedBag.<init>(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   * 5 org.apache.commons.collections4.bag.TransformedBag.transformedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;: I11 Branch 1 IFNULL L78 - false
   * 6 org.apache.commons.collections4.bag.TransformedBag.transformedBag(Lorg/apache/commons/collections4/Bag;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Bag;: I13 Branch 2 IFNULL L78 - false
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1104,"org.apache.commons.collections4.bag.TransformedBagEvoSuiteTest.test3");
      HashBag<Integer> hashBag0 = new HashBag<Integer>();
      CompliantBag<Integer> compliantBag0 = new CompliantBag<Integer>((Bag<Integer>) hashBag0);
      HashBag<SynchronizedSortedBag<String>> hashBag1 = new HashBag<SynchronizedSortedBag<String>>();
      compliantBag0.add((Integer) null);
      ConstantTransformer<Object, Object> constantTransformer0 = new ConstantTransformer<Object, Object>((Object) hashBag1);
      HashBag<Object> hashBag2 = new HashBag<Object>((Collection<?>) hashBag0);
      TransformedBag.transformedBag((Bag<Object>) hashBag2, (Transformer<? super Object, ?>) constantTransformer0);
      assertEquals("[1:[]]", hashBag2.toString());
  }
}
