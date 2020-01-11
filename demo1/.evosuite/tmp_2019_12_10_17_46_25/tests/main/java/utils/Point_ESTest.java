/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 19:00:58 GMT 2019
 */

package main.java.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import main.java.utils.Point;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Point_ESTest extends Point_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double((-1.0));
      Double double1 = new Double((-1092.44189));
      Point point0 = new Point(double0, double1);
      Point point1 = new Point(double0, double0);
      boolean boolean0 = point0.equals(point1);
      assertFalse(point1.equals((Object)point0));
      assertEquals((-1.0), point0.getX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = new Double((-267.6679));
      Point point0 = new Point(double0, double0);
      Double double1 = new Double(2257.236145741);
      Point point1 = new Point(double1, double0);
      boolean boolean0 = point0.equals(point1);
      assertFalse(boolean0);
      assertFalse(point1.equals((Object)point0));
      assertEquals((-267.6679), point1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      double double1 = point0.distanceBetweenPoints(point0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      Point point1 = point0.myclone();
      assertEquals(0.0, point1.getY(), 0.01);
      assertEquals(0.0, point1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      Point point1 = point0.myclone();
      assertTrue(point1.equals((Object)point0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Double double0 = new Double(0.0);
      Point point0 = new Point(double0, double0);
      double double1 = point0.getY();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Double double0 = new Double((-267.6679));
      Point point0 = new Point(double0, double0);
      double double1 = point0.getY();
      assertEquals((-267.6679), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Double double0 = Double.valueOf(0.0);
      Point point0 = new Point(double0, double0);
      double double1 = point0.getX();
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double double0 = new Double((-1.0));
      Point point0 = new Point(double0, double0);
      double double1 = point0.getX();
      assertEquals((-1.0), double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double double0 = new Double((-1.0));
      Double double1 = new Double((-1092.44189));
      Point point0 = new Point(double0, double1);
      Point point1 = new Point(double0, double0);
      double double2 = point0.distanceBetweenPoints(point1);
      assertEquals(1091.44189, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Double double0 = new Double((-978.2256145852327));
      Point point0 = new Point(double0, double0);
      // Undeclared exception!
      try { 
        point0.distanceBetweenPoints((Point) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.utils.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double double0 = new Double(0.0);
      Point point0 = null;
      try {
        point0 = new Point(double0, (Double) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.utils.Point", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double double0 = new Double(160.66596542556607);
      Point point0 = new Point(double0, double0);
      Double double1 = new Double(2.29675);
      Point point1 = new Point(double0, double1);
      boolean boolean0 = point0.equals(point1);
      assertFalse(point1.equals((Object)point0));
      assertFalse(boolean0);
      assertEquals(160.66596542556607, point1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double double0 = new Double(160.66596542556607);
      Point point0 = new Point(double0, double0);
      Double double1 = new Double(2.29675);
      Point point1 = new Point(double1, double0);
      boolean boolean0 = point0.equals(point1);
      assertEquals(160.66596542556607, point1.getY(), 0.01);
      assertFalse(point1.equals((Object)point0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double double0 = new Double(25.282374722054357);
      Point point0 = new Point(double0, double0);
      boolean boolean0 = point0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double double0 = new Double(4143.0018386495685);
      Point point0 = new Point(double0, double0);
      boolean boolean0 = point0.equals(point0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double double0 = new Double(25.282374722054357);
      Point point0 = new Point(double0, double0);
      boolean boolean0 = point0.equals(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double double0 = new Double(4143.0018386495685);
      Point point0 = new Point(double0, double0);
      double double1 = point0.getY();
      assertEquals(4143.0018386495685, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Double double0 = new Double(160.66596542556607);
      Point point0 = new Point(double0, double0);
      double double1 = point0.getX();
      assertEquals(160.66596542556607, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Double double0 = new Double(25.282374722054357);
      Point point0 = new Point(double0, double0);
      point0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Double double0 = new Double(4143.0018386495685);
      Point point0 = new Point(double0, double0);
      Point point1 = point0.myclone();
      boolean boolean0 = point1.equals(point0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Double double0 = new Double(25.282374722054357);
      Point point0 = new Point(double0, double0);
      String string0 = point0.toString();
      assertEquals("(25.28, 25.28)", string0);
  }
}
