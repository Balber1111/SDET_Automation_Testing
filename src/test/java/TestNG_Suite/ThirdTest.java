package TestNG_Suite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdTest {
	
	  ChromeDriver driver=new ChromeDriver();//It became global variable and accessible from all methods
	
  @Test (priority=1) //Setting up priority/sequence
  public void OpenApp()  //First Method
  {
	  //ChromeDriver driver=new ChromeDriver(); //It became local variable as we have declared in first method
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @Test (priority=2)
  public void Login()  //Second Method
  {
	    driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();  
  }
  
  @Test (priority=3)
  public void CloseApp() //Third Method
  {
	  driver.close();
  }
}
