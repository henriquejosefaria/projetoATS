/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 19:10:27 GMT 2019
 */

package main.java.view.viewmodel;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.utils.Point;
import main.java.view.viewmodel.RegisterUser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegisterUser_ESTest extends RegisterUser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser((String) null, (String) null, "(", "(", 1);
      String string0 = registerUser0.getPasswd();
      assertEquals(1, registerUser0.getNif());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("", (String) null, "", "", 1020);
      String string0 = registerUser0.getPasswd();
      assertNotNull(string0);
      assertEquals(1020, registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("main.java.utils.Point", (String) null, (String) null, (String) null, 0);
      int int0 = registerUser0.getNif();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("[)", "[)", "[)", "[)", (-1667));
      int int0 = registerUser0.getNif();
      assertEquals((-1667), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser((String) null, (String) null, "(", "(", 1);
      String string0 = registerUser0.getName();
      assertEquals(1, registerUser0.getNif());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("", "O*Cy", "", "=f:'oVsH}", 590);
      String string0 = registerUser0.getName();
      assertEquals("O*Cy", registerUser0.getEmail());
      assertEquals("=f:'oVsH}", registerUser0.getAddress());
      assertEquals("", string0);
      assertEquals("", registerUser0.getPasswd());
      assertEquals(590, registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("", "", "", "", (-1));
      registerUser0.getEmail();
      assertEquals((-1), registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser((String) null, "I{|dI3Z'2f^", (String) null, (String) null, 0);
      String string0 = registerUser0.getAddress();
      assertEquals(0, registerUser0.getNif());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("{BelmcGO?tB", "", "", "", 0);
      String string0 = registerUser0.getAddress();
      assertEquals(0, registerUser0.getNif());
      assertEquals("", string0);
      assertEquals("", registerUser0.getEmail());
      assertEquals("{BelmcGO?tB", registerUser0.getName());
      assertEquals("", registerUser0.getPasswd());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser((String) null, (String) null, "(", "(", 1);
      String string0 = registerUser0.getAddress();
      assertNotNull(string0);
      assertEquals(1, registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("main.java.utils.Point", (String) null, (String) null, (String) null, 0);
      String string0 = registerUser0.getName();
      assertNotNull(string0);
      assertEquals(0, registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("main.java.utils.Point", (String) null, (String) null, (String) null, 0);
      registerUser0.getPos();
      assertEquals(0, registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("main.java.utils.Point", (String) null, (String) null, (String) null, 0);
      String string0 = registerUser0.getPasswd();
      assertEquals(0, registerUser0.getNif());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("main.java.utils.Point", (String) null, (String) null, (String) null, 0);
      String string0 = registerUser0.getEmail();
      assertEquals(0, registerUser0.getNif());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("main.java.utils.Point", "main.java.utils.Point", "main.java.utils.Point", "main.java.utils.Point", (-3), (Point) null);
      registerUser0.getEmail();
      assertEquals((-3), registerUser0.getNif());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegisterUser registerUser0 = new RegisterUser("main.java.view.viewyodel.RegisterUser", "main.java.view.viewyodel.RegisterUser", "main.java.view.viewyodel.RegisterUser", "main.java.view.viewyodel.RegisterUser", 18);
      int int0 = registerUser0.getNif();
      assertEquals(18, int0);
  }
}