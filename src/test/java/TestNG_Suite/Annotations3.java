package TestNG_Suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {
  @Test
  @BeforeTest                        // BeforeTest
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
   
   @AfterTest                       // AfterTest
   public void Logout() 
    {
 	  System.out.println("Logout...."); 
  	  
    }
 }
