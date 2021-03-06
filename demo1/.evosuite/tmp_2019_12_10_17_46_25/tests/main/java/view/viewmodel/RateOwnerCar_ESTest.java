/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 19:11:08 GMT 2019
 */

package main.java.view.viewmodel;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.view.viewmodel.RateOwnerCar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RateOwnerCar_ESTest extends RateOwnerCar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar(0, 0);
      int int0 = rateOwnerCar0.getOwnerRate();
      assertEquals(0, int0);
      assertEquals(0, rateOwnerCar0.getCarRate());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar(1, 1);
      int int0 = rateOwnerCar0.getOwnerRate();
      assertEquals(1, int0);
      assertEquals(1, rateOwnerCar0.getCarRate());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar(0, 0);
      int int0 = rateOwnerCar0.getCarRate();
      assertEquals(0, int0);
      assertEquals(0, rateOwnerCar0.getOwnerRate());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar(1, 1);
      int int0 = rateOwnerCar0.getCarRate();
      assertEquals(1, rateOwnerCar0.getOwnerRate());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar((-1027), (-1457));
      int int0 = rateOwnerCar0.getCarRate();
      assertEquals((-1457), int0);
      assertEquals((-1027), rateOwnerCar0.getOwnerRate());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RateOwnerCar rateOwnerCar0 = new RateOwnerCar((-1027), (-1457));
      int int0 = rateOwnerCar0.getOwnerRate();
      assertEquals((-1457), rateOwnerCar0.getCarRate());
      assertEquals((-1027), int0);
  }
}
