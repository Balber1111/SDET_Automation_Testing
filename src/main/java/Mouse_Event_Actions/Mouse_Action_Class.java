package Mouse_Event_Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
WebElement button =driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

//Actions class mandatory required to perform mouse actions 
 Actions action=new Actions(driver); 
 Thread.sleep(2000);
 
 
 //build()--create the steps
 //perform()--execute the steps
 
//Action class use to perform generated/created steps after storing
 
 Action steps=action.contextClick(button).build();
 steps.perform();
 driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
 Thread.sleep(2000);
 driver.switchTo().alert().accept();
 Thread.sleep(2000);	
	
	}	

}
