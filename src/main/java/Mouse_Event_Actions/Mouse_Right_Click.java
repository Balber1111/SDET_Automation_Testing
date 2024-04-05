package Mouse_Event_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Right_Click {
		
		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
			//driver.get("https://demo.opencart.com/");
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement button =driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	
	 Actions action=new Actions(driver);
	 Thread.sleep(2000);
	 action.contextClick(button).build().perform();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
	 Thread.sleep(2000);
     driver.switchTo().alert().accept()	;
	 
	
		
		
	}

}