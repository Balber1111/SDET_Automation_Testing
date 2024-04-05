package Special_Classes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Demo {
	public static void main(String[] args) throws IOException{
		
        WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    
	    TakesScreenshot screenshot= (TakesScreenshot) driver;  //We need to do type casting here
	
//  Capture Screenshot for fullpage		
	    
	   // File screen=screenshot.getScreenshotAs(OutputType.FILE); //Take the screenshot
	   // File target=new File("C:\\Users\\balbi\\eclipse-workspace\\Selenium_Maven\\Screenshot\\CompletePage.png");
	   // FileUtils.copyFile(screen, target);
	  //  System.out.println("Screenshot Taken");
		
	    
//  Capture Screenshot for specific area
		
		//WebElement featureProduct=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
		//File screen2=featureProduct.getScreenshotAs(OutputType.FILE); //Take the screenshot
	    //File target2=new File("C:\\Users\\balbi\\eclipse-workspace\\Selenium_Maven\\Screenshot\\Specific.png");
		//FileUtils.copyFile(screen2, target2);
		//System.out.println("Screenshot Taken");
		
//  Capture Screenshot for specific area
		
		WebElement featureProduct=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		File screen3=featureProduct.getScreenshotAs(OutputType.FILE); //Take the screenshot
	    File target3=new File("C:\\Users\\balbi\\eclipse-workspace\\Selenium_Maven\\Screenshot\\SpecificElement.png");
		FileUtils.copyFile(screen3, target3);
		System.out.println("Screenshot Taken");
		
		
	}

}
