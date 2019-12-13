/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 18:20:13 GMT 2019
 */

package main.java.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.NoSuchElementException;
import main.java.controller.Controller;
import main.java.model.Car;
import main.java.model.CarModel;
import main.java.model.Client;
import main.java.model.Owner;
import main.java.model.Rental;
import main.java.model.UMCarroJa;
import main.java.utils.Point;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseCheapestNear((String) null);
      // Undeclared exception!
      try { 
        controller0.run();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseDistance("T");
      String string0 = "{-";
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      SystemInUtil.addInputLine("Total faturaio: ");
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseHistoryClient("Total faturaio: ");
      controller0.caseReviewRental("Total faturaio: ");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      SystemInUtil.addInputLine("");
      controller0.caseHistoryOwner("");
      controller0.run();
      ZoneId zoneId0 = null;
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "";
      // Undeclared exception!
      try { 
        controller0.caseNUses("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.casePending("un&7v/]W(W4+'");
      String string0 = "";
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      controller0.caseSpecific(",4CI4]r)qE1");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseAddCar("HISTORYOWNER");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      String string0 = "%.2f";
      controller0.caseClosest("%.2f");
      // Undeclared exception!
      try { 
        controller0.caseAddCar(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = ",zK";
      // Undeclared exception!
      try { 
        controller0.caseCarOverview(",zK");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.controller.Controller", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      controller0.caseRegisterOwner("9");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseCheapest("x|Ho,$4AFU-O\"");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseRegisterClient(".A=qTo");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SystemInUtil.addInputLine("Valor de carro inv\u00E1lido");
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.run();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      SystemInUtil.addInputLine("");
      SystemInUtil.addInputLine("Total faturado: ");
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseLogin("");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      String string0 = "Total faturado: ";
      FileSystemHandling.shouldAllThrowIOExceptions();
      SystemInUtil.addInputLine("Total faturado: ");
      SystemInUtil.addInputLine("Total faturado: ");
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseAutonomy("Total faturado: ");
      // Undeclared exception!
      try { 
        controller0.caseHistoryClient("Total faturado: ");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseRegisterClient("");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseDistance("b))");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "MDeOG~CL)XoHH7!";
      controller0.caseRegisterOwner("INITIAL");
      // Undeclared exception!
      try { 
        controller0.caseHistoryClient(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      String string0 = "N\u00FAmero de Utiliza\u00E7\u00F5es";
      controller0.caseDistance("N\u00FAmero de Utiliza\u00E7\u00F5es");
      String string1 = "Carro j\u00E1 existe";
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "";
      // Undeclared exception!
      try { 
        controller0.caseRegisterOwner("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "b*=cyxU;?}";
      // Undeclared exception!
      try { 
        controller0.caseCarOverview("b*=cyxU;?}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.controller.Controller", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      controller0.caseCheapestNear("4P&U_4FAp}]}Lq");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseLogin("");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      controller0.caseNUses("\n");
      String string0 = "Client:        ";
      // Undeclared exception!
      try { 
        controller0.caseCarOverview(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.controller.Controller", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "";
      // Undeclared exception!
      try { 
        controller0.caseNUses("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseReviewRental("Invalid Parameters");
      String string0 = "";
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      String string0 = controller0.caseLogin(".6a");
      String string1 = controller0.caseSpecific(string0);
      // Undeclared exception!
      try { 
        controller0.caseHistoryClient(string1);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = controller0.caseNUses("Qb@eGa");
      // Undeclared exception!
      try { 
        controller0.caseNUses(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "_75bnF(V{";
      // Undeclared exception!
      try { 
        controller0.caseReviewRental("_75bnF(V{");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.controller.Controller", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.casePending(">UhQz");
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseSpecific("main.java.model.CarModel$CarType");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseClosest("");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseAddCar("main.java.exceptions.UnknownCompareTypeException");
      String string0 = "";
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      String string0 = "];-!M}[!$[e";
      controller0.caseSpecific("];-!M}[!$[e");
      // Undeclared exception!
      try { 
        controller0.caseNUses(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "";
      // Undeclared exception!
      try { 
        controller0.caseClosest("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      String string0 = "BOpZ";
      String string1 = controller0.caseAddCar("BOpZ");
      // Undeclared exception!
      try { 
        controller0.caseAutonomy(string1);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      // Undeclared exception!
      try { 
        controller0.run();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      controller0.caseHistoryOwner("");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Controller controller0 = new Controller((UMCarroJa) null);
      controller0.run();
      String string0 = ":3\\DHT[4`iPRU]&";
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = controller0.caseCheapest("<u.B=ugWT]l<UNv9+");
      // Undeclared exception!
      try { 
        controller0.caseDistance(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "";
      // Undeclared exception!
      try { 
        controller0.caseCheapest("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseAutonomy((String) null);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseAutonomy("a8=@+Dar'LM -");
      String string0 = null;
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "%c";
      Double double0 = null;
      Double double1 = new Double(0.0);
      controller0.caseDistance("%c");
      Point point0 = null;
      try {
        point0 = new Point(double0, double1);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseHistoryClient("nA^v\"oQf{$[");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseHistoryClient("~=Vt~iC!|:=");
      String string0 = "";
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      SystemInUtil.addInputLine("");
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseCheapestNear("");
      String string0 = "nA^v\"oQf{$[";
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      SystemInUtil.addInputLine("E1@MzBWI");
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.run();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SystemInUtil.addInputLine("");
      System.setCurrentTimeMillis(0L);
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "";
      controller0.caseClosest("");
      uMCarroJa0.save(string0);
      // Undeclared exception!
      try { 
        controller0.casePending(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "$VALUES";
      SystemInUtil.addInputLine("$VALUES");
      Owner owner0 = new Owner("K", "BMaisBarato", "$VALUES", 0, "Carro j\u00E1 existe");
      controller0.caseHistoryOwner("czr%cBYS`");
      owner0.myclone();
      controller0.run();
      owner0.myclone();
      Owner owner1 = owner0.myclone();
      ZoneId zoneId0 = null;
      LocalDateTime localDateTime0 = MockLocalDateTime.now(zoneId0);
      // Undeclared exception!
      try { 
        uMCarroJa0.getRentalListOwner(owner1, localDateTime0, localDateTime0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SystemInUtil.addInputLine("");
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "";
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      controller0.caseCheapest("");
      controller0.caseClosest(string0);
      uMCarroJa0.save(string0);
      // Undeclared exception!
      try { 
        controller0.casePending(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      SystemInUtil.addInputLine("");
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseHistoryClient("");
      controller0.caseRegisterOwner("b29OOz*WINDDvp");
      // Undeclared exception!
      try { 
        FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SystemInUtil.addInputLine("");
      Controller controller0 = new Controller(uMCarroJa0);
      uMCarroJa0.getBestClientsTimes();
      controller0.caseNUses("");
      controller0.caseAutonomy("");
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SystemInUtil.addInputLine("p");
      Controller controller0 = new Controller(uMCarroJa0);
      uMCarroJa0.getBestClientsTimes();
      controller0.caseNUses("p");
      controller0.caseAutonomy("");
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      SystemInUtil.addInputLine("");
      uMCarroJa0.getBestClientsTimes();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseAutonomy("");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = "";
      SystemInUtil.addInputLine("");
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      String string1 = "";
      int int0 = (-2993);
      Owner owner0 = new Owner("", "", "\"8\"|>7k1Ux>R", (-2993), "");
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseSpecific("\"8\"|>7k1Ux>R");
      double double0 = (-2126.6755250338306);
      Double double1 = new Double(double0);
      Point point0 = null;
      try {
        point0 = new Point(double1, double1);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = "";
      SystemInUtil.addInputLine("");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseDistance("");
      // Undeclared exception!
      try { 
        controller0.caseReviewRental("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.controller.Controller", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      SystemInUtil.addInputLine("Total faturado: ");
      Controller controller0 = new Controller(uMCarroJa0);
      String string0 = "nA^v\"oQf{$[";
      controller0.caseNUses((String) null);
      controller0.caseHistoryClient("nA^v\"oQf{$[");
      controller0.caseReviewRental(string0);
      // Undeclared exception!
      try { 
        controller0.caseReviewRental(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      SystemInUtil.addInputLine("E1@MzBWI");
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseDistance("E1@MzBWI");
      controller0.caseAddCar("Utilizador j\u00E1 existe");
      controller0.run();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      FileSystemHandling.shouldAllThrowIOExceptions();
      SystemInUtil.addInputLine("");
      SystemInUtil.addInputLine("Total faturado: ");
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseLogin("");
      String string0 = "nA^v\"oQf{$[";
      String string1 = controller0.caseHistoryClient("nA^v\"oQf{$[");
      controller0.caseClosest(string1);
      // Undeclared exception!
      try { 
        controller0.caseReviewRental(string0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      Controller controller0 = new Controller(uMCarroJa0);
      SystemInUtil.addInputLine("");
      controller0.caseDistance((String) null);
      String string0 = "doGV`";
      controller0.caseSpecific("doGV`");
      controller0.caseCarOverview(string0);
      String string1 = "*6i,";
      // Undeclared exception!
      try { 
        controller0.caseHistoryOwner(string1);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      SystemInUtil.addInputLine("Total faturado: ");
      SystemInUtil.addInputLine("");
      SystemInUtil.addInputLine("Total faturado: ");
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseAutonomy("");
      String string0 = "nA^v\"oQf{$[";
      controller0.caseHistoryClient("nA^v\"oQf{$[");
      controller0.caseReviewRental(string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      SystemInUtil.addInputLine("Invalid Username");
      String string0 = "";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      SystemInUtil.addInputLine("");
      SystemInUtil.addInputLine("Total faturado: ");
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseAddCar("");
      controller0.caseLogin(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      SystemInUtil.addInputLine("");
      SystemInUtil.addInputLine("i_sPl o>-F!Q2}Q");
      Controller controller0 = new Controller((UMCarroJa) null);
      controller0.caseLogin("");
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      UMCarroJa uMCarroJa0 = new UMCarroJa();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      SystemInUtil.addInputLine("");
      SystemInUtil.addInputLine("Total faturado: ");
      Controller controller0 = new Controller(uMCarroJa0);
      controller0.caseCheapestNear("Total faturado: ");
      controller0.caseLogin("");
  }
}
