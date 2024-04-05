package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_Demo2 {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		driver.get("https://ui.vision/demo/webtest/frames/");
		
//frame1
		WebElement f1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(f1);
		driver.findElement(By.name("mytext1")).sendKeys("1234");
		
		driver.switchTo().defaultContent(); //move the web-driver to default web-page
		
//frame3		
		WebElement f3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(f3);
		driver.findElement(By.name("mytext3")).sendKeys("12345");
		
		
	}

}
