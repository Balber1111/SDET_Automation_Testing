package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locators {
	 public static void main(String[] args) {
		
		 ChromeDriver driver= new ChromeDriver();
			driver.get("https://demo.nopcommerce.com/");
			
			
			//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("First Prize Pies");
			
			// driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("First Prize Pies");
			
			driver.findElement(By.cssSelector("input.")).sendKeys("First Prize Pies");
			
			
		 
	}
	

}
