package TestNG_Suite;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_Assertions {
 // @Test
  public void HardAssertion() 
  {
	  System.out.println("Testing....1");
	  System.out.println("Testing....2");
	  System.out.println("Testing....3");
	  System.out.println("Testing....4");
	  
	//No need to of Class for Hard Assertion because methods are static so we can create and use method directly
	  
	  Assert.assertTrue(false); // When instructions are correct only then it will pass and print
	  System.out.println("This is the example of hard assertion");
	 // Assert.assertTrue(true);
	 // Assert.assertTrue(true);    
	 // Assert.assertTrue(true); // Watch video of SDET to understand
	  
	  @Test
	  public void SoftAssertion() 
	  {
		  System.out.println("Testing....1");
		  System.out.println("Testing....2");
		  System.out.println("Testing....3");
		  System.out.println("Testing....4");
		  
		  SoftAssert soft=new SoftAssert();  //Class for Soft Assertion because methods are no-static so we need to create object
		  soft.assertTrue(false);
		  System.out.println("This is the example of soft assertion");
		  soft.assertTrue(true);
		  soft.assertTrue(true);
		  soft.assertTrue(true); // All Instructions will execute even the test is pass or fail
	      soft.assertAll(); //Required for soft assertion//Mandatory to get correct test output
	  
  }
}
