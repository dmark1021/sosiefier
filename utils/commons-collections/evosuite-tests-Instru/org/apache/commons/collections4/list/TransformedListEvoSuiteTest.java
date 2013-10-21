/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.list;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.list.TransformedList;
import org.junit.BeforeClass;

public class TransformedListEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 8 covered goals:
   * 1 org.apache.commons.collections4.list.TransformedList$TransformedListIterator.<init>(Lorg/apache/commons/collections4/list/TransformedList;Ljava/util/ListIterator;)V: root-Branch
   * 2 org.apache.commons.collections4.list.TransformedList.listIterator()Ljava/util/ListIterator;: root-Branch
   * 3 org.apache.commons.collections4.list.TransformedList.<init>(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   * 4 org.apache.commons.collections4.list.TransformedList.getList()Ljava/util/List;: root-Branch
   * 5 org.apache.commons.collections4.list.TransformedList.listIterator(I)Ljava/util/ListIterator;: root-Branch
   * 6 org.apache.commons.collections4.list.TransformedList.transformedList(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/list/TransformedList;: I11 Branch 1 IFNULL L82 - false
   * 7 org.apache.commons.collections4.list.TransformedList.transformedList(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/list/TransformedList;: I13 Branch 2 IFNULL L82 - false
   * 8 org.apache.commons.collections4.list.TransformedList.transformedList(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/list/TransformedList;: I16 Branch 3 IFLE L82 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(381,"org.apache.commons.collections4.list.TransformedListEvoSuiteTest.test0");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ConstantTransformer<Object, Integer> constantTransformer0 = new ConstantTransformer<Object, Integer>((Integer) null);
      TransformedList<Integer> transformedList0 = TransformedList.transformedList((List<Integer>) linkedList0, (Transformer<? super Integer, ? extends Integer>) constantTransformer0);
      ListIterator<Integer> listIterator0 = transformedList0.listIterator();
      assertEquals(false, listIterator0.hasPrevious());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.list.TransformedList.add(ILjava/lang/Object;)V: root-Branch
   * 2 org.apache.commons.collections4.list.TransformedList.transformingList(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/list/TransformedList;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(382,"org.apache.commons.collections4.list.TransformedListEvoSuiteTest.test1");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 2);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("&ycT5D?k1Yi3oHU]t", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedList<Object> transformedList0 = TransformedList.transformingList((List<Object>) linkedList0, (Transformer<? super Object, ?>) invokerTransformer0);
      transformedList0.toString();
      // Undeclared exception!
      try {
        transformedList0.add(0, (Object) "[]");
        fail("Expecting exception: FunctorException");
      
      } catch(FunctorException e) {
         //
         // InvokerTransformer: The method '&ycT5D?k1Yi3oHU]t' on 'class java.lang.String' does not exist
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.list.TransformedList.lastIndexOf(Ljava/lang/Object;)I: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(383,"org.apache.commons.collections4.list.TransformedListEvoSuiteTest.test2");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 2);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("&ycT5D?k1Yi3oHU]t", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedList<Object> transformedList0 = TransformedList.transformingList((List<Object>) linkedList0, (Transformer<? super Object, ?>) invokerTransformer0);
      int int0 = transformedList0.lastIndexOf((Object) linkedList0);
      assertEquals((-1), int0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.list.TransformedList.set(ILjava/lang/Object;)Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(384,"org.apache.commons.collections4.list.TransformedListEvoSuiteTest.test3");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 7);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("'", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedList<Integer> transformedList0 = TransformedList.transformingList((List<Integer>) linkedList0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0);
      // Undeclared exception!
      try {
        transformedList0.set((-178), (Integer) (-178));
        fail("Expecting exception: FunctorException");
      
      } catch(FunctorException e) {
         //
         // InvokerTransformer: The method ''' on 'class java.lang.Integer' does not exist
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.list.TransformedList.indexOf(Ljava/lang/Object;)I: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(385,"org.apache.commons.collections4.list.TransformedListEvoSuiteTest.test4");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 2);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("&ycT5D?k1Yi3oHU]t", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedList<Object> transformedList0 = TransformedList.transformingList((List<Object>) linkedList0, (Transformer<? super Object, ?>) invokerTransformer0);
      transformedList0.toString();
      int int0 = transformedList0.indexOf((Object) "[]");
      assertEquals((-1), int0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.list.TransformedList.subList(II)Ljava/util/List;: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(386,"org.apache.commons.collections4.list.TransformedListEvoSuiteTest.test5");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 7);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedList<Integer> transformedList0 = TransformedList.transformingList((List<Integer>) linkedList0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0);
      // Undeclared exception!
      try {
        transformedList0.subList(759, 759);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 759
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.list.TransformedList.addAll(ILjava/util/Collection;)Z: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(387,"org.apache.commons.collections4.list.TransformedListEvoSuiteTest.test6");
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 7);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedList<Object> transformedList0 = TransformedList.transformingList((List<Object>) linkedList0, (Transformer<? super Object, ?>) invokerTransformer0);
      // Undeclared exception!
      try {
        transformedList0.addAll((-436), (Collection<?>) linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -436, Size: 0
         //
      }
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.list.TransformedList.remove(I)Ljava/lang/Object;: root-Branch
   * 2 org.apache.commons.collections4.list.TransformedList.transformingList(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/list/TransformedList;: root-Branch
   * 3 org.apache.commons.collections4.list.TransformedList.getList()Ljava/util/List;: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(388,"org.apache.commons.collections4.list.TransformedListEvoSuiteTest.test7");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 7);
      InvokerTransformer<Object, Integer> invokerTransformer0 = new InvokerTransformer<Object, Integer>("", (Class<?>[]) classArray0, (Object[]) classArray0);
      TransformedList<Integer> transformedList0 = TransformedList.transformingList((List<Integer>) linkedList0, (Transformer<? super Integer, ? extends Integer>) invokerTransformer0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>((Collection<?>) transformedList0);
      TransformedList<Object> transformedList1 = TransformedList.transformingList((List<Object>) linkedList1, (Transformer<? super Object, ?>) invokerTransformer0);
      // Undeclared exception!
      try {
        transformedList1.remove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }

  //Test case number: 8
  /*
   * 6 covered goals:
   * 1 org.apache.commons.collections4.list.TransformedList.transformedList(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/list/TransformedList;: I16 Branch 3 IFLE L82 - false
   * 2 org.apache.commons.collections4.list.TransformedList.transformedList(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/list/TransformedList;: I41 Branch 4 IF_ICMPGE L86 - true
   * 3 org.apache.commons.collections4.list.TransformedList.transformedList(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/list/TransformedList;: I41 Branch 4 IF_ICMPGE L86 - false
   * 4 org.apache.commons.collections4.list.TransformedList.<init>(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   * 5 org.apache.commons.collections4.list.TransformedList.transformedList(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/list/TransformedList;: I11 Branch 1 IFNULL L82 - false
   * 6 org.apache.commons.collections4.list.TransformedList.transformedList(Ljava/util/List;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/list/TransformedList;: I13 Branch 2 IFNULL L82 - false
   */

  @Test
  public void test8()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(389,"org.apache.commons.collections4.list.TransformedListEvoSuiteTest.test8");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) null);
      ConstantTransformer<Object, Integer> constantTransformer0 = new ConstantTransformer<Object, Integer>((Integer) null);
      TransformedList.transformedList((List<Integer>) linkedList0, (Transformer<? super Integer, ? extends Integer>) constantTransformer0);
      assertEquals(1, linkedList0.size());
      assertEquals(false, linkedList0.isEmpty());
  }
}
