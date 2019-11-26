/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 21 22:24:29 GMT 2019
 */

package main.java.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDateTime;
import main.java.model.Car;
import main.java.model.Client;
import main.java.model.Owner;
import main.java.model.Rental;
import main.java.utils.Point;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Rental_ESTest extends Rental_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-3), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-3));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 0.0, 0.0, (-3), (-3), point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", (-3));
      Double double1 = new Double(0.0);
      Point point1 = new Point(double1, double1);
      Rental rental0 = new Rental(car0, client0, point1);
      Rental rental1 = new Rental(car0, client0, point1);
      assertTrue(rental1.equals((Object)rental0));
      
      rental1.rent();
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", 1, "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(1);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 4.0, 4.0, 1, 1, point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", 1);
      Double double1 = new Double(4.0);
      Point point1 = new Point(double0, double1);
      Rental rental0 = new Rental(car0, client0, point1);
      Rental rental1 = new Rental(car0, client0, point1);
      assertTrue(rental1.equals((Object)rental0));
      
      rental1.rent();
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", 1, "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(1);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 4.0, 4.0, 1, 1, point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", 1);
      Rental rental0 = new Rental(car0, client0, point0);
      Double double1 = new Double(4.0);
      Point point1 = new Point(double0, double1);
      Rental rental1 = new Rental(car0, client0, point1);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(1);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", 1);
      Double double1 = new Double(4.0);
      Point point1 = new Point(double0, double1);
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "o9@+02t!rW)WR*", 1797, "IrnB6SrT= <");
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 1.0, 4.0, 1, 1797, point1, "o9@+02t!rW)WR*");
      Rental rental0 = new Rental(car0, client0, point1);
      String string0 = rental0.toString();
      assertEquals("Client:        Custo Total: \nCarro:          Custo Total: \nDono:           Custo Total: \nViagem:         (1.00, 4.00) -> (1.00, 4.00)\nTempo a p\u00E9      0.75 Horas\nTempo Estimado: 0.00 Horas\nCusto Estimado: 0.00", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", 1, "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(1);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 4.0, 4.0, 1, 1, point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", 1);
      Rental rental0 = new Rental(car0, client0, point0);
      Double double1 = new Double(4.0);
      Point point1 = new Point(double0, double1);
      Rental rental1 = new Rental(car0, client0, point1);
      rental1.rent();
      String string0 = rental0.toParsableUserString();
      assertEquals("Custo Total: \nCusto Total: \n(1.00, 1.00)\n(1.00, 1.00)\n0.75\n0.00\n0.00\n100", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Owner owner0 = new Owner((String) null, (String) null, "xh9EgkH\"", 0, "^]H!FN");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 0, 0, 0.0, 0, point0, "^]H!FN");
      Client client0 = new Client(point0, "main.java.model.User", "", (String) null, (String) null, 0);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
      rental0.rent();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Owner owner0 = new Owner("", (String) null, "Y1u!3YD", 1, "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Y1u!3YD", owner0, car_CarType0, 1, 1, (-3631.05785991), 0, point0, "c:7/Q#, i#/DoyG");
      Client client0 = new Client(point0, (String) null, "aT~E:#Q)QwXyQ", "aT~E:#Q)QwXyQ", "Y1u!3YD", 1720);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rate(1);
      assertEquals(1, client0.getRates());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", 1, "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(1);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 4.0, 4.0, 1, 1, point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", 1);
      Double double1 = new Double(4.0);
      Point point1 = new Point(double0, double1);
      Rental rental0 = new Rental(car0, client0, point1);
      rental0.rent();
      double double2 = rental0.getPrice();
      assertEquals(13.200000000000001, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", 1, "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(1);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, (-4.618679509169835), (-4.618679509169835), 1, 1, point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", 1);
      Double double1 = new Double((-4.618679509169835));
      Point point1 = new Point(double0, double1);
      Rental rental0 = new Rental(car0, client0, point1);
      rental0.rent();
      double double2 = rental0.getPrice();
      assertEquals((-28.545967909354662), double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Owner owner0 = new Owner((String) null, "{ NB8~w`J>y/Jc", (String) null, 0, "{ NB8~w`J>y/Jc");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 0, 0, 0, 0, point0, "");
      Client client0 = new Client(point0, ";`*U(ZZDB|@<p.2F", "", "", "", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getOwnerID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", 224, "");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 0.0, 0.0, 0.0, 224, point0, "");
      Client client0 = new Client(point0, "", "QC8~(kKkaD$ _B", "QC8~(kKkaD$ _B", "", (-199));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getOwnerID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", 1, "a^7)uN");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(1.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 4.0, (-2505.729092854324), 1, 1, point0, "a^7)uN");
      Client client0 = new Client(point0, "Custo Total: ", "a^7)uN", ",3pMt[~-~\"R", ",3pMt[~-~\"R", 1);
      Double double1 = new Double((-2505.729092854324));
      Point point1 = new Point(double1, double1);
      Rental rental0 = new Rental(car0, client0, point1);
      double double2 = rental0.getDistance();
      assertEquals(3545.05028030979, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Owner owner0 = new Owner("MW*}#{uNhJ^yr;", "y#]:g=S[-w)0", "y#]:g=S[-w)0", 2539, "y#]:g=S[-w)0");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double((-3593));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Y9(`-q@&%?", owner0, car_CarType0, 2539, 2539, 2539, (-3593), point0, "y#]:g=S[-w)0");
      Client client0 = new Client(point0, (String) null, "_Q}Vq/B7.ZI", "_Q}Vq/B7.ZI", "F[Ew _|o6W&GGDo4", (-3593));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Owner owner0 = new Owner("main.java.utils.Point", "h?6Hozq5j&Vt;", "main.java.utils.Point", (-62), "main.java.utils.Point");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-62));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("main.java.utils.Point", owner0, car_CarType0, (-62), (-1.0), 1843.39187478, 0, point0, "h?6Hozq5j&Vt;");
      Client client0 = new Client(point0, "", "main.java.utils.Point", "{!y", ")", (-62));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Owner owner0 = new Owner("Qm,8,3MIWOt=", (String) null, "D", 1473122002, "Hchx");
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(1473122002);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 0.0, 1140.464, 0.0, 0, point0, "Todos");
      Client client0 = new Client(point0, "main.java.model.User", "\\,q-7K/CCA8KN^D", "0]_Yg]%QrDr+6zl b", "", (-3267));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Owner owner0 = new Owner("ANY", "ANY", "", 1567, "");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-2443));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, 1567, 1567, 1567, (-2443), point0, "");
      Client client0 = new Client(point0, "", "x", "Tempo a p\u00E9      ", "", 1567);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double((-1994));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", (Owner) null, car_CarType0, (-2629.253995114), (-2112.707431908), 0.0, (-1994), point0, (String) null);
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Owner owner0 = new Owner("O carro necessita de ser abastecido\n", "", "", (-2664), "");
      Double double0 = new Double(1413);
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("O carro necessita de ser abastecido\n", owner0, car_CarType0, (-1383.8821816725), 2966.4184716364, 1413, 1986, point0, (String) null);
      Client client0 = new Client((Point) null, "", "", "", "K59\"2Y6B{f(|E", 2158);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableUserString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Client", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(2368.3104069975107);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("%.2f", (Owner) null, car_CarType0, 427.0, 427.0, (-369.9), 1, point0, "%.2f");
      Client client0 = new Client(point0, "main.java.model.User", "main.java.model.User", "%.2f", "%.2f", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableUserRentalString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Owner owner0 = new Owner("LMTO3|B", (String) null, "\"k6w=", 2413, "68F{{");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-583.827827508));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("%.2f Horas", owner0, car_CarType0, (-583.827827508), 2.0, (-583.827827508), 2413, point0, "%.2f Horas");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.toParsableOwnerRentalString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(2038.37);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("ELECTRIC", (Owner) null, car_CarType0, 716.676, 716.676, 0.0, 1, point0, "");
      Client client0 = new Client(point0, "-N?TCQ?[n?S", "ELECTRIC", "", "mo^u9!,", 1177);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.rent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Owner owner0 = new Owner("", "", "", (-611), (String) null);
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(4.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 2150.4315, 4.0, 4.0, 3616, point0, "");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      System.setCurrentTimeMillis((-611));
      // Undeclared exception!
      try { 
        rental0.rent();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("main.java.model.Weather", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(0.2);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car(":JF}/Grdf0y", (Owner) null, car_CarType0, 0.0, 0.0, 0.0, 0, point0, ":JF}/Grdf0y");
      Client client0 = new Client(point0, ":JF}/Grdf0y", ":JF}/Grdf0y", ":JF}/Grdf0y", ":JF}/Grdf0y", 0);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.rate(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-1252), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double((-2506.040869));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, (-1252), -0.0, -0.0, (-1), point0, "");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.rate((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double(1);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", (Owner) null, car_CarType0, (-4.618679509169835), (-4.618679509169835), 1, 1, point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", 1);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        rental0.getOwnerID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Owner owner0 = new Owner("*C", "*C", "*C", 2349, "*C");
      Car.CarType car_CarType0 = Car.CarType.ELECTRIC;
      Double double0 = new Double(2916.2674);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("*C", owner0, car_CarType0, (-1.0), 2349, 957.0, 2349, point0, "*C");
      Rental rental0 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental0.getClientID();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Owner owner0 = new Owner("f;7Zh", "f;7Zh", "f;7Zh", (-1719145501), "f;7Zh");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-1719145501));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("f;7Zh", owner0, car_CarType0, (-1719145501), 1003.0701624878457, (-1719145501), (-1719145501), point0, "h@`\"0c<\".TBk_");
      Client client0 = new Client(point0, "f;7Zh", "main.java.utils.Point", "main.java.utils.Point", "I313vq|4w", (-1719145501));
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, (Client) null, point0);
      // Undeclared exception!
      try { 
        rental1.equals(rental0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Double double0 = new Double(0.4);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "4/Ew)U", "4/Ew)U", "4/Ew)U", "4/Ew)U", 328);
      Rental rental0 = null;
      try {
        rental0 = new Rental((Car) null, client0, point0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rental", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-3), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-3));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 0.0, 0.0, (-3), (-3), point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", (-3));
      Double double1 = new Double(0.0);
      Point point1 = new Point(double1, double1);
      Rental rental0 = new Rental(car0, client0, point1);
      Rental rental1 = new Rental(car0, client0, point1);
      assertTrue(rental1.equals((Object)rental0));
      
      rental1.rent();
      boolean boolean0 = rental1.equals(rental0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Owner owner0 = new Owner("", "", "6MA|A%2Sx'`fUJ~", (-1631544101), "?D==zi1fflCl<a");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-1631544101), 49.515595853, (-1631544101), 18, point0, "6MA|A%2Sx'`fUJ~");
      Client client0 = new Client(point0, "", "", "", "", (-2147483324));
      Rental rental0 = new Rental(car0, client0, point0);
      System.setCurrentTimeMillis((-826L));
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Owner owner0 = new Owner("", "", "6MA|A%2Sx'`fUJ~", (-1631544101), "?D==zi1fflCl<a");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-1631544101), 49.515595853, (-1631544101), 18, point0, "6MA|A%2Sx'`fUJ~");
      Client client0 = new Client(point0, "", "", "", "", (-2147483324));
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Owner owner0 = new Owner("f;7Zh", "f;7Zh", "f;7Zh", (-1719145501), "f;7Zh");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double((-1719145501));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("f;7Zh", owner0, car_CarType0, (-1719145501), 1003.0701624878457, (-1719145501), (-1719145501), point0, "h@`\"0c<\".TBk_");
      Client client0 = new Client(point0, "f;7Zh", "main.java.utils.Point", "main.java.utils.Point", "I313vq|4w", (-1719145501));
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, (Client) null, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-3), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-3));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 0.0, 0.0, (-3), (-3), point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", (-3));
      Rental rental0 = new Rental(car0, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental1.equals(rental0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-7), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-7));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, (-4.618679509169835), (-4.618679509169835), (-7), (-7), point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", (-7));
      Double double1 = new Double((-4.618679509169835));
      Point point1 = new Point(double0, double1);
      Rental rental0 = new Rental(car0, client0, point1);
      Rental rental1 = new Rental(car0, client0, point1);
      assertTrue(rental1.equals((Object)rental0));
      
      rental1.rent();
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-7), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-7));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, (-4.618679509169835), (-4.618679509169835), (-7), (-7), point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", (-7));
      Rental rental0 = new Rental(car0, client0, point0);
      Double double1 = new Double((-4.618679509169835));
      Point point1 = new Point(double0, double1);
      Rental rental1 = new Rental(car0, client0, point1);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Owner owner0 = new Owner("", "", "6MA|A%2Sx'`fUJ~", (-1631544101), "?D==zi1fflCl<a");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, car_CarType0, (-1631544101), 49.515595853, (-1631544101), 18, point0, "6MA|A%2Sx'`fUJ~");
      Client client0 = new Client(point0, "", "", "", "", (-2147483324));
      Rental rental0 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-3), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-3));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 0.0, 0.0, (-3), (-3), point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", (-3));
      Rental rental0 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Owner owner0 = new Owner((String) null, (String) null, "xh9EgkH\"", 0, "^]H!FN");
      Car.CarType car_CarType0 = Car.CarType.GAS;
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 0, 0, 0.0, 0, point0, "^]H!FN");
      Client client0 = new Client(point0, "main.java.model.User", "", (String) null, (String) null, 0);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rent();
      owner0.rate(rental0, 1);
      assertEquals(1, client0.getRates());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Owner owner0 = new Owner("", (String) null, "Y1u!3YD", 1, "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Y1u!3YD", owner0, car_CarType0, 1, 1, (-3631.05785991), 0, point0, "c:7/Q#, i#/DoyG");
      Car car1 = car0.myclone();
      Client client0 = new Client(point0, (String) null, "aT~E:#Q)QwXyQ", "aT~E:#Q)QwXyQ", "Y1u!3YD", 1720);
      Rental rental0 = new Rental(car1, client0, point0);
      Rental rental1 = new Rental(car0, client0, point0);
      boolean boolean0 = rental0.equals(rental1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-3), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-3));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 0.0, 0.0, (-3), (-3), point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", (-3));
      Rental rental0 = new Rental(car0, client0, point0);
      LocalDateTime localDateTime0 = rental0.getDate();
      assertNotNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Owner owner0 = new Owner("", (String) null, "Y1u!3YD", 1, "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Y1u!3YD", owner0, car_CarType0, 1, 1, (-3631.05785991), 0, point0, "c:7/Q#, i#/DoyG");
      Client client0 = new Client(point0, (String) null, "aT~E:#Q)QwXyQ", "aT~E:#Q)QwXyQ", "Y1u!3YD", 1720);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toParsableUserRentalString();
      assertEquals("2014-02-14 20:21\nY1u!3YD\n\n(0.00, 0.00)\n(0.00, 0.00)\n0.00", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Owner owner0 = new Owner("", (String) null, "Y1u!3YD", 1, "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Y1u!3YD", owner0, car_CarType0, 1, 1, (-3631.05785991), 0, point0, "c:7/Q#, i#/DoyG");
      Client client0 = new Client(point0, (String) null, "aT~E:#Q)QwXyQ", "aT~E:#Q)QwXyQ", "Y1u!3YD", 1720);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toParsableOwnerRentalString();
      assertEquals("2014-02-14 20:21\nY1u!3YD\nnull\n(0.00, 0.00)\n(0.00, 0.00)\n0.00", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Owner owner0 = new Owner("", (String) null, "Y1u!3YD", 1, "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Y1u!3YD", owner0, car_CarType0, 1, 1, (-3631.05785991), 0, point0, "c:7/Q#, i#/DoyG");
      Client client0 = new Client(point0, (String) null, "aT~E:#Q)QwXyQ", "aT~E:#Q)QwXyQ", "Y1u!3YD", 1720);
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getCarID();
      assertEquals("Y1u!3YD", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Owner owner0 = new Owner("", (String) null, "Y1u!3YD", 1, "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Y1u!3YD", owner0, car_CarType0, 1, 1, (-3631.05785991), 0, point0, "c:7/Q#, i#/DoyG");
      Client client0 = new Client(point0, (String) null, "aT~E:#Q)QwXyQ", "aT~E:#Q)QwXyQ", "Y1u!3YD", 1720);
      Rental rental0 = new Rental(car0, client0, point0);
      double double1 = rental0.getPrice();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-3), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-3));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 0.0, 0.0, (-3), (-3), point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", (-3));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getClientID();
      assertEquals("Custo Total: ", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-3), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-3));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 0.0, 0.0, (-3), (-3), point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", (-3));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.toFinalString();
      assertEquals("Tempo Total: 0.00 Horas\nCusto Total: 0.00\n\n\u001B[4m\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Owner owner0 = new Owner("", (String) null, "Y1u!3YD", 1, "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Y1u!3YD", owner0, car_CarType0, 1, 1, (-3631.05785991), 0, point0, "c:7/Q#, i#/DoyG");
      Client client0 = new Client(point0, (String) null, "aT~E:#Q)QwXyQ", "aT~E:#Q)QwXyQ", "Y1u!3YD", 1720);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.hashCode();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Owner owner0 = new Owner("Custo Total: ", "Custo Total: ", "Custo Total: ", (-3), "Custo Total: ");
      Car.CarType car_CarType0 = Car.CarType.ANY;
      Double double0 = new Double((-3));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Custo Total: ", owner0, car_CarType0, 0.0, 0.0, (-3), (-3), point0, "Custo Total: ");
      Client client0 = new Client(point0, "Custo Total: ", "Custo Total: ", "Custo Total: ", "Custo Total: ", (-3));
      Rental rental0 = new Rental(car0, client0, point0);
      String string0 = rental0.getOwnerID();
      assertEquals("Custo Total: ", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Owner owner0 = new Owner((String) null, (String) null, (String) null, 0, (String) null);
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car((String) null, owner0, car_CarType0, 0, 0, 0, 0, point0, (String) null);
      Client client0 = new Client(point0, (String) null, (String) null, (String) null, (String) null, 0);
      Rental rental0 = new Rental(car0, client0, point0);
      double double1 = rental0.getDistance();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Owner owner0 = new Owner("", (String) null, "Y1u!3YD", 1, "");
      Car.CarType car_CarType0 = Car.CarType.HYBRID;
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("Y1u!3YD", owner0, car_CarType0, 1, 1, (-3631.05785991), 0, point0, "c:7/Q#, i#/DoyG");
      Client client0 = new Client(point0, (String) null, "aT~E:#Q)QwXyQ", "aT~E:#Q)QwXyQ", "Y1u!3YD", 1720);
      Rental rental0 = new Rental(car0, client0, point0);
      rental0.rate(1, 0);
      assertEquals(0, owner0.getRates());
  }
}
