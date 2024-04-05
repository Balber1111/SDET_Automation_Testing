package Conditional_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Methods {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.findElement(By.xpath("//h1[normalize-space()='Register']")).click();
		//driver.close(); 
		driver.quit();		
	}

}
