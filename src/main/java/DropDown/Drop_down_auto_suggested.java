package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_auto_suggested {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.google.com/"); 
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
        List <WebElement> list=driver.findElements(By.xpath("//*[@class=\"wM6W7d\"]//span"));	
        System.out.println("The number of elements are: "+ list.size());
        
      //Print all option available in drop-down
        
        for(int i=0;i<list.size();i++)
         {
        	 System.out.println(list.get(i).getText());
         }
        
        //Select particular option from drop-down
        
        for(int i=0;i<list.size();i++)
        {
     	   String OptionName=list.get(i).getText();
     	   
        	if(OptionName.equals("selenium tutorial")) //in auto drop down, we only able to select one option at a time
        	{
        		list.get(i).click();
     
        	}
        }
        
	}

}
