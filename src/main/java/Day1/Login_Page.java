package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login_Page {
	
	
				public static void main(String[] args) {
					
				ChromeDriver driver=new ChromeDriver(); 
				
				driver.get("https://demo.guru99.com/test/newtours/index.php");
				
				driver.findElement(By.name("userName")).sendKeys("mercury");
				driver.findElement(By.name("password")).sendKeys("mercury");
				driver.findElement(By.name("submit")).click();
				
				// driver.findElement(null) use to fetch elements on webpage
				
				// driver.close(); //use to close the browser
				String act_value=driver.getTitle(); //string value
				 
				String ex_value="Login: Mercury Tours";
				
				if(act_value.equals(ex_value))
				{
					System.out.println("Test is pass");
				}
				else
				{
					System.out.println("Test is fail");
				}
	}

}
