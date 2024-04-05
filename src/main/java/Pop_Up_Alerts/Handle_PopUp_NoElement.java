package Pop_Up_Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_PopUp_NoElement {
	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //implicit wait
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //explicit wait
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); 
		String message=driver.findElement(By.cssSelector("div[class='example']p")).getText();
		
		if(message.contains("Congratulations"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}
}
