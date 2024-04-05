package Special_Classes;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Testing_Demo {
	public static void main(String[] args) throws InterruptedException {
		
		
        // Approach--1     //Usable in  all cases
		
        ChromeOptions option= new ChromeOptions();
        option.addArguments("--headless=new");
        
        // Approach--2    // Not usable // Avoid this approach
        
        //ChromeOptions options=new ChromeOptions();
		//options.addArguments("headless");
		
        WebDriver driver= new ChromeDriver(option); //Open the browser in background
		driver.get("https://www.facebook.com/login/");
	    driver.manage().window().maximize();
	   
		Thread.sleep(3000);
	
		System.out.println("Title is: " +driver.getTitle());
	}

}
