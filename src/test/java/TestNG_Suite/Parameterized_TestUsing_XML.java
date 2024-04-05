package TestNG_Suite;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_TestUsing_XML {
	
	//Parallel Test Executions on different browsers can be done through XML file only
	
  WebDriver driver;
  @BeforeClass
  @Parameters({"browser","url"})
  public void Setup(String brow, String appURL) throws InterruptedException 
  {
	  if(brow.equals("chrome"))
	  {
		  driver= new ChromeDriver();  
	  }
	  else if(brow.equals("edge"))
	  {
		  driver= new EdgeDriver();  
	  }
	  else
	  {
		  driver= new FirefoxDriver();  
	  }
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get(appURL);
      driver.manage().window().maximize();
      Thread.sleep(5000);
  }
  @Test
  public void TestLogo() 
  {
	  try
	  {
	  boolean logo= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
      Assert.assertEquals(logo, true);
	  }
	  catch(Exception e)
	  {
		  Assert.fail();
	  }
  }
  @Test
  public void TestLogin() throws InterruptedException 
  {
	 
  }
  @Test
  public void TestTitleOfPage() 
  {
	  Assert.assertEquals(driver.getTitle(),"OrangeHRM","Title is not found" ); //"Title is not found" will only print when test fail
  }
  @AfterClass
  public void TearUp() 
  {
  }
}
