package Pop_Up_Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Ok_Popup {
public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts"); 
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		//Alert---special class for handling the pop ups/alert window
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();  //this will click on ok on popup
		String text=driver.findElement(By.id("result")).getText();	
		if(text.equals("You successfully clicked an alert"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");	
		}
		
		
	}

}
