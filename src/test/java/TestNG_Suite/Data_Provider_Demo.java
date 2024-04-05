package TestNG_Suite;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Demo {
	
	ChromeDriver driver;
	  @BeforeClass
	  public void Setup() 
	  {
		 driver = new ChromeDriver(); 
	  }
	  @Test(priority=2, dataProvider="dp")                // Parameter of dataProvider// Assign any parameter
	  public void TestLogin(String email, String password) throws InterruptedException 
	  {
		  driver.get("https://demo.nopcommerce.com/login?returnurl=%2F");
		  driver.findElement(By.id("Email")).sendKeys(email); 
		  driver.findElement(By.id("Password")).sendKeys(password);
	      driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	      Thread.sleep(3000);
	      String expected="nopCommerce demo store";
	      String actual=driver.getTitle();
	      
	      Assert.assertEquals(expected, actual);
	  
	  }
	 
	  @AfterClass
	  public void TearUp() 
	  {
		  driver.close();
		  
	  }
	  
	  @DataProvider(name="dp",indices= {0,2})    //Method use to provide input data to other methods
	  String[][] LoginData() 
	  {
		  String data[][]= {{"abc@gmail.com","test"},
				            {"merry@gamil","test@321"},
				            {"john@gmail.com","test12"},
				            {"mk@gmail.com","test123"}
				            
		  };
		  return data;
	  }

}