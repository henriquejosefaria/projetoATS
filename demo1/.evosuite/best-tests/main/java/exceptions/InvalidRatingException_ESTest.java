/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 10 19:27:55 GMT 2019
 */

package main.java.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.exceptions.InvalidRatingException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvalidRatingException_ESTest extends InvalidRatingException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InvalidRatingException invalidRatingException0 = new InvalidRatingException();
  }
}