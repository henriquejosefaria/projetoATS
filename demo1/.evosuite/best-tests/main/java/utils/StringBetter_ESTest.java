/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 16:23:35 GMT 2019
 */

package main.java.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import main.java.utils.StringBetter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringBetter_ESTest extends StringBetter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.repeat(3419);
      StringBetter stringBetter2 = stringBetter1.white();
      stringBetter0.bold();
      stringBetter1.blue();
      StringBetter stringBetter3 = stringBetter2.grey();
      StringBetter stringBetter4 = stringBetter3.blink();
      stringBetter0.showCursor();
      StringBetter stringBetter5 = stringBetter4.showCursor();
      stringBetter5.under();
      stringBetter5.showCursor();
      StringBetter stringBetter6 = stringBetter0.repeat(3419);
      StringBetter stringBetter7 = stringBetter6.black();
      stringBetter7.append("");
      StringBetter stringBetter8 = stringBetter6.blue();
      stringBetter8.blink();
      stringBetter6.toString();
      StringBetter stringBetter9 = stringBetter1.white();
      StringBetter stringBetter10 = stringBetter9.roxo();
      // Undeclared exception!
      stringBetter10.repeat(3419);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter((String) null);
      StringBetter stringBetter1 = stringBetter0.grey();
      StringBetter stringBetter2 = stringBetter1.white();
      StringBetter stringBetter3 = stringBetter0.red();
      StringBetter stringBetter4 = stringBetter2.blink();
      stringBetter4.black();
      StringBetter stringBetter5 = stringBetter4.hideCursor();
      stringBetter5.grey();
      StringBetter stringBetter6 = stringBetter4.hideCursor();
      stringBetter6.grey();
      StringBetter stringBetter7 = stringBetter1.grey();
      stringBetter0.hideCursor();
      stringBetter7.bold();
      stringBetter2.cyan();
      stringBetter3.hideCursor();
      stringBetter0.orange();
      String string0 = stringBetter0.getStr();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter("");
      StringBetter stringBetter1 = stringBetter0.under();
      StringBetter stringBetter2 = stringBetter1.white();
      StringBetter stringBetter3 = stringBetter2.bold();
      StringBetter stringBetter4 = stringBetter3.green();
      StringBetter stringBetter5 = stringBetter4.repeat((-502));
      StringBetter stringBetter6 = stringBetter5.red();
      assertEquals("\u001B[31m\u001B[0m", stringBetter6.getStr());
      
      stringBetter5.getStr();
      assertEquals("\u001B[32m\u001B[1m\u001B[38m\u001B[4m\u001B[0m\u001B[0m\u001B[0m\u001B[0m", stringBetter4.getStr());
      assertEquals("\u001B[4m\u001B[0m", stringBetter1.getStr());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.repeat((-186));
      StringBetter stringBetter2 = stringBetter1.blink();
      StringBetter stringBetter3 = stringBetter2.red();
      String string0 = stringBetter3.getStr();
      assertEquals("\u001B[31m\u001B[5m\u001B[0m\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.append("\u001B[34m");
      StringBetter stringBetter2 = stringBetter1.black();
      StringBetter stringBetter3 = stringBetter2.blue();
      StringBetter stringBetter4 = stringBetter3.bold();
      stringBetter4.blue();
      StringBetter stringBetter5 = stringBetter4.red();
      assertEquals("\u001B[31m\u001B[1m\u001B[34m\u001B[30m\u001B[34m\u001B[0m\u001B[0m\u001B[0m\u001B[0m", stringBetter5.getStr());
      
      StringBetter stringBetter6 = stringBetter0.under();
      assertEquals("\u001B[4m\u001B[34m\u001B[0m", stringBetter6.getStr());
      
      String string0 = stringBetter3.toString();
      assertEquals("\u001B[34m\u001B[30m\u001B[34m\u001B[0m\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.hideCursor();
      StringBetter stringBetter2 = stringBetter1.black();
      StringBetter stringBetter3 = stringBetter2.bold();
      StringBetter stringBetter4 = stringBetter3.white();
      StringBetter stringBetter5 = stringBetter4.orange();
      StringBetter stringBetter6 = stringBetter5.showCursor();
      assertEquals("\u001B[33m\u001B[38m\u001B[1m\u001B[30m\u001B[?25l\u001B[0m\u001B[0m\u001B[0m\u001B[0m\u001B[?25h", stringBetter6.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.green();
      StringBetter stringBetter2 = stringBetter1.grey();
      StringBetter stringBetter3 = stringBetter2.under();
      StringBetter stringBetter4 = stringBetter3.hideCursor();
      StringBetter stringBetter5 = stringBetter4.blink();
      StringBetter stringBetter6 = stringBetter5.cyan();
      assertEquals("\u001B[36m\u001B[5m\u001B[4m\u001B[37m\u001B[32m\u001B[0m\u001B[0m\u001B[0m\u001B[?25l\u001B[0m\u001B[0m", stringBetter6.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.repeat(0);
      StringBetter stringBetter2 = stringBetter1.bold();
      String string0 = stringBetter2.getStr();
      assertEquals("\u001B[1m\u001B[0m", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter(",.");
      StringBetter stringBetter1 = stringBetter0.white();
      StringBetter stringBetter2 = stringBetter1.under();
      StringBetter stringBetter3 = stringBetter2.roxo();
      StringBetter stringBetter4 = stringBetter3.showCursor();
      StringBetter stringBetter5 = stringBetter4.blink();
      StringBetter stringBetter6 = stringBetter5.roxo();
      assertEquals("\u001B[35m\u001B[5m\u001B[35m\u001B[4m\u001B[38m,.\u001B[0m\u001B[0m\u001B[0m\u001B[?25h\u001B[0m\u001B[0m", stringBetter6.getStr());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.red();
      StringBetter stringBetter2 = stringBetter1.cyan();
      assertEquals("\u001B[36m\u001B[31m\u001B[0m\u001B[0m", stringBetter2.getStr());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.blue();
      StringBetter stringBetter2 = stringBetter1.showCursor();
      assertEquals("\u001B[34m\u001B[0m\u001B[?25h", stringBetter2.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter("ru");
      StringBetter stringBetter1 = stringBetter0.black();
      StringBetter stringBetter2 = stringBetter1.cyan();
      assertEquals("\u001B[36m\u001B[30mru\u001B[0m\u001B[0m", stringBetter2.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      stringBetter0.toString();
      stringBetter0.toString();
      stringBetter0.blue();
      String string0 = stringBetter0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.bold();
      StringBetter stringBetter2 = stringBetter1.grey();
      StringBetter stringBetter3 = stringBetter2.blue();
      StringBetter stringBetter4 = stringBetter3.white();
      StringBetter stringBetter5 = stringBetter4.blink();
      assertEquals("\u001B[5m\u001B[38m\u001B[34m\u001B[37m\u001B[1m\u001B[0m\u001B[0m\u001B[0m\u001B[0m\u001B[0m", stringBetter5.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter("|5!(fp+j T");
      StringBetter stringBetter1 = stringBetter0.roxo();
      assertEquals("\u001B[35m|5!(fp+j T\u001B[0m", stringBetter1.getStr());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.cyan();
      assertEquals("\u001B[36m\u001B[0m", stringBetter1.getStr());
      
      StringBetter stringBetter2 = stringBetter0.orange();
      StringBetter stringBetter3 = stringBetter2.orange();
      assertEquals("\u001B[33m\u001B[33m\u001B[0m\u001B[0m", stringBetter3.getStr());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.green();
      StringBetter stringBetter2 = stringBetter1.red();
      assertEquals("\u001B[31m\u001B[32m\u001B[0m\u001B[0m", stringBetter2.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter("");
      StringBetter stringBetter1 = stringBetter0.blink();
      assertEquals("\u001B[5m\u001B[0m", stringBetter1.getStr());
      
      StringBetter stringBetter2 = stringBetter0.black();
      assertEquals("\u001B[30m\u001B[0m", stringBetter2.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.bold();
      StringBetter stringBetter2 = stringBetter1.showCursor();
      String string0 = stringBetter2.getStr();
      assertEquals("\u001B[1m\u001B[0m\u001B[?25h", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter("");
      StringBetter stringBetter1 = stringBetter0.cyan();
      StringBetter stringBetter2 = stringBetter0.grey();
      StringBetter stringBetter3 = stringBetter1.black();
      assertEquals("\u001B[30m\u001B[36m\u001B[0m\u001B[0m", stringBetter3.getStr());
      
      StringBetter stringBetter4 = stringBetter0.red();
      StringBetter stringBetter5 = stringBetter1.white();
      assertEquals("\u001B[38m\u001B[36m\u001B[0m\u001B[0m", stringBetter5.getStr());
      
      StringBetter stringBetter6 = stringBetter0.green();
      assertEquals("\u001B[32m\u001B[0m", stringBetter6.getStr());
      
      StringBetter stringBetter7 = stringBetter2.orange();
      assertEquals("\u001B[33m\u001B[37m\u001B[0m\u001B[0m", stringBetter7.getStr());
      
      String string0 = stringBetter4.toString();
      assertEquals("\u001B[31m\u001B[0m", string0);
      
      stringBetter0.cyan();
      StringBetter stringBetter8 = stringBetter1.blue();
      StringBetter stringBetter9 = stringBetter8.roxo();
      assertEquals("\u001B[35m\u001B[34m\u001B[36m\u001B[0m\u001B[0m\u001B[0m", stringBetter9.getStr());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.showCursor();
      StringBetter stringBetter2 = stringBetter1.bold();
      StringBetter stringBetter3 = stringBetter2.append("");
      StringBetter stringBetter4 = stringBetter3.repeat(1);
      StringBetter stringBetter5 = stringBetter4.blink();
      StringBetter stringBetter6 = stringBetter5.blue();
      assertEquals("\u001B[34m\u001B[5m\u001B[1m\u001B[?25h\u001B[0m\u001B[0m\u001B[0m", stringBetter6.getStr());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      StringBetter stringBetter1 = stringBetter0.under();
      StringBetter stringBetter2 = stringBetter1.hideCursor();
      assertEquals("\u001B[4m\u001B[0m\u001B[?25l", stringBetter2.getStr());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringBetter stringBetter0 = new StringBetter();
      String string0 = stringBetter0.getStr();
      assertEquals("", string0);
  }
}
