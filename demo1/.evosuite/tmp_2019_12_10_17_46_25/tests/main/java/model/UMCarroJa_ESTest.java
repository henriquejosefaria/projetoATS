/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 19:06:54 GMT 2019
 */

package main.java.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import main.java.model.Car;
import main.java.model.CarModel;
import main.java.model.Client;
import main.java.model.Owner;
import main.java.model.Rental;
import main.java.model.UMCarroJa;
import main.java.model.User;
import main.java.utils.Point;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UMCarroJa_ESTest extends UMCarroJa_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double((-2477.2144996794896));
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "S;FY }^}N3l\"zf6S\"", "", "", "S;FY }^}N3l\"zf6S\"", 2573);
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond(2573, 2573, zoneOffset0);
      LocalDateTime localDateTime1 = MockLocalDateTime.now();
      List<Rental> list0 = uMCarroJa0.getRentalListClient(client0, localDateTime0, localDateTime1);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double((-929.0));
      Point point0 = new Point(double0, double0);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      try { 
        uMCarroJa0.rental("xeEPe-uiHH(nT!rv`", point0, (String) null, carModel_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Users", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("Fall", "3]8{ &OS>Qh4e(21S", "Fall", 0, "O carro necessita de ser abastecido\n");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      CarModel carModel0 = new CarModel(carModel_CarType0, 0, "");
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("3]8{ &OS>Qh4e(21S", owner0, carModel0, 0, 0.0, 0, point0);
      owner0.addCar(car0);
      uMCarroJa0.swapState(owner0, 0);
      assertEquals(100, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("@gmail.com", (String) null, (String) null, (-1), (String) null);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      CarModel carModel0 = new CarModel(carModel_CarType0, (-3072.636022098), "K(a`BXX2oOW");
      Double double0 = new Double((-509));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("@gmail.com", owner0, carModel0, 0.0, (-951.1238131744), (-509), point0);
      Client client0 = new Client(point0, "<M<`H&?zbUY", "", "", "K(a`BXX2oOW", 1);
      Rental rental0 = new Rental(car0, client0, point0);
      uMCarroJa0.rent(rental0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double(235.12388739600723);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, ">4WL8kzpeOY&o0@", (String) null, ">4WL8kzpeOY&o0@", ">4WL8kzpeOY&o0@", (-1738));
      Owner owner0 = new Owner(">4WL8kzpeOY&o0@", "%.2f", (String) null, (-1738), "");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      CarModel carModel0 = new CarModel(carModel_CarType0, (-1002.657766489), "");
      Car car0 = new Car("%.2f", owner0, carModel0, 0.0, 0.0, (-1738), point0);
      Rental rental0 = new Rental(car0, client0, point0);
      uMCarroJa0.rate(client0, rental0, (-1738), 0);
      assertEquals(0, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("", "", "v", 825, "}WT!P63U5fvo_@eoai0");
      List<Rental> list0 = uMCarroJa0.getRentalListOwner(owner0, (LocalDateTime) null, (LocalDateTime) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("", "", "", 0, "");
      uMCarroJa0.addUser(owner0);
      List<Map.Entry<String, Integer>> list0 = (List<Map.Entry<String, Integer>>)uMCarroJa0.getBestClientsTimes();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("", "", "", 0, "");
      uMCarroJa0.addUser(owner0);
      List<Map.Entry<String, Double>> list0 = (List<Map.Entry<String, Double>>)uMCarroJa0.getBestClients();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      // Undeclared exception!
      try { 
        uMCarroJa0.swapState((Owner) null, (-4504));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.UMCarroJa", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("", "", "GAS", 2067, "GAS");
      // Undeclared exception!
      try { 
        uMCarroJa0.swapState(owner0, 2067);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2067, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      // Undeclared exception!
      try { 
        uMCarroJa0.setBasePrice((Owner) null, (-1206), (-372.137291));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.UMCarroJa", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("L2p;0~,e5`7mpG", "main.java.model.Owner", "main.java.model.Owner", (-1681), "L2p;0~,e5`7mpG");
      // Undeclared exception!
      try { 
        uMCarroJa0.setBasePrice(owner0, (-1681), 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      // Undeclared exception!
      try { 
        uMCarroJa0.save((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        uMCarroJa0.save("CPjI3+A[");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      try { 
        uMCarroJa0.save("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double(1.0);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "N2vW(w~keKE}_1a:/7b", "Can't write to file!!\n", "N2vW(w~keKE}_1a:/7b", "N2vW(w~keKE}_1a:/7b", 996);
      try { 
        uMCarroJa0.rental(point0, "N2vW(w~keKE}_1a:/7b", client0);
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
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, (String) null, "", (String) null, "", 48);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      // Undeclared exception!
      try { 
        uMCarroJa0.rental(client0, point0, (String) null, carModel_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double((-1079.1133));
      Point point0 = new Point(double0, double0);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      // Undeclared exception!
      try { 
        uMCarroJa0.rental((Client) null, point0, (-252.78170812077423), carModel_CarType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.UMCarroJa", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      CarModel.CarType carModel_CarType0 = CarModel.CarType.GAS;
      CarModel carModel0 = new CarModel(carModel_CarType0, (-194.407), "nyWZ.dr:2");
      Double double0 = new Double(1473.9954202);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("J20", (Owner) null, carModel0, 0.0, 1473.9954202, 449, point0);
      Client client0 = new Client(point0, "J20", "J20", "B,q)z", "nyWZ.dr:2", (-581));
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        uMCarroJa0.refuse((Owner) null, rental0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.UMCarroJa", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("%x4mJj|r11XP!l", "%x4mJj|r11XP!l", "", (-536), "CPjI3+A[");
      // Undeclared exception!
      try { 
        uMCarroJa0.refil(owner0, 100);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 100, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("", "", "", (-2111), "");
      // Undeclared exception!
      try { 
        uMCarroJa0.refil(owner0, (-2111));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        UMCarroJa.read((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("main.java.model.UMCarroJa");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "vOc.j@|v<U~DL");
      try { 
        UMCarroJa.read("main.java.model.UMCarroJa");
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 764F632E
         //
         verifyException("java.io.ObjectInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("main.java.model.UMCarroJa");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      try { 
        UMCarroJa.read("main.java.model.UMCarroJa");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("", "", "", 2995, "");
      // Undeclared exception!
      try { 
        uMCarroJa0.rate(owner0, (Rental) null, 2995);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Owner", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      try { 
        uMCarroJa0.logIn("Tempo Estimado: ", "b-U`5");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Users", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      // Undeclared exception!
      try { 
        uMCarroJa0.getTotalBilledCar((Car) null, (LocalDateTime) null, (LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      // Undeclared exception!
      try { 
        uMCarroJa0.getTotalBilledCar((Car) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      // Undeclared exception!
      try { 
        uMCarroJa0.getRentalListOwner((Owner) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        uMCarroJa0.getRentalListClient((Client) null, localDateTime0, localDateTime0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      // Undeclared exception!
      try { 
        uMCarroJa0.getRentalListClient((Client) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double((-208.75778472791));
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, (String) null, "djp:s 0M|)3g", (String) null, (String) null, 3);
      uMCarroJa0.addUser(client0);
      try { 
        uMCarroJa0.addUser(client0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Users", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      // Undeclared exception!
      try { 
        uMCarroJa0.addUser((User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.UMCarroJa", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      CarModel carModel0 = new CarModel(carModel_CarType0, 0.0, (String) null);
      // Undeclared exception!
      try { 
        uMCarroJa0.addCar((Owner) null, carModel0, "T %,afqRsO", 0.0, 3639, 1514, point0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.UMCarroJa", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      ZoneId zoneId0 = ZoneId.systemDefault();
      Clock clock0 = MockClock.tickSeconds(zoneId0);
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      // Undeclared exception!
      try { 
        uMCarroJa0.getRentalListOwner((Owner) null, localDateTime0, localDateTime0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Rentals", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      // Undeclared exception!
      try { 
        uMCarroJa0.refil((Owner) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.UMCarroJa", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      uMCarroJa0.save("(550.16, 550.16)");
      UMCarroJa uMCarroJa1 = UMCarroJa.read("(550.16, 550.16)");
      assertNull(uMCarroJa1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("", "R5", "R5", (-464), "");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      CarModel carModel0 = new CarModel(carModel_CarType0, (-464), "");
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      try { 
        uMCarroJa0.addCar(owner0, carModel0, (String) null, (-464), (-464), (-464), point0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Users", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double(0.15);
      Point point0 = new Point(double0, double0);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.GAS;
      Client client0 = new Client(point0, "pK,:`hs%]{!s9q", "pK,:`hs%]{!s9q", "pK,:`hs%]{!s9q", "|JMo!!Q}y)H[S@]", (-278));
      try { 
        uMCarroJa0.rental(point0, 0.15, carModel_CarType0, client0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("r_~##m;MyF", "r_~##m;MyF", "", 2209, "r_~##m;MyF");
      List<Rental> list0 = uMCarroJa0.getRentalListOwner(owner0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double(1212.155643144025);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "du5CI6[wkC4q\"Yb", "du5CI6[wkC4q\"Yb", "du5CI6[wkC4q\"Yb", "du5CI6[wkC4q\"Yb", 0);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.GAS;
      try { 
        uMCarroJa0.rental(client0, point0, "-+^,+5_ 2ck", carModel_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("", "", "", 1094, "");
      // Undeclared exception!
      try { 
        uMCarroJa0.swapState(owner0, (-551));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      CarModel carModel0 = new CarModel(carModel_CarType0, 0.0, "Can't write to file!!\n");
      try { 
        uMCarroJa0.addCar("Ob2VZKGKH9", "Can't write to file!!\n", carModel0, 0.15, 0.15, 90, (Point) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Users", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      List<Map.Entry<String, Integer>> list0 = (List<Map.Entry<String, Integer>>)uMCarroJa0.getBestClientsTimes();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      try { 
        uMCarroJa0.rate("main.java.exceptions.UnknownCarTypeException", 261);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      try { 
        UMCarroJa.read("(550.16, 550.16)");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("Fall", "3]8{ &OS>Qh4e(21S", "Fall", 0, "O carro necessita de ser abastecido\n");
      uMCarroJa0.addUser(owner0);
      List<Map.Entry<String, Double>> list0 = (List<Map.Entry<String, Double>>)uMCarroJa0.getBestClientsTravel();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("", "^OBGO|M77?Sd", "^OBGO|M77?Sd", 8, "");
      // Undeclared exception!
      try { 
        uMCarroJa0.setBasePrice(owner0, 8, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 8, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double(859.04669563);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "nx0td_(noFxn`F6[v", "WFU94:!L<D1H:)Q%", "", "", 1413);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      try { 
        uMCarroJa0.rental(client0, point0, (double) 1413, carModel_CarType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Cars", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double(859.04669563);
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "nx0td_(noFxn`F6[v", "WFU94:!L<D1H:)Q%", "", "", 1413);
      Owner owner0 = new Owner("nx0td_(noFxn`F6[v", "nx0td_(noFxn`F6[v", "WFU94:!L<D1H:)Q%", (-1), "WFU94:!L<D1H:)Q%");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ANY;
      CarModel carModel0 = new CarModel(carModel_CarType0, 1942.2622388013, "WFU94:!L<D1H:)Q%");
      Car car0 = new Car("", owner0, carModel0, (-1545.8), (-1), (-1), point0);
      Rental rental0 = new Rental(car0, client0, point0);
      uMCarroJa0.refuse(owner0, rental0);
      assertEquals(100, owner0.getRates());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, "Todos", "", "", "", 0);
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      CarModel carModel0 = new CarModel(carModel_CarType0, 0.0, (String) null);
      Car car0 = new Car("", (Owner) null, carModel0, 0, 0.0, 0, point0);
      Rental rental0 = new Rental(car0, client0, point0);
      // Undeclared exception!
      try { 
        uMCarroJa0.rate(client0, rental0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.Car", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      // Undeclared exception!
      try { 
        uMCarroJa0.rent((Rental) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.model.UMCarroJa", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      List<Map.Entry<String, Double>> list0 = (List<Map.Entry<String, Double>>)uMCarroJa0.getBestClients();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      Owner owner0 = new Owner("r_~##m;MyF", "r_~##m;MyF", "", 2209, "r_~##m;MyF");
      CarModel carModel0 = new CarModel(carModel_CarType0, 0.0, "r_~##m;MyF");
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, carModel0, (-54.98964819), 1.0, 0, point0);
      Clock clock0 = MockClock.systemDefaultZone();
      LocalDateTime localDateTime0 = MockLocalDateTime.now(clock0);
      double double1 = uMCarroJa0.getTotalBilledCar(car0, localDateTime0, localDateTime0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner((String) null, "", "9", 2771, "djp:s 0M|)3g");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.HYBRID;
      CarModel carModel0 = new CarModel(carModel_CarType0, 2771, "main.java.model.Car");
      Double double0 = new Double((-672.9874012690482));
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("", owner0, carModel0, 2771, 2771, 2771, point0);
      Client client0 = new Client(point0, "/mkx+Q;", (String) null, "djp:s 0M|)3g", "9", (-1674));
      Rental rental0 = new Rental(car0, client0, point0);
      uMCarroJa0.rate(owner0, rental0, 2034);
      assertEquals(2034, client0.getRates());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Owner owner0 = new Owner("Fall", "3]8{ &OS>Qh4e(21S", "Fall", 0, "O carro necessita de ser abastecido\n");
      CarModel.CarType carModel_CarType0 = CarModel.CarType.ELECTRIC;
      CarModel carModel0 = new CarModel(carModel_CarType0, 0, "");
      Double double0 = new Double(0);
      Point point0 = new Point(double0, double0);
      Car car0 = new Car("3]8{ &OS>Qh4e(21S", owner0, carModel0, 0, 0.0, 0, point0);
      double double1 = uMCarroJa0.getTotalBilledCar(car0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Double double0 = new Double((-208.75778472791));
      Point point0 = new Point(double0, double0);
      Client client0 = new Client(point0, (String) null, "djp:s 0M|)3g", (String) null, (String) null, 3);
      List<Rental> list0 = uMCarroJa0.getRentalListClient(client0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      List<Map.Entry<String, Double>> list0 = (List<Map.Entry<String, Double>>)uMCarroJa0.getBestClientsTravel();
      assertTrue(list0.isEmpty());
  }
}