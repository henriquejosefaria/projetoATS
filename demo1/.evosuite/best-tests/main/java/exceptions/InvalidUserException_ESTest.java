/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 21 22:54:01 GMT 2019
 */

package main.java.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.exceptions.InvalidUserException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvalidUserException_ESTest extends InvalidUserException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InvalidUserException invalidUserException0 = new InvalidUserException();
  }
}
