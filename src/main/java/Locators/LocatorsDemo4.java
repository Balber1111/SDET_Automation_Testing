package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo4 {
	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//String text=driver.findElement(By.xpath("//*[@class=\"oxd-label\"][text()=\"Username\"]")).getText();
		//System.out.println(text);
		
		//*[@name="username"]/parent::* // Use to find parent of child username placeholder 
		
		//*[@name="username"]/ancestor::form // Use to find the ancestor of an child
		
		//*[@alt="company-branding"]/following/::*
		
		//*[@name="username"]/following::*
		
	}

}
