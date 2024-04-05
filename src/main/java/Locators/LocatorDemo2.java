package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {
	public static void main(String[] args) {
		
		//Locators
		
		//When we have these three requirements:
		//1. How many total sliders on the page 
		//2. Find total numbers of images on the page
		//3. Find total no of links available on the page
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		
		//1. How many total sliders on the page 
		// Using className Locator and using List method from Java
		
	List <WebElement> sliders=driver.findElements(By.className("homeslider-container")); // homeslider-container tag use to get images on slider of page elements
	
	System.out.println("The slider contains total Images: " +sliders.size());
	
	    //2. Find total numbers of images on the page 
	   //Using tag Locator and using List method from Java
	
	List <WebElement> images= driver.findElements(By.tagName("img")); // img tag use to get image elements
	System.out.println("The number of images on the page: " +images.size());
	
	//3. Find total no of links available on the page
	//
	
	List <WebElement> links= driver.findElements(By.tagName("a")); // a tag use to get link elements
	System.out.println("The number of links on the page: " +links.size());
	
	driver.close();
		
	}

}
