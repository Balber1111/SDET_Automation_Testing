package JavaScript_Executer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.*;

public class InteractWithElements_JavaScript {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver(); //Object of chrome driver class
		
	  // WebDriver driver=new ChromeDriver(); //WebDriver is an interface and classes are chromedriver, firefox driver etc.
		driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        
        JavascriptExecutor js =driver;
        WebElement inputbox= driver.findElement(By.id("name"));
        WebElement emailbox= driver.findElement(By.id("email"));
        WebElement maleradio= driver.findElement(By.id("male"));
        WebElement sunday= driver.findElement(By.id("sunday"));
        WebElement submit= driver.findElement(By.id("FSsubmit"));
      
        js.executeScript("arguments[0].setAttribute('value','John')", inputbox); // executeScript() is method for executing javascript 
        js.executeScript("arguments[0].setAttribute('value','balbirsingh.4211@gmail.com')", emailbox);
        // To perform click using Javascript executor
        js.executeScript("arguments[0].click();" , maleradio);
        js.executeScript("arguments[0].click();" , sunday);
        js.executeScript("arguments[0].click();" , submit);
        
        
	}

}
