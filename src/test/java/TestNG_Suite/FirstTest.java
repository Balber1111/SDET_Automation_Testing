package TestNG_Suite;

import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void test1()   //We need to write scripts for testing within the methods
  {
	System.out.println("This is test1");  
	  
  }
  @Test                // Need to add Notation Test when we want to execute the method
  
  public void test2() 
  {
	  System.out.println("This is test2");  
	  
  }
  @Test                  // Need to add Notation Test when we want to execute the method
  
  public void test3() 
  {
	  System.out.println("This is test3");  
	  
  }
  //TestNG automatically pass the test if you didn't mentioned any validation scripts in tests scripts
  //TestNG by default execute test cases in random order not in sequence// In second 
}
