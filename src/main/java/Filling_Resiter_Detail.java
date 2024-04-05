import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filling_Resiter_Detail {
	public static void main(String[] args) throws InterruptedException 
	{
		
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
	WebElement RadioButton=driver.findElement(By.xpath("//input[@id='gender-female']"));
	System.out.println("The Female Radio Button is Displayed: " +RadioButton.isDisplayed());
	System.out.println("The Female Radio Button is Enabled: " +RadioButton.isEnabled());
	RadioButton.click();
	Thread.sleep(3000);
	
	System.out.println("The Female Radio Button is Selected: " +RadioButton.isSelected());
	driver.findElement(By.id("FirstName")).sendKeys("Jennifer");
	driver.findElement(By.id("LastName")).sendKeys("Lopez");
	driver.findElement(By.id("Email")).sendKeys("jenniferlopez@gmail.com");
	
	WebElement CompanyDetails =driver.findElement(By.xpath("//strong[normalize-space()='Company Details']"));
	System.out.println("The Company Details option is Displayed: " +CompanyDetails.isDisplayed());
	driver.findElement(By.id("Company")).sendKeys("BEBO Technologies");
	
	WebElement Options =driver.findElement(By.xpath("//strong[normalize-space()='Options']"));
	System.out.println("The Options is Displayed: " +Options.isDisplayed());
	
	WebElement CheckButton=driver.findElement(By.xpath("//input[@id='Newsletter']"));
	System.out.println("The Newsletter Check Button is Displayed: " +CheckButton.isDisplayed());
	System.out.println("The Newsletter Check Button is Enabled: " +CheckButton.isEnabled());
	RadioButton.click();
	Thread.sleep(3000);
	
	System.out.println("The Newsletter Check Button is Selected: " +CheckButton.isSelected());
	driver.findElement(By.id("Password")).sendKeys("Jennifer@123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Jennifer@123");
	WebElement Button=driver.findElement(By.id("register-button"));
	Thread.sleep(3000);
	Button.click();
	//driver.close();	
	}
}
