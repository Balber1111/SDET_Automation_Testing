package TestNG_Suite;

import org.testng.annotations.Test;

public class SecondTest {
  @Test(priority=1) //Prioritizing the test case for execution
  public void Login() 
  {
	 System.out.println("This is login"); 
  }
  
  @Test(priority=2) //Prioritizing the test case for execution
  public void Search() 
  {
	  System.out.println("This is search");   
  }
  @Test(priority=3) //Prioritizing the test case for execution
  public void Logout() 
  {
	  System.out.println("This is logout");   
  }
}
