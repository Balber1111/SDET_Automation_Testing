package Data_Driven_Framework_Selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fixed_Deposit_Calculator {
	public static void main(String[] args) throws IOException {
		
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		String file=System.getProperty("user.dir")+"\\ExcelFile\\SBI Interest.xlsx"; //path of excel sheet
		
		int rows = ExcelUtils.getRowCount(file, "Sheet1");  // It will give total number of rows from Excel sheet
		
		// Read the data
		
		for(int i=1;i<=rows;i++)
		{
		  String principle= ExcelUtils.getCellData(file, "Sheet1", i, 0);
		  String RateOfInterest=ExcelUtils.getCellData(file, "Sheet1", i, 1);
		  String Period1=ExcelUtils.getCellData(file, "Sheet1", i, 2);
		  String Period2=ExcelUtils.getCellData(file, "Sheet1", i, 3);
		  String Frequency=ExcelUtils.getCellData(file, "Sheet1", i, 4);
		  String ExpectedValue=ExcelUtils.getCellData(file, "Sheet1", i, 5);
		
		//Pass the data to application/Web-page
		
		driver.findElement(By.name("principal")).sendKeys(principle);
		driver.findElement(By.name("interest")).sendKeys(RateOfInterest);
		driver.findElement(By.name("tenure")).sendKeys(Period1);
		
		Select PeriodDrop=new Select(driver.findElement(By.name("tenurePeriod")));
		PeriodDrop.selectByVisibleText(Period2);
		
		Select frequencyDrop=new Select(driver.findElement(By.id("frequency")));
		frequencyDrop.selectByVisibleText(Frequency);
		
		// Clicking on calculate button
		driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img")).click();
		
		// or using JavaScript if in case you unable to perform click
		
		//JavascriptExecutor js= driver;
		
		String actualValue=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
		
		if(Double.parseDouble(ExpectedValue)==Double.parseDouble(actualValue))
		{
			System.out.println("Test Passed");// Printing on console);
			ExcelUtils.setCellData(file, "Sheet1", i, 7, "Passed");
			ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
		}
		else
		{
			System.out.println("Test Failed");
			ExcelUtils.setCellData(file, "Sheet1", i, 7, "Failed");
			ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
		}
		driver.findElement(By.xpath("//img[@class='PL5']")).click();
		
		
			
		
		
		//Validation and write the data to table
		
		}	
	}

}
