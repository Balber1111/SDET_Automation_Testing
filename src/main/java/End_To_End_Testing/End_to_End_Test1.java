package End_To_End_Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End_to_End_Test1 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://blazedemo.com/");
	    
	    WebElement dropdown1=driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
	    Select drop=new Select(dropdown1); 
		drop.selectByVisibleText("Portland");
		Thread.sleep(2000);
		
		WebElement dropdown2=driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		
       Select dropp=new Select(dropdown2); 
	   dropp.selectByVisibleText("New York");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
       
	   int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("number of rows in table:"+rows);
	
	// Capture prices then store in array
		
		String pricesArr[]=new String[rows];   //0-4
		
		for(int r=1;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
			pricesArr[r-1]=price; //adding price into array
		}
		
	// Sort prices then find lower price value
		
		for(String arrvalue:pricesArr)
		{
			System.out.println(arrvalue);
		}
		
		Arrays.sort(pricesArr); // this will able to sort strings. so no need to convert to number
		String lowestPrice=pricesArr[0];
		System.out.println("Lower price:"+lowestPrice);
		
	// Find record in table having lower price
		
		for(int r=1;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
			
			if(price.equals(lowestPrice))
			{
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
				break;
			}

		}
		
	// Fill the details then click on Purchase Filight button
		
		driver.findElement(By.id("inputName")).sendKeys("John");
		driver.findElement(By.id("address")).sendKeys("1403 American Beauty Ln");
		driver.findElement(By.id("city")).sendKeys("Columbus");
		driver.findElement(By.id("state")).sendKeys("OH");
		driver.findElement(By.id("zipCode")).sendKeys("43240");
		driver.findElement(By.id("creditCardNumber")).sendKeys("6789067345231267");
		driver.findElement(By.id("creditCardYear")).clear();
		driver.findElement(By.id("creditCardYear")).sendKeys("2022");
		driver.findElement(By.id("nameOnCard")).sendKeys("John Canedy");
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
	
	// Validation
		String msg=driver.findElement(By.xpath("//h1")).getText();
		
		if(msg.contains("Thank you for your purchase"))
		{
			System.out.println("Success !! Passed");
		}
		else
		{
			System.out.println("Failed");	
		}
	
		driver.quit();
		
	
}

}