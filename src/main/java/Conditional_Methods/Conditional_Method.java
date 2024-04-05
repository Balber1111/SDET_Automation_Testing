package Conditional_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Method {
	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		WebElement Register =driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
		
		//isDisplay() //to check if Element is displayed on the web page or not
		
		Boolean Display=Register.isDisplayed();
		System.out.println("The register  text is available: "  +Display);
	
		// isEnabled() //to check if the logo or input placeholder is enabled
		
	    WebElement TextBox1=driver.findElement(By.cssSelector("#FirstName"));
	    System.out.println("The TextBox1 is Enabled: " +TextBox1.isEnabled());
		
		//For textbox2
	
		// isEnabled()
		WebElement TextBox2=driver.findElement(By.cssSelector("#LastName"));
		System.out.println("The TextBox2 is Enabled: " +TextBox2.isEnabled());
		//isDisplay
		WebElement TextBoxx2=driver.findElement(By.cssSelector("#LastName"));
		System.out.println("The TextBoxx2 is Enabled: " +TextBoxx2.isDisplayed());
		
		//isSelected()
		WebElement RadioButton=driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("The Male Radio Button is Displayed: " +RadioButton.isDisplayed());
		System.out.println("The Male Radio Button is Enabled: " +RadioButton.isEnabled());
		RadioButton.click();
		Thread.sleep(3000);
		System.out.println("The Male Radio Button is Selected: " +RadioButton.isSelected());
		driver.close();	
		
		
	}
}
