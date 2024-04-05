package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2"); 
        driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
        List <WebElement> list=driver.findElements(By.xpath("//*[@class=\"multiselect-container dropdown-menu\"]/child::*"));
        System.out.println(list.size());
        Thread.sleep(3000);
     
   // Using simple for loop
       //  for(int i=0;i<list.size();i++)
      //  {
      // 	 System.out.println(list.get(i).getText());
      // }  
        
   // Select the option from drop-down
      // for(int i=0;i<list.size();i++)
      // {
      //    if(list.get(i).getText().equals("Python"))
      // {
      //  		list.get(i).click();
     //   		break;
     //   	}
 
     //   }
       
       for(int i=0;i<list.size();i++)
       {
    	   String OptionName=list.get(i).getText();
    	   
       	if(OptionName.equals("Java") || OptionName.equals("Python"))
       	{
       		list.get(i).click();
    
       	}
       }
	}
}
