package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_CusRelative_Xpath {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize(); //use to maximize the browser after execution
		
		driver.get("http://demo.nopcommerce.com/");
		
		//absolute Xpath// full Xpath
		  String text=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a")).getText();
		  System.out.println(text);
		
		//relative path
		
		//String text=driver.findElement(By.xpath("//a[text()='Apple MacBook Pro 13-inch']")).getText();
		//System.out.println(text);
		  
		//*[@alt="nopCommerce demo store"] //Custom Xpath
		  
		  //*[contains(text(),"Log in") and @class="ico-login"] For locating element for login text
		
		//*[contains(text(),"Register") and @class="ico-register"] For locating element for Register Text
		
		
		  
	}

}
