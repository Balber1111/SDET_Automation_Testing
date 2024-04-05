package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {
	public static void main(String[] args) {
		
		//CSS Locators
		
		//Tag and ID ---Tag#ID
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		
		//Tag and ID ---Tag#ID
		
	//	driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Tops");
		
		
		//Tag and Class ---Tag.class //writing tag is optional// .class
		
    //driver.findElement(By.cssSelector("input.search_query")).sendKeys("Tops");
		
		
		//Tag and attribute ---Tag[name="abc"]
		
	//driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("Tops");
		
		
		//Tag, class and attribute Tag.class[name="abc"]
		
		driver.findElement(By.cssSelector("input.search_query[name=\"search_query\"]")).sendKeys("Tops");
		
		
		
		
		
	}

}
