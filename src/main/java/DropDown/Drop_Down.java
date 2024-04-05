package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");//You can use navigateto method as well instead of get method
        WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
		
         Select drop=new Select(dropdown);  // we need to pass Drop Down here using Select class
 		
         //Selecting one option from Drop-down
		
		drop.selectByVisibleText("India");
		Thread.sleep(3000);
	//	driver.close();		
         
         //Selecting Drop-down using index
         
   //      drop.selectByIndex(4); //Indexing only support integer value not string value
   //      Thread.sleep(3000);
   //  	 driver.close();	
         
       //Selecting Drop-down using value
         
         //drop.selectByValue("4"); //Value is an attribute and we can pass value as string
     	 //Thread.sleep(3000);
        //driver.close();	
     	 
     	WebElement dropdownstate=driver.findElement(By.xpath("//*[@id=\"state-list\"]"));
	
     	 Select dropstate=new Select(dropdownstate);
     	
     	//Selecting one option from State Drop-down
		
     	//dropstate.selectByVisibleText("Delhi");
		//Thread.sleep(3000);
		//driver.close();  
		
		//Selecting State Drop-down using index
        
		      // dropstate.selectByIndex(23); //Indexing only support integer value not string value
		      //  Thread.sleep(3000);
		      //	 driver.close();
     	 
       //Selecting State Drop-down using value
         
     	//dropstate.selectByValue("23"); //Value is an attribute and we can pass value as string
     	// Thread.sleep(3000);
        //driver.close();
     	 
     	 
     
      
    		
   }
}