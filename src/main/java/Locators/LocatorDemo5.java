package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorDemo5 {
	public static void main(String[] args) throws InterruptedException {
		
		

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("Balbir");
		
		Thread.sleep(4000);
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(username)).sendKeys("Balbir@123");
		
		Thread.sleep(1000);
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		driver.findElement(RelativeLocator.with(By.name("login")).below(login)).click();
		
	}

}
