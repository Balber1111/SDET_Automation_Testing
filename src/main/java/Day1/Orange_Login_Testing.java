package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Login_Testing {
	
	public static void main(String[] args) throws InterruptedException {
						
					ChromeDriver driver=new ChromeDriver(); 
					
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					Thread.sleep(3000); //three second
					driver.findElement(By.name("username")).sendKeys("Admin");
					Thread.sleep(3000);
					driver.findElement(By.name("password")).sendKeys("admin123");
					Thread.sleep(3000);
					driver.findElement(By.className("oxd-button")).click();
			
					
					// driver.findElement(null) use to fetch elements on webpage
					
					// driver.close(); //use to close the browser
					String act_value=driver.getTitle(); //string value
					 
					String ex_value="OrangeHRM";
					
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
