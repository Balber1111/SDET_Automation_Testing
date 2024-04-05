package JavaScript_Executer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterectWithEDropdown_JavaScript {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver(); //Object of chrome driver class
		
		  // WebDriver driver=new ChromeDriver(); //WebDriver is an interface and classes are chromedriver, firefox driver etc.
			driver.manage().window().maximize();
	        driver.get("https://testautomationpractice.blogspot.com/");
	        
	        JavascriptExecutor js =driver;
	        WebElement countrydrop= driver.findElement(By.xpath("//*[@id=\"country\"]"));
	        js.executeScript("arguments[0].click();" , countrydrop);
	        
	     //   
	        String optionvalue="canada";
	        String script= "arguments[0].value='"+optionvalue+"';";
	        driver.executeScript(script,countrydrop);
	        
		
		
		
		
	}

}
