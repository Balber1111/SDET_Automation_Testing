package Frames;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_window_2 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		//get/store the window id

		Set <String> windowids=driver.getWindowHandles(); // window handles implement using set because it do not store duplicate value
	    
		//Approach 2
		
		for(String winid:windowids)
		{
		String title=driver.switchTo().window(winid).getTitle();
			
		if(title.equals("Human Resources Management Software | OrangeHRM"))
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
			System.out.println(driver.getTitle());
			
		}
		else if(title.equals("OrangeHRM"))
		{
			driver.findElement(By.name("username")).sendKeys("12345");
		}
		}
	}
}
		
		
	


