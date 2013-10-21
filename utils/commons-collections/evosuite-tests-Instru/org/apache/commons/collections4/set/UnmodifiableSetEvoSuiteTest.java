/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.set;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.collections4.bag.UnmodifiableBag;
import org.apache.commons.collections4.set.UnmodifiableSet;
import org.junit.BeforeClass;

public class UnmodifiableSetEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.set.UnmodifiableSet.unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;: I4 Branch 1 IFEQ L53 - false
   * 2 org.apache.commons.collections4.set.UnmodifiableSet.unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;: I4 Branch 1 IFEQ L53 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1205,"org.apache.commons.collections4.set.UnmodifiableSetEvoSuiteTest.test0");
      LinkedHashSet<UnmodifiableBag<Integer>> linkedHashSet0 = new LinkedHashSet<UnmodifiableBag<Integer>>();
      Set<UnmodifiableBag<Integer>> set0 = UnmodifiableSet.unmodifiableSet((Set<UnmodifiableBag<Integer>>) linkedHashSet0);
      Set<UnmodifiableBag<Integer>> set1 = UnmodifiableSet.unmodifiableSet(set0);
      assertSame(set1, set0);
  }
}
