/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 16:28:53 GMT 2019
 */

package main.java.view.viewmodel;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import main.java.view.viewmodel.TimeInterval;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TimeInterval_ESTest extends TimeInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeInterval timeInterval0 = new TimeInterval((LocalDateTime) null, (LocalDateTime) null);
      LocalDateTime localDateTime0 = timeInterval0.getInicio();
      assertNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimeInterval timeInterval0 = new TimeInterval((LocalDateTime) null, (LocalDateTime) null);
      LocalDateTime localDateTime0 = timeInterval0.getFim();
      assertNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      TimeInterval timeInterval0 = new TimeInterval(localDateTime0, localDateTime0);
      LocalDateTime localDateTime1 = timeInterval0.getFim();
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      TimeInterval timeInterval0 = new TimeInterval(localDateTime0, localDateTime0);
      LocalDateTime localDateTime1 = timeInterval0.getInicio();
      assertSame(localDateTime0, localDateTime1);
  }
}
