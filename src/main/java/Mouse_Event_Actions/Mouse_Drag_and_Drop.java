package Mouse_Event_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Drag_and_Drop {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement USA =driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement Washigton =driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		
		Actions action= new Actions(driver);
		
		//dragAndDrop() method
		action.dragAndDrop(Washigton,USA).build().perform();
		Thread.sleep(3000);
	
	}

}
