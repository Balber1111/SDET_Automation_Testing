package Page_Object_Model;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_POM_TestActions {
	
	WebDriver driver;
    Login_POM lp;
@BeforeClass
  public void SetUp() throws InterruptedException 
  {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(5000);
  }

@Test(priority=2)
 public void TestLogin() 
 {
	lp= new Login_POM(driver); //Object
	lp.setUserName("Admin");
	lp.setUserPassword("admin123");
	lp.clickSubmit();
	
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
 }

@Test(priority=1)
 public void Logo_Check() 
 {  lp=new Login_POM(driver);
	Assert.assertEquals(lp.checkLogo(), true);
 }


@AfterClass
 public void tearDown() 
 {
	driver.close();
 }

}
