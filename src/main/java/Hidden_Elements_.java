import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hidden_Elements_ {
public static void main(String[] args) {
	

	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.cssSelector("[type='submit']")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
	WebElement dropdownstate=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i"));
	dropdownstate.click();
	List<WebElement>  options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
	
	System.out.println(options.size());
	
	for(WebElement op:options)
	{
		System.out.println("The hidden options are: ");
	}
	
   }
}
