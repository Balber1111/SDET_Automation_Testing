package DropDown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_Auto_DropDown {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.bing.com/"); 
		driver.findElement(By.name("q")).sendKeys("java");
        List <WebElement> list=driver.findElements(By.xpath("//*[@class=\"sa_tm\"]//span"));	
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
     	   
        	if(OptionName.equals("java download")) //in auto drop down, we only able to select one option at a time
        	{
        		list.get(i).click();
     
        	}
        }
        
	}

}
