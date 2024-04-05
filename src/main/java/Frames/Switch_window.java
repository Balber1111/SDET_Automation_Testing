package Frames;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_window {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		//get/store the window id
		Set <String> windowids=driver.getWindowHandles(); // window handles implement using set because it do not store duplicate value
//as we have to differentiate between 2 windows id, as Set does not support indexing and window ID store in index, we need to convert Set in array-list which support indexing to store window ID
		
		//Approach-1 To convert Set to arraylist: List-----array-list
		
		List <String> arraylist =new ArrayList<String>(windowids); //set is coverted into arraylist
		
		String parentwindowid=arraylist.get(0);
		String childwindowid=arraylist.get(1);
		
        driver.switchTo().window(childwindowid);
        driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentwindowid);
       
	}

}
