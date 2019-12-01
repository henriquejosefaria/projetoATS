/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 29 10:57:11 GMT 2019
 */

package model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import model.CarModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CarModel_ESTest extends CarModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      CarModel carModel0 = new CarModel(carModel_CarType0, 1812.082192122, (String) null);
      CarModel carModel1 = new CarModel(carModel_CarType0, 2505.173, "Todos");
      boolean boolean0 = carModel0.equals(carModel1);
      assertFalse(boolean0);
      assertEquals(2505.173, carModel1.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      CarModel carModel0 = new CarModel(carModel_CarType0, 1812.082192122, (String) null);
      carModel0.getType();
      assertEquals(1812.082192122, carModel0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      CarModel carModel0 = new CarModel(carModel_CarType0, (-2805.2754), ";Zg/k}M|PU\"j");
      carModel0.getBrand();
      assertEquals((-2805.2754), carModel0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      CarModel carModel0 = new CarModel(carModel_CarType0, 3088.862510304, "");
      carModel0.getBrand();
      assertEquals(3088.862510304, carModel0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      CarModel carModel0 = new CarModel(carModel_CarType0, 0.0, "?tIVl|zw31`&FFLI^Ap");
      double double0 = carModel0.getAvgSpeed();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      CarModel carModel0 = new CarModel(carModel_CarType0, (-2288.9892245), "");
      double double0 = carModel0.getAvgSpeed();
      assertEquals((-2288.9892245), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      try { 
        CarModel.CarType.fromString("CF!qvTh4`%;!CO");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("model.CarModel$CarType", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.fromString("Electrico");
      assertEquals(CarModel.CarType.ELECTRIC, carModel_CarType0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.fromString("Todos");
      assertEquals(CarModel.CarType.ANY, carModel_CarType0);
      
      CarModel.CarType carModel_CarType1 = CarModel.CarType.HYBRID;
      boolean boolean0 = carModel_CarType0.isEqual(carModel_CarType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.fromString("Gasolina");
      assertEquals(CarModel.CarType.GAS, carModel_CarType0);
      
      CarModel.CarType carModel_CarType1 = CarModel.CarType.ANY;
      boolean boolean0 = carModel_CarType0.isEqual(carModel_CarType1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      boolean boolean0 = carModel_CarType0.isEqual(carModel_CarType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      CarModel.CarType carModel_CarType1 = CarModel.CarType.GAS;
      CarModel carModel0 = new CarModel(carModel_CarType1, 5.1307855896761, "main.java.exctiofs.U3kn(wnCarTypeException");
      CarModel carModel1 = new CarModel(carModel_CarType0, 5.1307855896761, "main.java.exctiofs.U3kn(wnCarTypeException");
      boolean boolean0 = carModel0.equals(carModel1);
      assertFalse(boolean0);
      assertEquals(5.1307855896761, carModel1.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      CarModel carModel0 = new CarModel(carModel_CarType0, 0.0, "");
      CarModel carModel1 = new CarModel(carModel_CarType0, 0.0, "");
      boolean boolean0 = carModel0.equals(carModel1);
      assertEquals(0.0, carModel1.getAvgSpeed(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      CarModel carModel0 = new CarModel(carModel_CarType0, 167.76916066750144, "5Q16OD|Q5=A");
      CarModel carModel1 = new CarModel(carModel_CarType0, 167.76916066750144, "TU(<OU}0G@G");
      boolean boolean0 = carModel0.equals(carModel1);
      assertFalse(boolean0);
      assertEquals(167.76916066750144, carModel1.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CarModel carModel0 = new CarModel((CarModel.CarType) null, 5.0, (String) null);
      CarModel carModel1 = new CarModel((CarModel.CarType) null, 5.0, (String) null);
      // Undeclared exception!
      try { 
        carModel0.equals(carModel1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.fromString("Hibrido");
      assertEquals(CarModel.CarType.HYBRID, carModel_CarType0);
      
      CarModel carModel0 = new CarModel(carModel_CarType0, (-2749.0), "Hibrido");
      boolean boolean0 = carModel0.equals(carModel_CarType0);
      assertFalse(boolean0);
      assertEquals((-2749.0), carModel0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      CarModel carModel0 = new CarModel(carModel_CarType0, 355.282, "F?]R%c");
      CarModel carModel1 = new CarModel(carModel_CarType0, (-2542.67307098), "F?]R%c");
      boolean boolean0 = carModel0.equals(carModel1);
      assertEquals((-2542.67307098), carModel1.getAvgSpeed(), 0.01);
      assertFalse(boolean0);
      assertFalse(carModel1.equals((Object)carModel0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CarModel carModel0 = new CarModel((CarModel.CarType) null, 5.0, (String) null);
      boolean boolean0 = carModel0.equals(carModel0);
      assertEquals(5.0, carModel0.getAvgSpeed(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      CarModel carModel0 = new CarModel(carModel_CarType0, 355.282, "F?]R%c");
      boolean boolean0 = carModel0.equals((Object) null);
      assertEquals(355.282, carModel0.getAvgSpeed(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      CarModel carModel0 = new CarModel(carModel_CarType0, 355.282, "F?]R%c");
      double double0 = carModel0.getAvgSpeed();
      assertEquals(355.282, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CarModel carModel0 = new CarModel((CarModel.CarType) null, 5.0, (String) null);
      carModel0.getType();
      assertEquals(5.0, carModel0.getAvgSpeed(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      CarModel carModel0 = new CarModel(carModel_CarType0, 102.7673933, (String) null);
      carModel0.getBrand();
      assertEquals(102.7673933, carModel0.getAvgSpeed(), 0.01);
  }
}
