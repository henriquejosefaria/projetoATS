/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 19:03:08 GMT 2019
 */

package main.java.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.SecureRandom;
import main.java.model.Traffic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Traffic_ESTest extends Traffic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Traffic traffic0 = new Traffic();
      traffic0.getTraficDelay(0.0);
      double double0 = traffic0.getTraficDelay(0.0);
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Traffic traffic0 = new Traffic();
      double double0 = traffic0.getTraficDelay((-1.0));
      assertEquals((-0.19999999999999996), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Traffic traffic0 = new Traffic();
      SecureRandom secureRandom0 = SecureRandom.getInstanceStrong();
      traffic0.b = secureRandom0;
      traffic0.b = null;
      // Undeclared exception!
      try { 
        traffic0.getTraficDelay((-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Traffic", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      System.setCurrentTimeMillis(3325);
      Traffic traffic0 = new Traffic();
      double double0 = traffic0.getTraficDelay(3325);
      assertEquals(0.19999999999981544, double0, 0.01);
  }
}
