package Date_Picker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_1 {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		driver.get("https://jqueryui.com/datepicker/");
		
		//Approach-1
		
		driver.switchTo().frame(0); //// 0 is the index of the frame
		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/13/2024");
		
		//Approach-2
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year="2025";
		String month="March";
		String date="20";
		
		while(true)
		{
			String yr=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			String mon=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();

			 if(year.equals(yr) && month.equals(mon))
			 {
				break; 
			 }
			 
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();//future date click button
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();//past date click button
		}
		
		//Cature date
		
	List<WebElement> alldates= driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));
	 
//   Approach-1 To select date
	
	//for(WebElement dates:alldates)
	//{
	//	if(dates.getText().equals(date))
	//	{
	//	 dates.click();
	//	 break;
	//	 
	// }
	//}
	
//   Approach-2 To select date
	
	for(int i=0; i<alldates.size();i++)
	{
		if(alldates.get(i).getText().equals(date))
		{
			 date.click();
			 break;
		}
	}
	}
}
