package Get_Method;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method_getWindowIds {
public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM,Inc']")).click(); //will open the web page
	 Set <String> windowids=driver.getWindowHandles(); // Set//  we use when we do not use indexing and to avoid duplicate values	
	
	 for (String winids:windowids)
	 {
	System.out.println(winids);
	 }
	 driver.close();
}
}
