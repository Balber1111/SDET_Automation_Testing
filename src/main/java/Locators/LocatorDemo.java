package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {
	public static void main(String[] args) {
		
		//Locators
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		
		//Locator: id
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirt"); 
		
		// Locator: name
	    driver.findElement(By.name("submit_search")).click();
	    
	  //Locator: linkText
	    //driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click(); 
	    
	    //Locator: partialLinkText (You can give the half link text to capture the output)
	   // driver.findElement(By.partialLinkText("Faded Short")).click(); 
	    
	    System.out.println("Successfully Executed--Script passed");
	    
		
	}

}
