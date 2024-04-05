package Pop_Up_Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_Pop_Up_Alerts {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //implicit wait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //explicit wait
		driver.get("https://the-internet.herokuapp.com/javascript_alerts"); 
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		//Alert---special class for handling the pop ups/alert window
		
		mywait.until(ExpectedConditions.alertIsPresent()); //alertIsPresent method use for in case of pop up
		
		Alert alert=driver.switchTo().alert(); //driver move to pop up using switchTo() method
		
		// driver.switchTo().alert().accept();
		
		//accept()---click Ok
		//dismiss()---click cancel
		//getText()---get the text of pop up
		
		alert.accept();  //this will click on ok on popup
		String text=driver.findElement(By.id("result")).getText();	
		if(text.equals("You clicked: Ok"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");	
		}
	}
}
