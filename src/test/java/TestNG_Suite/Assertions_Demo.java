package TestNG_Suite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_Demo {
  @Test
  public void Test() 
  {
	 //int x=10;
	 //int y=20;
	 // if(x==y)         //We cannot use if else like this in TestNG //4th way is correct below
	//	  System.out.println("Test is passed");
	//  else
	//	  System.out.println("Test is failed");
	  
	//Assert is a class that have many methods
	  
	 // Assert.assertEquals(x,y);    //Hard assertions// (x,y)--Means if (x==y)
	// Assert.assertEquals(true);    //passed
	// Assert.assertEquals(false);   //failed
	  
	  //Assert.assertTrue(true);
      //Assert.assertFalse(false);
	  
//	  2nd way to use Assertions for integers:===
		  
	  //int a=10;
	  //int b=20;
	
	  //Assert.assertEquals(actual, expected,decription); // Syntax
	  //Assert.assertEquals(a>b, true, "a is not amaller than b");//Use of above syntax //This statement only print if test get failed
	  
	  
//    3rd way to use Assertions for strings:==
	  
	 // String a1="abc";
	 // String b1="abc1";
	 // Assert.assertEquals(a1,b1, "Both values must be equal");
	  
	  
//   4th way to use assertions with if else:==
	  
	  if(true)
	  {
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Assert.assertFalse(false);
	  }
	  
	  
	  
	  
  
  }
}
