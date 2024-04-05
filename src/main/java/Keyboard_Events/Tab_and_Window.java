package Keyboard_Events;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_and_Window {
	public static void main(String[] args) {
		
	///	To open new tab in the browser
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		//Selenium 4 onward
		
		//switchTo() use for in case switch between, alert, windows, frame, url
		
		//driver.switchTo().newWindow(WindowType.TAB); //For opening in new tab
		driver.switchTo().newWindow(WindowType.WINDOW); //For opening in new window
		driver.get("https://www.flipkart.com/");
		
		
		
		
	}

}
