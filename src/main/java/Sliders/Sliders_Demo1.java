package Sliders;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders_Demo1 {
	
	
public static void main(String[] args) {
	
	//    Minimum slider---Increase the slider
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		//driver.get("https://demo.opencart.com/");
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
       
 
        
        WebElement element=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
	
        System.out.println("Location of element before slide: " +element.getLocation()); //To get Pixel value for the element
        
        //We use Action class to change the pixel
        
        Actions action= new Actions(driver);
     // We gonna change the value of X(Horizontal) not Y(Vertical) Because on link there is no Y (Vertical) slider available
        action.dragAndDropBy(element,100,0).build().perform(); 
        System.out.println("Location of element after slide: " +element.getLocation()); 
        
        
        

}
}
