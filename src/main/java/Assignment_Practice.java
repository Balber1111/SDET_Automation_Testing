import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Practice {
	public static void main(String[] args) {
	
			
			ChromeDriver driver=new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/newtours/index.php");
			
			driver.findElement(By.name("userName")).sendKeys("user123");
			driver.findElement(By.name("password")).sendKeys("password456");
			
	}
}
