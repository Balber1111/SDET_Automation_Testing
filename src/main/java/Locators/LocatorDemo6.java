package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorDemo6 {
public static void main(String[] args) throws InterruptedException {
		
		

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		
		Thread.sleep(4000);
		WebElement book6=driver.findElement(By.id("pid6"));
		driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(book6)).getText();
	
		System.out.println(book6);
	
}
}