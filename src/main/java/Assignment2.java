import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
       
       
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.example.com");
        driver.findElement(By.linkText("Open New Window")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(handle);
                break;
            }
        }
        driver.close();
        driver.switchTo().window((String) windowHandles.toArray()[0]);
        driver.close();
    }
}		