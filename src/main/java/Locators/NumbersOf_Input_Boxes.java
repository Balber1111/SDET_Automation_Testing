package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class NumbersOf_Input_Boxes {
	public static void main(String[] args) {
		

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		List <WebElement> input_boxes = driver.findElements(By.tagName("input"));
		
		System.out.println("No of  + "  " );
		
	}

}
