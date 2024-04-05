package Mouse_Event_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Drag_Drop2 {
		
		
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.get("https://demo.guru99.com/test/drag_drop.html");
				
			WebElement Bank=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
	        WebElement Account=driver.findElement(By.xpath("//*[@id='bank']/li"));
	        
	        WebElement five1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));	
	        WebElement Amount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	        
	        WebElement Sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));	
	        WebElement Accountt=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	        
	        WebElement five2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));	
	        WebElement Accounttt=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	    		
	        Actions act=new Actions(driver);
	        Thread.sleep(2000);
	        act.dragAndDrop(Bank, Account).build().perform();
	        Thread.sleep(2000);
	        act.dragAndDrop(five1, Amount).build().perform();
	        Thread.sleep(2000);
	        act.dragAndDrop(Sales, Accountt).build().perform();
	        Thread.sleep(2000);
	        act.dragAndDrop(five2, Accounttt).build().perform();  
	        Thread.sleep(3000);
	        String text= driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).getText();
	        System.out.println(text);
		}
}
