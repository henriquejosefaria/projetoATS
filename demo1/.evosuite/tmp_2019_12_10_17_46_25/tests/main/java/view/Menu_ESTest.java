/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 18:02:34 GMT 2019
 */

package main.java.view;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import main.java.view.Menu;
import main.java.view.viewmodel.RateOwnerCar;
import main.java.view.viewmodel.RegisterUser;
import main.java.view.viewmodel.TimeInterval;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Menu_ESTest extends Menu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SystemInUtil.addInputLine("0");
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("6");
      RateOwnerCar rateOwnerCar0 = menu0.pendingRateShow("0", "0", 1045);
      assertTrue(menu0.getRun());
      assertEquals(0, rateOwnerCar0.getOwnerRate());
      assertEquals(6, rateOwnerCar0.getCarRate());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.pendingRateShow("CLIENT", "P=^", 22);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SystemInUtil.addInputLine("-5");
      Menu menu0 = new Menu();
      assertTrue(menu0.getRun());
      
      menu0.parser();
      assertFalse(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Menu.MenuInd menu_MenuInd0 = Menu.MenuInd.SPECIFIC;
      SystemInUtil.addInputLine("1");
      Menu menu0 = new Menu();
      menu0.selectOption(menu_MenuInd0);
      menu0.parser();
      assertEquals(Menu.MenuInd.SPECIFIC, menu0.getMenu());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SystemInUtil.addInputLine("IAU5BN %s>");
      SystemInUtil.addInputLine("IAU5BN %s>");
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("IAU5BN %s>");
      SystemInUtil.addInputLine("1");
      SystemInUtil.addInputLine("1");
      SystemInUtil.addInputLine("0");
      SystemInUtil.addInputLine("1");
      // Undeclared exception!
      try { 
        menu0.newRegisterCar("IAU5BN %s>");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemInUtil.addInputLine("IAU5BN %s>");
      SystemInUtil.addInputLine("IAU5BN %s>");
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("IAU5BN %s>");
      SystemInUtil.addInputLine("0");
      SystemInUtil.addInputLine("6");
      SystemInUtil.addInputLine("0");
      SystemInUtil.addInputLine("6");
      // Undeclared exception!
      try { 
        menu0.newRegisterCar("IAU5BN %s>");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("0he:#Q6at`;[Jh5o?[");
      SystemInUtil.addInputLine("0");
      // Undeclared exception!
      try { 
        menu0.walkingDistanceRent("@Jd<IUfUxp-.T");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("y((J\"|sN]");
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      menu0.top10ClientsShow(linkedList0, "");
      assertTrue(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("P(@]Ska6zp");
      menu0.showString("ph");
      assertTrue(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Menu menu0 = new Menu();
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      SystemInUtil.addInputLine("main.java.utils.Point");
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1);
      LocalDateTime localDateTime0 = MockLocalDateTime.ofInstant(instant0, zoneOffset0);
      TimeInterval timeInterval0 = new TimeInterval(localDateTime0, localDateTime0);
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      menu0.rentalHistoryShow(timeInterval0, linkedList0);
      assertTrue(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("0");
      SystemInUtil.addInputLine("0");
      // Undeclared exception!
      try { 
        menu0.autonomyCarRent("<");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("0");
      menu0.showRentalRate("0");
      assertTrue(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SystemInUtil.addInputLine("+1");
      Menu menu0 = new Menu();
      menu0.showRentalRate("Utilizador");
      assertTrue(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Menu menu0 = new Menu();
      assertTrue(menu0.getRun());
      
      Menu menu1 = menu0.back();
      Menu.MenuInd menu_MenuInd0 = Menu.MenuInd.CAROVERVIEW;
      menu1.selectOption(menu_MenuInd0);
      assertFalse(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      SystemInUtil.addInputLine(";\u001B[37m");
      Menu menu0 = new Menu();
      String string0 = menu0.reviewRentShow(";\u001B[37m", 1473122002, linkedList0);
      assertEquals(";\u001B[37m", string0);
      assertTrue(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Menu menu0 = new Menu();
      assertTrue(menu0.getRun());
      
      SystemInUtil.addInputLine("tFNL^oidZ:vsj;{");
      menu0.parser();
      SystemInUtil.addInputLine("");
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      menu0.reviewRentShow("tFNL^oidZ:vsj;{", 5752, linkedList0);
      assertFalse(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("8");
      SystemInUtil.addInputLine("8");
      RateOwnerCar rateOwnerCar0 = menu0.pendingRateShow("O\"bvYoDmpa", "O\"bvYoDmpa", 1011);
      assertTrue(menu0.getRun());
      assertEquals(8, rateOwnerCar0.getOwnerRate());
      assertEquals(8, rateOwnerCar0.getCarRate());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SystemInUtil.addInputLine("0");
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("0");
      RegisterUser registerUser0 = menu0.newRegisterUserAux("0", "0", "0", "0", 0);
      assertEquals(0, registerUser0.getNif());
      assertTrue(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SystemInUtil.addInputLine("1");
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("0");
      RegisterUser registerUser0 = menu0.newRegisterUserAux("0", (String) null, "0", "Fix=qGQIreC`2<", 80982221);
      assertEquals("0", registerUser0.getPasswd());
      assertEquals("Fix=qGQIreC`2<", registerUser0.getAddress());
      assertTrue(menu0.getRun());
      assertEquals(80982221, registerUser0.getNif());
      assertEquals("0", registerUser0.getName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SystemInUtil.addInputLine("0");
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("0");
      RegisterUser registerUser0 = menu0.newRegisterUserAux("PfkYx=7DO79S", "PfkYx=7DO79S", "0", "oLcz!$@Lx8?3NX:W||", (-2147483619));
      assertEquals("0", registerUser0.getPasswd());
      assertEquals("PfkYx=7DO79S", registerUser0.getEmail());
      assertEquals("oLcz!$@Lx8?3NX:W||", registerUser0.getAddress());
      assertEquals("PfkYx=7DO79S", registerUser0.getName());
      assertEquals((-2147483619), registerUser0.getNif());
      assertTrue(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SystemInUtil.addInputLine("AU5BN %s>");
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("AU5BN %s>");
      SystemInUtil.addInputLine("8");
      SystemInUtil.addInputLine("8");
      SystemInUtil.addInputLine("8");
      RegisterUser registerUser0 = menu0.newRegisterUser("0");
      assertTrue(menu0.getRun());
      assertEquals("AU5BN %s>", registerUser0.getName());
      assertEquals("8", registerUser0.getPasswd());
      assertEquals(8, registerUser0.getNif());
      assertEquals("8", registerUser0.getAddress());
      assertEquals("AU5BN %s>", registerUser0.getEmail());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SystemInUtil.addInputLine("");
      Menu menu0 = new Menu();
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      String string0 = menu0.carOverviewShow("0", linkedList0);
      assertEquals("", string0);
      assertTrue(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("}d^~Nq2nH&");
      SystemInUtil.addInputLine("ELECTRIC");
      try { 
        menu0.walkingDistanceRent("Tempo a p\u00E9");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.top10ClientsShow((List<List<String>>) null, "%.2f");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Menu menu0 = new Menu();
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList1, (Collection<String>) null);
      linkedList0.add(list0);
      // Undeclared exception!
      try { 
        menu0.top10ClientsShow(linkedList0, "0");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SystemInUtil.addInputLine("%Zb}YhwsYu_X'n j$");
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.specificCarRent("Q_):9C`i>&[");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SystemInUtil.addInputLine("");
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.simpleCarRent("Yhn\"ndxNmvu:fh-Ci|");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("P(@]Ska6zp");
      // Undeclared exception!
      try { 
        menu0.showRentalRate("0");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.selectOption((Menu.MenuInd) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.reviewRentShow("\u001B[1m", 0, (List<List<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Menu menu0 = new Menu();
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList1, (Collection<String>) null, locale_FilteringMode0);
      linkedList0.add(list0);
      // Undeclared exception!
      try { 
        menu0.reviewRentShow(")LP3;Jh8", 11, linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.rentalHistoryShow((TimeInterval) null, (List<List<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("B)9#InLVR7XdH");
      try { 
        menu0.pendingRateShow("/N^*p@pI@tKlX0uw?", "/N^*p@pI@tKlX0uw?", 6);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SystemInUtil.addInputLine("8M8et=n");
      Menu menu0 = new Menu();
      try { 
        menu0.newRegisterUserAux("8M8et=n", "Client", "8M8et=n", "Client", (-1));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("/E}b&$");
      SystemInUtil.addInputLine("2,-,cY>~}0");
      SystemInUtil.addInputLine("\u001B[36m");
      SystemInUtil.addInputLine("h0W<yBkM-pCNV(");
      SystemInUtil.addInputLine("2,-,cY>~}0");
      try { 
        menu0.newRegisterUser("0");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.newRegisterUser("r/");
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
      SystemInUtil.addInputLine("Organizado por n\u00FAmero de Utiliza\u00E7\u00F5es");
      SystemInUtil.addInputLine("3?");
      SystemInUtil.addInputLine("Carro mais barato");
      SystemInUtil.addInputLine("3?");
      Menu menu0 = new Menu();
      try { 
        menu0.newRegisterCar("Carro mais barato");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SystemInUtil.addInputLine("!$55>mGob}+B[:");
      Menu menu0 = new Menu();
      try { 
        menu0.getTimeInterval((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.carOverviewShow("a{&G/_ho7t1", (List<List<String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Menu menu0 = new Menu();
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList1, (Collection<String>) null, locale_FilteringMode0);
      linkedList0.add(list0);
      // Undeclared exception!
      try { 
        menu0.carOverviewShow("9]tElj>vWJp=;m'6,Lj", linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SystemInUtil.addInputLine("Invalid rating");
      SystemInUtil.addInputLine("Invalid rating");
      Menu menu0 = new Menu();
      try { 
        menu0.autonomyCarRent("wCO/U$");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.view.Menu", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("0he:#Q6at`;[Jh5o?[");
      SystemInUtil.addInputLine("0he:#Q6at`;[Jh5o?[");
      menu0.newLogin("0he:#Q6at`;[Jh5o?[");
      SystemInUtil.addInputLine("0he:#Q6at`;[Jh5o?[");
      // Undeclared exception!
      try { 
        menu0.autonomyCarRent("0he:#Q6at`;[Jh5o?[");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.newRegisterUserAux("PfkYx=7DO79S", "cVv~WvJlhN9", "0", "oLcz!$@Lx8?3NX:W||", 2147483645);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Menu menu0 = new Menu();
      Menu.MenuInd menu_MenuInd0 = Menu.MenuInd.TOP10CLIENTS;
      Menu menu1 = menu0.selectOption(menu_MenuInd0);
      // Undeclared exception!
      try { 
        menu1.parser();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Menu menu0 = new Menu();
      Menu.MenuInd menu_MenuInd0 = Menu.MenuInd.RENTALS;
      menu0.selectOption(menu_MenuInd0);
      String string0 = menu0.toString();
      assertTrue(menu0.getRun());
      assertEquals("\u001Bc\u001B[31m\t--INITIAL/RENTALS--\n\u001B[0m\n\n1- Carro mais pr\u00F3ximo das suas coordenadas\n2- Carro mais barato\n3- Carro mais barato dentro de uma dist\u00E2ncia\n4- Carro espec\u00EDfico\n5- Carro com uma autonomia desejada.\n", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Menu.MenuInd menu_MenuInd0 = Menu.MenuInd.OWNER;
      Menu menu0 = new Menu();
      menu0.selectOption(menu_MenuInd0);
      // Undeclared exception!
      try { 
        menu0.parser();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Menu menu0 = new Menu();
      Menu.MenuInd menu_MenuInd0 = Menu.MenuInd.CLIENT;
      menu0.selectOption(menu_MenuInd0);
      // Undeclared exception!
      try { 
        menu0.parser();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Menu menu0 = new Menu();
      Menu.MenuInd menu_MenuInd0 = Menu.MenuInd.REGISTER;
      menu0.selectOption(menu_MenuInd0);
      String string0 = menu0.toString();
      assertTrue(menu0.getRun());
      assertEquals("\u001Bc\u001B[31m\t--INITIAL/REGISTER--\n\u001B[0m\n\n1- Registar novo Client\n2- Registar novo Propriet\u00E1rio\n", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Menu menu0 = new Menu();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      TimeInterval timeInterval0 = new TimeInterval(localDateTime0, localDateTime0);
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.CANADA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList1, (Collection<String>) set0);
      linkedList0.add(list0);
      // Undeclared exception!
      try { 
        menu0.rentalHistoryShow(timeInterval0, linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Menu menu0 = new Menu();
      Menu.MenuInd menu_MenuInd0 = Menu.MenuInd.REGISTER;
      Menu menu1 = menu0.selectOption(menu_MenuInd0);
      Menu menu2 = menu1.selectOption(menu_MenuInd0);
      menu2.back();
      assertEquals(Menu.MenuInd.INITIAL, menu2.getMenu());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Menu menu0 = new Menu();
      Menu.MenuInd menu_MenuInd0 = Menu.MenuInd.LOGIN;
      Menu menu1 = menu0.selectOption(menu_MenuInd0);
      Menu menu2 = menu1.selectOption(menu_MenuInd0);
      menu2.back();
      assertEquals(Menu.MenuInd.INITIAL, menu2.getMenu());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Menu menu0 = new Menu();
      assertTrue(menu0.getRun());
      
      Menu menu1 = menu0.back();
      boolean boolean0 = menu1.getRun();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SystemInUtil.addInputLine("IAU5BN %s>");
      Menu menu0 = new Menu();
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      String string0 = menu0.carOverviewShow("IAU5BN %s>", linkedList0);
      assertEquals("iau5bn %s>", string0);
      
      SystemInUtil.addInputLine("0");
      SystemInUtil.addInputLine("0");
      RateOwnerCar rateOwnerCar0 = menu0.pendingRateShow("IAU5BN %s>", "IAU5BN %s>", 1025);
      assertEquals(0, rateOwnerCar0.getCarRate());
      assertTrue(menu0.getRun());
      assertEquals(0, rateOwnerCar0.getOwnerRate());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SystemInUtil.addInputLine("1");
      Menu menu0 = new Menu();
      menu0.parser();
      assertEquals(Menu.MenuInd.LOGIN, menu0.getMenu());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SystemInUtil.addInputLine("7");
      Menu menu0 = new Menu();
      assertTrue(menu0.getRun());
      
      menu0.parser();
      assertFalse(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SystemInUtil.addInputLine("0");
      Menu menu0 = new Menu();
      assertTrue(menu0.getRun());
      
      menu0.parser();
      assertFalse(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SystemInUtil.addInputLine("IAU5BN %s>");
      SystemInUtil.addInputLine("IAU5BN %s>");
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("IAU5BN %s>");
      SystemInUtil.addInputLine("0");
      SystemInUtil.addInputLine("0");
      RegisterUser registerUser0 = menu0.newRegisterUser("5E@bZ`5Q");
      assertEquals(0, registerUser0.getNif());
      assertTrue(menu0.getRun());
      assertEquals("IAU5BN %s>", registerUser0.getName());
      assertEquals("IAU5BN %s>", registerUser0.getPasswd());
      assertEquals("0", registerUser0.getAddress());
      assertEquals("IAU5BN %s>", registerUser0.getEmail());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.specificCarRent("Q_):9C`i>&[");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.showRentalRate("Utilizador");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.newLogin("#");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Menu menu0 = new Menu();
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      // Undeclared exception!
      try { 
        menu0.carOverviewShow("0", linkedList0);
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
      Menu menu0 = new Menu();
      boolean boolean0 = menu0.getRun();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Menu menu0 = new Menu();
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      TimeInterval timeInterval0 = new TimeInterval(localDateTime0, localDateTime0);
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      // Undeclared exception!
      try { 
        menu0.rentalHistoryShow(timeInterval0, linkedList0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.reviewRentShow(";\u001B[37m", 1473122002, linkedList0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.newRegisterCar("IAU5BN %s>");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Menu menu0 = new Menu();
      menu0.getMenu();
      assertTrue(menu0.getRun());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.getTimeInterval("O\"bvYoDmpa");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.walkingDistanceRent("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.simpleCarRent("M^ZzQ3@IRp");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.autonomyCarRent("AUTONOMY");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Menu menu0 = new Menu();
      // Undeclared exception!
      try { 
        menu0.showString("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Menu menu0 = new Menu();
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      // Undeclared exception!
      try { 
        menu0.top10ClientsShow(linkedList0, "_8(KjW+fVl5giD'");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      SystemInUtil.addInputLine("AU5BN %s>");
      Menu menu0 = new Menu();
      SystemInUtil.addInputLine("AU5BN %s>");
      SystemInUtil.addInputLine("0");
      SystemInUtil.addInputLine("0");
      SystemInUtil.addInputLine("0");
      Menu.MenuInd menu_MenuInd0 = Menu.MenuInd.REGISTERCLIENT;
      menu0.selectOption(menu_MenuInd0);
      // Undeclared exception!
      try { 
        menu0.newRegisterUser("0");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }
}