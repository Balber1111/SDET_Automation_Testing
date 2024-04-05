import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.cssSelector("input[id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
		driver.switchTo().defaultContent();
		
		Set<String> windowsids=driver.getWindowHandles();
		for(String windids:windowsids )
		{
			System.out.println(windids);
		}
		
  }
}
