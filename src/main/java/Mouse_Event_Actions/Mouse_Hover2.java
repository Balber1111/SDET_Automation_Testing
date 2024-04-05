package Mouse_Event_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover2 {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
	//driver.get("https://demo.opencart.com/");
	WebElement Laptops =driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
	WebElement Window =driver.findElement(By.xpath("//a[normalize-space()='Windows (0)']"));
	
	// Actions class use for Mouse events
	Actions action=new Actions(driver);
	
	//moveToElement() is the method to move the mouse
	Thread.sleep(5000);
	action.moveToElement(Laptops).moveToElement(Window).click().build().perform(); 
	
	//build and perform are the method use to close the actions class
	//Build method is steps of actions, perform method perform/implement the actions
	
}

}
