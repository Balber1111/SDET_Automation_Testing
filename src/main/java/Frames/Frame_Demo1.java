package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_Demo1 {
	public static void main(String[] args) {
		

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello Frames");
		
		driver.switchTo().frame("frm1")	;	//locating frame with id/name
		WebElement drop=driver.findElement(By.xpath("//select[@id='course']"));
		Select dropdown=new Select(drop);
		dropdown.selectByVisibleText("Java");
		
		
	}

}
