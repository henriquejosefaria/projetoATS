/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 18:51:24 GMT 2019
 */

package main.java.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import main.java.model.Car;
import main.java.model.CarModel;
import main.java.model.Cars;
import main.java.model.Owner;
import main.java.utils.Point;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Cars_ESTest extends Cars_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Cars cars0 = new Cars();
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      Double double0 = new Double(990.0);
      Point point0 = new Point(double0, double0);
      Point point1 = point0.myclone();
      try { 
        cars0.getCar(point1, point0, (-1.0), carModel_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double((-2278.599466851313));
      Point point0 = new Point(double0, double0);
      Point point1 = point0.myclone();
      CarModel.CarType carModel_CarType0 = CarModel.CarType.GAS;
      try { 
        cars0.getCar("MaisPerto", point1, point0, carModel_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("059v", "\"=%'f1+max]c", "S;3]M^|", 0, "059v");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.GAS;
      CarModel carModel0 = new CarModel(carModel_CarType0, 0, "O~)");
      Car car0 = new Car("059v", owner0, carModel0, (-960.00076824), (-960.00076824), 0, (Point) null);
      cars0.addCar(car0);
      List<Car> list0 = cars0.listOfCarType(carModel_CarType0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Cars cars0 = new Cars();
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      Owner owner0 = new Owner("sD_zt!/(`X@&}", " -> ", "", (-2237), "main.java.model.Cars");
      CarModel carModel0 = new CarModel(carModel_CarType0, (-2237), " -> ");
      Double double0 = new Double((-1277.598096));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("sD_zt!/(`X@&}", owner0, carModel0, (-2237), (-2924.94472), 4123, point0);
      cars0.addCar(car0);
      Car car1 = cars0.getCar(point0, 2.0, carModel_CarType0);
      assertEquals(CarModel.CarType.ANY, car1.getType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Cars cars0 = new Cars();
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      Double double0 = new Double((-2715.8218858136147));
      Point point0 = new Point(double0, double0);
      Owner owner0 = new Owner("CB'", "MaisBarato", "", 1, "CB'");
      CarModel carModel0 = new CarModel(carModel_CarType0, 1, "");
      Car car0 = new Car("MaisPerto", owner0, carModel0, (-2715.8218858136147), (-2715.8218858136147), 1, point0);
      cars0.addCar(car0);
      Car car1 = cars0.getCar("MaisPerto", point0, point0, carModel_CarType0);
      assertSame(car1, car0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double((-2900.91221));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, (Owner) null, (CarModel) null, (-957.12955903), (-957.12955903), 2, point0);
      cars0.addCar(car0);
      // Undeclared exception!
      try { 
        cars0.myclone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner((String) null, (String) null, (String) null, (-1325), (String) null);
      CarModel.CarType carModel_CarType0 = null;
      CarModel carModel0 = new CarModel((CarModel.CarType) null, (-1325), (String) null);
      Double double0 = new Double((-1325));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, carModel0, (-1325), (-1325), (-1325), point0);
      cars0.addCar(car0);
      // Undeclared exception!
      try { 
        cars0.listOfCarType(carModel_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("q", "q", "", 0, "Zo4~10");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.GAS;
      CarModel carModel0 = new CarModel(carModel_CarType0, 0, "Zo4~10");
      Car car0 = new Car("Zo4~10", owner0, carModel0, (-511.5), (-511.5), 0, (Point) null);
      cars0.addCar(car0);
      // Undeclared exception!
      try { 
        cars0.getCar((Point) null, (Point) null, 0, carModel_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("Dono:           ", "Dono:           ", "L:MO. [8^Lzv", 991, "L:MO. [8^Lzv");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      CarModel carModel0 = new CarModel(carModel_CarType0, (-1247.69537183), "Dono:           ");
      Double double0 = new Double(492.0321573533972);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("L:MO. [8^Lzv", owner0, carModel0, 991, 492.0321573533972, 991, point0);
      cars0.addCar(car0);
      // Undeclared exception!
      try { 
        cars0.getCar((Point) null, (-1446.669734), carModel_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.utils.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(975.90764437);
      Point point0 = new Point(double0, double0);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      // Undeclared exception!
      try { 
        cars0.getCar((String) null, point0, point0, carModel_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Cars cars0 = new Cars();
      // Undeclared exception!
      try { 
        cars0.addCar((Car) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Cars cars0 = new Cars();
      Cars cars1 = new Cars();
      boolean boolean0 = cars1.equals(cars0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Cars cars0 = new Cars();
      boolean boolean0 = cars0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Cars cars0 = new Cars();
      boolean boolean0 = cars0.equals(cars0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Cars cars0 = new Cars();
      Object object0 = new Object();
      boolean boolean0 = cars0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      Double double0 = new Double(2082.065959646003);
      Point point0 = new Point(double0, double0);
      Cars cars0 = new Cars();
      try { 
        cars0.getCar("MaisBarato", point0, (Point) null, carModel_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Cars cars0 = new Cars();
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      Double double0 = new Double((-1277.598096));
      Point point0 = new Point(double0, double0);
      try { 
        cars0.getCar("MaiBarato", point0, point0, carModel_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Cars cars0 = new Cars();
      try { 
        cars0.searchCar("GAS");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("_", (String) null, ";3G&-(-9JgkGq@_", 0, "_");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      CarModel carModel0 = new CarModel(carModel_CarType0, 990.0, ";3G&-(-9JgkGq@_");
      Double double0 = new Double(990.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, carModel0, 990.0, 0.0, 0, point0);
      cars0.addCar(car0);
      Car car1 = cars0.searchCar((String) null);
      assertEquals(CarModel.CarType.ANY, car1.getType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Cars cars0 = new Cars();
      Owner owner0 = new Owner("q", "q", "", 0, "");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.GAS;
      CarModel carModel0 = new CarModel(carModel_CarType0, 0, "");
      Car car0 = new Car("Zo4~10", owner0, carModel0, (-511.5), 0.0, 0, (Point) null);
      cars0.addCar(car0);
      try { 
        cars0.addCar(car0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(2616.08232);
      Point point0 = new Point(double0, double0);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      Owner owner0 = new Owner("s}H", "s}H", "s}H", 1, "9aiBaratlo");
      CarModel carModel0 = new CarModel(carModel_CarType0, 980.902302605, "main.java.model.Cars");
      Car car0 = new Car("9aiBaratlo", owner0, carModel0, (-1247.69537183), (-1247.69537183), 1, point0);
      cars0.addCar(car0);
      Car car1 = cars0.getCar(point0, point0, 2.0, carModel_CarType0);
      assertSame(car1, car0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Cars cars0 = new Cars();
      cars0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Cars cars0 = new Cars();
      Cars cars1 = cars0.myclone();
      assertTrue(cars1.equals((Object)cars0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Cars cars0 = new Cars();
      Double double0 = new Double(2616.08232);
      Point point0 = new Point(double0, double0);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      try { 
        cars0.getCar(point0, (-979.5073011818), carModel_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Cars cars0 = new Cars();
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      List<Car> list0 = cars0.listOfCarType(carModel_CarType0);
      assertEquals(0, list0.size());
  }
}
