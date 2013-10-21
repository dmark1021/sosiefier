/*
 * This file was automatically generated by EvoSuite
 */

package org.apache.commons.collections4.bidimap;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import org.apache.commons.collections4.SortedBidiMap;
import org.apache.commons.collections4.bidimap.DualLinkedHashBidiMap;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap;
import org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap;
import org.apache.commons.collections4.keyvalue.UnmodifiableMapEntry;
import org.apache.commons.collections4.map.UnmodifiableEntrySet;
import org.junit.BeforeClass;

public class UnmodifiableSortedBidiMapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(Lorg/apache/commons/collections4/SortedBidiMap;)Lorg/apache/commons/collections4/SortedBidiMap;: I4 Branch 1 IFEQ L60 - false
   * 2 org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(Lorg/apache/commons/collections4/SortedBidiMap;)Lorg/apache/commons/collections4/SortedBidiMap;: I4 Branch 1 IFEQ L60 - true
   */

  @Test
  public void test0()  throws Throwable  {
		fr.inria.diversify.sosie.logger.LogWriter.writeTestStart(1063,"org.apache.commons.collections4.bidimap.UnmodifiableSortedBidiMapEvoSuiteTest.test0");
      DualLinkedHashBidiMap<UnmodifiableEntrySet<String, Object>, UnmodifiableMapEntry<String, String>> dualLinkedHashBidiMap0 = new DualLinkedHashBidiMap<UnmodifiableEntrySet<String, Object>, UnmodifiableMapEntry<String, String>>();
      DualTreeBidiMap<UnmodifiableEntrySet<String, Object>, UnmodifiableMapEntry<String, String>> dualTreeBidiMap0 = new DualTreeBidiMap<UnmodifiableEntrySet<String, Object>, UnmodifiableMapEntry<String, String>>((Map<UnmodifiableEntrySet<String, Object>, UnmodifiableMapEntry<String, String>>) dualLinkedHashBidiMap0);
      SortedBidiMap<UnmodifiableEntrySet<String, Object>, UnmodifiableMapEntry<String, String>> sortedBidiMap0 = UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap((SortedBidiMap<UnmodifiableEntrySet<String, Object>, UnmodifiableMapEntry<String, String>>) dualTreeBidiMap0);
      SortedBidiMap<UnmodifiableEntrySet<String, Object>, UnmodifiableMapEntry<String, String>> sortedBidiMap1 = UnmodifiableSortedBidiMap.unmodifiableSortedBidiMap(sortedBidiMap0);
      assertEquals(0, sortedBidiMap1.size());
  }
}
