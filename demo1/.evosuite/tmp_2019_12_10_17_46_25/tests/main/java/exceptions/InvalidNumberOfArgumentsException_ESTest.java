/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 19:19:17 GMT 2019
 */

package main.java.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.exceptions.InvalidNumberOfArgumentsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvalidNumberOfArgumentsException_ESTest extends InvalidNumberOfArgumentsException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InvalidNumberOfArgumentsException invalidNumberOfArgumentsException0 = new InvalidNumberOfArgumentsException();
  }
}
