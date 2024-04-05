package Data_Driven_Framework_Selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CD_Calculator {
public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
		String file=System.getProperty("user.dir")+"\\ExcelFile\\CIT Bank Interest.xlsx"; //path of excel sheet
		
		int rows = ExcelUtils.getRowCount(file, "Sheet1");  // It will give total number of rows from Excel sheet
		
		// Read the data
		
		for(int i=1;i<=rows;i++)
		{
		  String InDepoAm= ExcelUtils.getCellData(file, "Sheet1", i, 0);
		  String LengthCD=ExcelUtils.getCellData(file, "Sheet1", i, 1);
		  String InterestRate=ExcelUtils.getCellData(file, "Sheet1", i, 2);
		  String Comounding=ExcelUtils.getCellData(file, "Sheet1", i, 3);
		  String Expected=ExcelUtils.getCellData(file, "Sheet1", i, 4);
		
		//Pass the data to application/Web-page
		
		driver.findElement(By.id("mat-input-0")).clear();
		driver.findElement(By.id("mat-input-0")).sendKeys(InDepoAm);
		driver.findElement(By.id("mat-input-1")).sendKeys(LengthCD);
		driver.findElement(By.id("mat-input-2")).sendKeys(InterestRate);
		
		driver.findElement(By.xpath("//*[@id='mat-select-0']/div/div[2]")).click();
		
		Select CompoundDrop=new Select(driver.findElement(By.id("//*[@id=\"mat-select-0-panel\"]//*[@role=\"option\"]")));
		CompoundDrop.selectByVisibleText(Comounding);
		
		// Clicking on "Let's run the numbers" button
		
		//driver.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]")).click();
		
		JavascriptExecutor js= driver;
		WebElement LetsRun_Btn= driver.findElement(By.xpath("//*[@id=\\\"CIT-chart-submit\\\"]"));
		js.executeScript("arguments[0].click();", LetsRun_Btn);
		
		
		
		String Actual=driver.findElement(By.xpath("//*[@id=\"resultBox\"]")).getText();
		
		//Validation and write the data to table
		
		if(Double.parseDouble(Expected)==Double.parseDouble(Actual))
		{
			System.out.println("Test Passed");// Printing on console);
			ExcelUtils.setCellData(file, "Sheet1", i, 5, "Passed"); //Writing Data
			ExcelUtils.fillGreenColor(file, "Sheet1", i, 5);
		}
		else
		{
			System.out.println("Test Failed");
			ExcelUtils.setCellData(file, "Sheet1", i, 5, "Failed"); //Writing Data
			ExcelUtils.fillRedColor(file, "Sheet1", i, 5);
		}
		
		Thread.sleep(7000);
		
		
		
		
		}	
	}

}
