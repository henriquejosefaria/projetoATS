/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Dec 10 18:20:13 GMT 2019
 */

package main.java.controller;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Controller_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "main.java.controller.Controller"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
    org.evosuite.runtime.util.SystemInUtil.getInstance().initForTestCase(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/rm/l9695zr55lbfkw2m0r27vmzm0000gn/T/"); 
    java.lang.System.setProperty("user.country", "PT"); 
    java.lang.System.setProperty("user.dir", "/Users/henrique/Documents/4ano/ATS/projeto/demo1"); 
    java.lang.System.setProperty("user.home", "/Users/henrique"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "henrique"); 
    java.lang.System.setProperty("user.timezone", "Europe/Lisbon"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Controller_ESTest_scaffolding.class.getClassLoader() ,
      "main.java.model.Users",
      "main.java.model.CarModel$CarType",
      "main.java.exceptions.InvalidCarException",
      "main.java.model.Owner",
      "main.java.model.Rentals",
      "main.java.model.User",
      "main.java.model.Rental",
      "main.java.view.viewmodel.NewLogin",
      "main.java.exceptions.UnknownCarTypeException",
      "main.java.exceptions.UnknownCompareTypeException",
      "main.java.view.viewmodel.SpecificCar",
      "main.java.model.Cars",
      "main.java.model.Car",
      "main.java.model.UMCarroJa",
      "main.java.view.Menu$MenuInd",
      "main.java.view.Menu$1",
      "main.java.view.ITable",
      "main.java.exceptions.InvalidUserException",
      "main.java.exceptions.InvalidNumberOfArgumentsException",
      "main.java.model.CarModel",
      "main.java.exceptions.CarExistsException",
      "main.java.model.Client",
      "main.java.exceptions.InvalidNewRentalException",
      "main.java.controller.Controller",
      "main.java.exceptions.NoCarAvaliableException",
      "main.java.exceptions.InvalidNewRegisterException",
      "main.java.exceptions.WrongPasswordExecption",
      "main.java.view.Menu",
      "main.java.view.Table",
      "main.java.exceptions.InvalidTimeIntervalException",
      "main.java.exceptions.UserExistsException",
      "main.java.utils.StringBetter",
      "main.java.exceptions.InvalidRatingException",
      "main.java.controller.Controller$1",
      "main.java.utils.Point",
      "main.java.view.viewmodel.RentCarSimple"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Controller_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "main.java.controller.Controller",
      "main.java.view.Menu$MenuInd",
      "main.java.controller.Controller$1",
      "main.java.model.UMCarroJa",
      "main.java.model.Cars",
      "main.java.model.Users",
      "main.java.model.Rentals",
      "main.java.view.Menu",
      "main.java.view.Menu$1",
      "main.java.utils.Point",
      "main.java.model.User",
      "main.java.model.Client",
      "main.java.model.Owner",
      "main.java.model.CarModel",
      "main.java.exceptions.InvalidUserException",
      "main.java.utils.StringBetter",
      "main.java.exceptions.NoCarAvaliableException",
      "main.java.view.Table",
      "main.java.model.Car",
      "main.java.exceptions.UnknownCompareTypeException",
      "main.java.exceptions.InvalidCarException",
      "main.java.view.viewmodel.RentCarSimple",
      "main.java.exceptions.InvalidTimeIntervalException",
      "main.java.view.viewmodel.SpecificCar",
      "main.java.view.viewmodel.NewLogin",
      "main.java.exceptions.InvalidNewRentalException"
    );
  }
}
