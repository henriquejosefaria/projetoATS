/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 21 22:53:01 GMT 2019
 */

package main.java.view.viewmodel;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import main.java.utils.Point;
import main.java.view.viewmodel.SpecificCar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SpecificCar_ESTest extends SpecificCar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Point point0 = mock(Point.class, new ViolatedAssumptionAnswer());
      SpecificCar specificCar0 = new SpecificCar(point0, (String) null);
      String string0 = specificCar0.getNumberPlate();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SpecificCar specificCar0 = new SpecificCar((Point) null, ", ");
      String string0 = specificCar0.getNumberPlate();
      assertEquals(", ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SpecificCar specificCar0 = new SpecificCar((Point) null, "");
      String string0 = specificCar0.getNumberPlate();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SpecificCar specificCar0 = new SpecificCar((Point) null, "c7(#}");
      Point point0 = specificCar0.getPoint();
      assertNull(point0);
  }
}
