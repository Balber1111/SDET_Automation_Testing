package Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnselectCheckbox_if_selected {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Count the no of options available in check-boxs
		
		List <WebElement> checkboxes=driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type='checkbox']"));
		
		System.out.println("The no. of checkboxs are: " +checkboxes.size());
		
	    //Select first three  check-boxes and then un-check selected check-boxes
		
		for(int i=0;i<2;i++)
		{
			checkboxes.get(i).click();
		}
		 Thread.sleep(3000);
		for (int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected());
			{
				checkboxes.get(i).click();
		    }
	}
  }
}
