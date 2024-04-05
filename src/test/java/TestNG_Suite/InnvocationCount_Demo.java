package TestNG_Suite;

import org.testng.annotations.Test;

public class InnvocationCount_Demo {
	
  @Test(invocationCount=5)  // Use to run a test for multiple times// Help us During exhaustive testing 
  public void test() 
  {
	  System.out.println("Testing--");
  }
}
