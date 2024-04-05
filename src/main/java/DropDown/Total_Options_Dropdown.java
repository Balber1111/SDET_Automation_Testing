package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jdk.jfr.internal.Options;

public class Total_Options_Dropdown {
	public static void main(String[] args)  throws InterruptedException {
			
			
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	      //  WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
			
	     // we need to pass Drop Down here using Select class
	        
	        // Select drop=new Select(dropdown); 
	         
	     //Find total numbers of option available in Country drop-down
	         
	         //List <WebElement> option=drop.getOptions();
	         //System.out.println(option.size());
	         //Thread.sleep(3000);
	         
	       //Print all option available in drop-down
	         
	        // for(int i=0;i<option.size();i++)
	         //{
	        //	 System.out.println(option.get(i).getText());
	        // }
	         
	         
 //Find total numbers of option available in State drop-down
	         
	         WebElement dropdownstate=driver.findElement(By.xpath("//*[@id=\"state-list\"]"));
	     	
	     	 Select dropstate=new Select(dropdownstate);//Select class use for Drop-Down
	         
	         List <WebElement> options=dropstate.getOptions();
	         //System.out.println(option.size());
	         //Thread.sleep(3000);
	         
	       //Print all option available in drop-down
	         
	         for(int i=0;i<options.size();i++)
	         {
	        	 System.out.println(options.get(i).getText());
	         }    
	  }
}
