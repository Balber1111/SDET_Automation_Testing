package Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String[] args) {
		
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Count the no of options available in check-boxs
		
		List <WebElement> checkboxes=driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type='checkbox']"));
		
		System.out.println("The no. of checkboxs are: " +checkboxes.size());
		
	    //Select all the check-boxes
		
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
	}

}
