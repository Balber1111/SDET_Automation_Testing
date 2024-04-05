package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_Dropdown {
	
	 public static void main(String[] args) {
	    
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.bing.com");
	        driver.manage().window().maximize();
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("Selenium");
	        WebElement searchButton = driver.findElement(By.name("search"));
	        searchButton.click();
	     
	        Select dropdownOptions = new Select();
	        dropdownOptions.selectByVisibleText("Date");
	        driver.quit();
	    }
	}

}
