package Keyboard_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Event_Demo1 {
	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("Welcome to automation");
		
		Actions action=new Actions(driver);
		
		// Perform ctrl+a
		
		//Keys is the class which handle/selection of keys from keyboard
		//keyDown to press the key, keyUp to release the key
		
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();      
		
		// Perform ctrl+c
		
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();      
		
		// Perform Tab
		
		action.sendKeys(Keys.TAB); //Use to press single key/button from keyboard
		
		// Perform ctrl+v
		
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		
		
	}
		
	}
