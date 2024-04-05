package TestNG_Suite;

import org.testng.annotations.Test;

public class Grouping_Demo {
  @Test (priority=1,groups= {"sanity","regression"})
  public void LoginByEmail() 
  {
	System.out.println("This is login by Email");  
  }
  @Test(priority=2,groups= {"sanity"})
  public void LoginByFacebook() 
  {
	  System.out.println("This is login by Facebook");   
  }
  @Test(priority=3,groups= {"sanity"})
  public void LoginByTwitter() 
  {
	  System.out.println("This is login by Twitter");  
  }
  @Test(priority=4,groups= {"sanity","regression"})
  public void SignUpByEmail() 
  {
	  System.out.println("This is signup by Email");   
  }
  @Test(priority=5,groups= {"regression"})
  public void SignUpByFacebook() 
  {
	  System.out.println("This is signup by Facebook");  
  }
  @Test(priority=6,groups= {"regression"})
  public void SignUpByTwitter() 
  {
	  System.out.println("This is signup by Twitter");  
  }
  @Test (priority=7,groups= {"sanity","regression"})
  public void PaymentInRupees() 
  {
	  System.out.println("This is Payment in Rupees"); 
  }
  @Test (priority=8,groups= {"sanity"})
  public void PaymentInDollars() 
  {
	  System.out.println("This is Payment in Dollars"); 
  }
  @Test (priority=9,groups= {"regression"})
  public void PaymentInEuros() 
  {
      System.out.println("This is Payment in Euros");
  } 
}
