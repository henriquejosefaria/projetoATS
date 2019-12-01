/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 21 22:30:29 GMT 2019
 */

package main.java.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import main.java.model.Weather;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Weather_ESTest extends Weather_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random.setNextRandom(5641);
      System.setCurrentTimeMillis(572L);
      Weather weather0 = new Weather();
      double double0 = weather0.getSeasonDelay();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Weather weather0 = new Weather();
      Random.setNextRandom(2147483645);
      double double0 = weather0.getSeasonDelay();
      assertEquals(0.2, double0, 0.01);
      
      weather0.getSeasonDelay();
      weather0.getSeasonDelay();
      double double1 = weather0.getSeasonDelay();
      assertEquals((-0.20000000000000007), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Weather weather0 = new Weather();
      System.setCurrentTimeMillis((-1387));
      // Undeclared exception!
      try { 
        weather0.getSeasonDelay();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("main.java.model.Weather", e);
      }
  }
}
