/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.InstantiateFactory;
import org.apache.commons.collections4.functors.InvokerTransformer;
import org.apache.commons.collections4.map.LazyMap;
import org.junit.BeforeClass;

public class LazyMapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.map.LazyMap.lazyMap(Ljava/util/Map;Lorg/apache/commons/collections4/Factory;)Lorg/apache/commons/collections4/map/LazyMap;: root-Branch
   * 2 org.apache.commons.collections4.map.LazyMap.<init>(Ljava/util/Map;Lorg/apache/commons/collections4/Factory;)V: I8 Branch 1 IFNONNULL L110 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(130,"org.apache.commons.collections4.map.LazyMapEvoSuiteTest.test0");
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Class<String> class0 = String.class;
      InstantiateFactory<String> instantiateFactory0 = new InstantiateFactory<String>(class0);
      LazyMap<Integer, String> lazyMap0 = LazyMap.lazyMap((Map<Integer, String>) hashMap0, (Factory<? extends String>) instantiateFactory0);
      assertEquals("{}", lazyMap0.toString());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.map.LazyMap.<init>(Ljava/util/Map;Lorg/apache/commons/collections4/Factory;)V: I8 Branch 1 IFNONNULL L110 - false
   * 2 org.apache.commons.collections4.map.LazyMap.lazyMap(Ljava/util/Map;Lorg/apache/commons/collections4/Factory;)Lorg/apache/commons/collections4/map/LazyMap;: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(131,"org.apache.commons.collections4.map.LazyMapEvoSuiteTest.test1");
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      // Undeclared exception!
      try {
        LazyMap.lazyMap((Map<Object, String>) hashMap0, (Factory<? extends String>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factory must not be null
         //
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.map.LazyMap.<init>(Ljava/util/Map;Lorg/apache/commons/collections4/Transformer;)V: I8 Branch 2 IFNONNULL L125 - false
   * 2 org.apache.commons.collections4.map.LazyMap.lazyMap(Ljava/util/Map;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/map/LazyMap;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(132,"org.apache.commons.collections4.map.LazyMapEvoSuiteTest.test2");
      HashMap<HashMap<Integer, String>, Object> hashMap0 = new HashMap<HashMap<Integer, String>, Object>();
      // Undeclared exception!
      try {
        LazyMap.lazyMap((Map<HashMap<Integer, String>, Object>) hashMap0, (Transformer<? super HashMap<Integer, String>, ?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factory must not be null
         //
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 org.apache.commons.collections4.map.LazyMap.get(Ljava/lang/Object;)Ljava/lang/Object;: I6 Branch 3 IFGT L162 - false
   * 2 org.apache.commons.collections4.map.LazyMap.lazyMap(Ljava/util/Map;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/map/LazyMap;: root-Branch
   * 3 org.apache.commons.collections4.map.LazyMap.<init>(Ljava/util/Map;Lorg/apache/commons/collections4/Transformer;)V: I8 Branch 2 IFNONNULL L125 - true
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(133,"org.apache.commons.collections4.map.LazyMapEvoSuiteTest.test3");
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      InvokerTransformer<Object, Object> invokerTransformer0 = new InvokerTransformer<Object, Object>("Factory must not be null", (Class<?>[]) classArray0, (Object[]) classArray0);
      LazyMap<Integer, Object> lazyMap0 = LazyMap.lazyMap((Map<Integer, Object>) hashMap0, (Transformer<? super Integer, ?>) invokerTransformer0);
      assertNotNull(lazyMap0);
      
      hashMap0.toString();
      // Undeclared exception!
      try {
        lazyMap0.get((Object) "{}");
        fail("Expecting exception: FunctorException");
      
      } catch(FunctorException e) {
         //
         // InvokerTransformer: The method 'Factory must not be null' on 'class java.lang.String' does not exist
         //
      }
  }
}