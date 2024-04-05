package TestNG_Suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations2 {
 
  @AfterClass                        // AfterClass
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
   
   @BeforeClass                       // BeforeClass
   public void Logout() 
    {
 	  System.out.println("Logout...."); 
  	  
    }
   
   
 }
