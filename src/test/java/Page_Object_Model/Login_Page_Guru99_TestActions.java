package Page_Object_Model;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Page_Guru99_TestActions {
  
	WebDriver driver;
	Login_Page_Guru99 lp;
@BeforeClass
  public void SetUp() throws InterruptedException 
  {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.guru99.com/test/newtours/");
    Thread.sleep(3000);
  }

@Test(priority=2)
 public void TestLogin() throws InterruptedException 
 {
	lp= new Login_Page_Guru99(driver); //Object
	lp.setUserName("Admin");
	lp.setUserPassword("admin123");
	lp.clickSubmit();
	Assert.assertEquals(driver.getTitle(), "Guru99 Demo Sites");
	Thread.sleep(3000);
 }

@Test(priority=1)
 public void Logo_Check() 
 {  lp=new Login_Page_Guru99(driver);
	Assert.assertEquals(lp.checkLogo(), true);
 }

@AfterClass
 public void tearDown() 
 {
	driver.close();
 }

}
