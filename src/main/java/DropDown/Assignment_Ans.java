package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Ans {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
        Select drop=new Select(dropdown);  
		drop.selectByVisibleText("India");
		Thread.sleep(2000);
		for (WebElement option : drop.getOptions()) 
		{
            if (option.isSelected()) {
                System.out.println("Selected option is: " + option.getText());
                break;
            }
        }

        driver.quit();
}
}

	
}
