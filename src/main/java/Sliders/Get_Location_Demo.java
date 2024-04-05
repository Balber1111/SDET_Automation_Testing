package Sliders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location_Demo {
	
public static void main(String[] args) {
	
	ChromeDriver driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   

    
    WebElement Getlocation=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
     
    //It always provide different location of the logo or an element
	
	System.out.println("The value of element before maximize: " +Getlocation.getLocation());
	
	driver.manage().window().maximize();
	
	System.out.println("The value of element after maximize: " +Getlocation.getLocation());
	
	driver.manage().window().minimize();
	
	System.out.println("The value of element after minimize: " +Getlocation.getLocation());
	
	driver.manage().window().fullscreen();
	
	System.out.println("The value of element after fullscreen: " +Getlocation.getLocation());
	
	Point point=new Point(84,35); // Point class use to set particular size to open window
    driver.manage().window().setPosition(point);
    System.out.println("The value of element after setting position: " +Getlocation.getLocation());
	
    point=new Point(80,90);
    driver.manage().window().setPosition(point);
    System.out.println("The value of element after setting position: " +Getlocation.getLocation());
    
  }
}
