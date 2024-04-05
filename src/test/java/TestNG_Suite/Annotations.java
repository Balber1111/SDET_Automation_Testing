package TestNG_Suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
  @BeforeMethod                        // BeforeMethod
 public void Login() 
  {
	 System.out.println("Login...."); 
	  
  }
  @Test(priority=1)
  public void Search() 
   {
	  System.out.println("Search...."); 
 	  
   }
  @Test(priority=2)
  public void AdvanceSearch() 
   {
	  System.out.println("AdvanceSearch...."); 
 	  
   }
  
  @AfterMethod                         // AfterMethod
  public void Logout() 
   {
	  System.out.println("Logout...."); 
 	  
   }
  
  
}
