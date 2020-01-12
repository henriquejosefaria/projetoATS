/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 19:13:07 GMT 2019
 */

package main.java.view.viewmodel;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.view.viewmodel.NewLogin;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewLogin_ESTest extends NewLogin_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NewLogin newLogin0 = new NewLogin((String) null, (String) null);
      String string0 = newLogin0.getUser();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NewLogin newLogin0 = new NewLogin("ld^qTq`", "ld^qTq`");
      String string0 = newLogin0.getUser();
      assertEquals("ld^qTq`", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NewLogin newLogin0 = new NewLogin((String) null, (String) null);
      String string0 = newLogin0.getPassword();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewLogin newLogin0 = new NewLogin("ld^qTq`", "ld^qTq`");
      String string0 = newLogin0.getPassword();
      assertEquals("ld^qTq`", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NewLogin newLogin0 = new NewLogin("", "");
      String string0 = newLogin0.getPassword();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NewLogin newLogin0 = new NewLogin("", "");
      String string0 = newLogin0.getUser();
      assertEquals("", string0);
  }
}