package JavaScript_Executer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Scroll_JavaScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		    ChromeDriver driver= new ChromeDriver(); 
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	        driver.manage().window().maximize();
	        JavascriptExecutor js =driver;
	        
	    //   Scroll page by pixel
	        
	      //There will be no args because there is no webelement that we are locating and scroll is not a webelement
	        js.executeScript("window.scrollBy(0,3000)", " ");    //Giving pixels value
	        System.out.println(js.executeScript("return window.pageYOffset;", " "));   //To return value of Y axis
	    
	   // Scroll down to specific element
	        WebElement India=  driver.findElement(By.xpath("//*[img"));
	        js.executeScript("arguments[0].scrollIntoView();",India);    // To scroll
	        System.out.println(js.executeScript("return window.pageYOffset;", " "));   //To return value of India
	        
	        Thread.sleep(2000);
	     // Scroll down to the end of the page 
	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	        System.out.println(js.executeScript("return window.pageYOffset;", " "));
		
	        
	        Thread.sleep(2000);
	     // Scroll up to the starting of the page 
	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	        System.out.println(js.executeScript("return window.pageYOffset;", " "));
	        
	}

}
