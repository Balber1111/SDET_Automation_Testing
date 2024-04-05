package TestNG_Suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest {
  @Test
  public void test1()                    // Test1
  {
  System.out.println("Test Case 1");
  }
  
  @BeforeMethod
  public void AccountLogin() 
  {
  System.out.println("Account as been logged in");
  }
  @Test(priority=1)
  public void UpdateProfile()                 
  {
  System.out.println("Profile has been updated");
  }
  
  @Test(priority=2)
  public void BankBalance()                 
  {
  System.out.println("Available bank balance is");
  }
  @AfterMethod
  public void AccountLogout() 
  {
  System.out.println("Account as been logged out");
  }
  @Test
  public void test2() {                   //Test 2
  System.out.println("Test Case 2");
  }
  
  @BeforeClass
  public void AccountLogin2() 
  {
  System.out.println("Account as been logged in");
  }
  @Test(priority=1)
  public void UpdateProfile2()                 
  {
  System.out.println("Profile has been updated");
  }
  
  @Test(priority=2)
  public void BankBalance3()                 
  {
  System.out.println("Available bank balance is");
  }
  @AfterClass
  public void AccountLogout2() 
  {
  System.out.println("Account as been logged out");
  }
 
  
  
  
  @Test
  public void test2() {                   //Test 2
  System.out.println("Test Case 2");
  }
  
  @BeforeClass
  public void AccountLogin2() 
  {
  System.out.println("Account as been logged in");
  }
  @Test(priority=1)
  public void UpdateProfile2()                 
  {
  System.out.println("Profile has been updated");
  }
  
  @Test(priority=2)
  public void BankBalance3()                 
  {
  System.out.println("Available bank balance is");
  }
  @AfterClass
  public void AccountLogout2() 
  {
  System.out.println("Account as been logged out");
  }
 
  @BeforeSuite
  public void beforeSuite() {
  System.out.println("Before Suite");
  }
  @AfterSuite
  public void afterSuite() {
  System.out.println("After Suite");
  }
  }