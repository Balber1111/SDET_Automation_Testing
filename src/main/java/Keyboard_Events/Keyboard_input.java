package Keyboard_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_input {
	
	public static void main(String[] args) {
		

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		driver.findElement(By.xpath("//*[@id=\"target\"]"));
		Actions action= new Actions(driver);
		action.sendKeys("a").perform();

       

    if(action.equals("")){
        System.out.println("Pass");
    }
        else {
            System.out.println("Fail");
		
		
		
        }	
	}

}
