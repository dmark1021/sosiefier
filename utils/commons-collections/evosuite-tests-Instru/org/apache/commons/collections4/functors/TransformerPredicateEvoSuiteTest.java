/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.apache.commons.collections4.functors.FactoryTransformer;
import org.apache.commons.collections4.functors.TransformerPredicate;
import org.junit.BeforeClass;

public class TransformerPredicateEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.functors.TransformerPredicate.getTransformer()Lorg/apache/commons/collections4/Transformer;: root-Branch
   * 2 org.apache.commons.collections4.functors.TransformerPredicate.<init>(Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(837,"org.apache.commons.collections4.functors.TransformerPredicateEvoSuiteTest.test0");
      TransformerPredicate<Object> transformerPredicate0 = new TransformerPredicate<Object>((Transformer<? super Object, Boolean>) null);
      Transformer<? super Object, Boolean> transformer0 = transformerPredicate0.getTransformer();
      assertNull(transformer0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.functors.TransformerPredicate.transformerPredicate(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Predicate;: I3 Branch 1 IFNONNULL L48 - true
   */

  @Test
  public void test1()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(838,"org.apache.commons.collections4.functors.TransformerPredicateEvoSuiteTest.test1");
      Boolean boolean0 = new Boolean(true);
      ConstantFactory<Boolean> constantFactory0 = new ConstantFactory<Boolean>(boolean0);
      FactoryTransformer<Object, Boolean> factoryTransformer0 = new FactoryTransformer<Object, Boolean>((Factory<? extends Boolean>) constantFactory0);
      Predicate<Object> predicate0 = TransformerPredicate.transformerPredicate((Transformer<? super Object, Boolean>) factoryTransformer0);
      assertNotNull(predicate0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.functors.TransformerPredicate.transformerPredicate(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/Predicate;: I3 Branch 1 IFNONNULL L48 - false
   */

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(839,"org.apache.commons.collections4.functors.TransformerPredicateEvoSuiteTest.test2");
      try {
        TransformerPredicate.transformerPredicate((Transformer<? super Object, Boolean>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The transformer to call must not be null
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 org.apache.commons.collections4.functors.TransformerPredicate.evaluate(Ljava/lang/Object;)Z: I11 Branch 2 IFNONNULL L74 - true
   */

  @Test
  public void test3()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(840,"org.apache.commons.collections4.functors.TransformerPredicateEvoSuiteTest.test3");
      Boolean boolean0 = new Boolean(true);
      ConstantFactory<Boolean> constantFactory0 = new ConstantFactory<Boolean>(boolean0);
      FactoryTransformer<Object, Boolean> factoryTransformer0 = new FactoryTransformer<Object, Boolean>((Factory<? extends Boolean>) constantFactory0);
      TransformerPredicate<Object> transformerPredicate0 = new TransformerPredicate<Object>((Transformer<? super Object, Boolean>) factoryTransformer0);
      boolean boolean1 = transformerPredicate0.evaluate((Object) boolean0);
      assertEquals(true, boolean1);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.functors.TransformerPredicate.evaluate(Ljava/lang/Object;)Z: I11 Branch 2 IFNONNULL L74 - false
   * 2 org.apache.commons.collections4.functors.TransformerPredicate.<init>(Lorg/apache/commons/collections4/Transformer;)V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(841,"org.apache.commons.collections4.functors.TransformerPredicateEvoSuiteTest.test4");
      ConstantTransformer<Object, Boolean> constantTransformer0 = new ConstantTransformer<Object, Boolean>((Boolean) null);
      TransformerPredicate<Integer> transformerPredicate0 = new TransformerPredicate<Integer>((Transformer<? super Integer, Boolean>) constantTransformer0);
      // Undeclared exception!
      try {
        transformerPredicate0.evaluate((Integer) null);
        fail("Expecting exception: FunctorException");
      
      } catch(FunctorException e) {
         //
         // Transformer must return an instanceof Boolean, it was a null object
         //
      }
  }
}
