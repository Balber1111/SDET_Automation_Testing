package Data_Driven_Framework_Selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_Excel {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+ "\\ExcelFile\\Book1.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(); //We will create sheet
		XSSFSheet sheet=workbook.createSheet("Sheet1"); //Create sheet
		
		//Without for loop//When we have limited data
		
		XSSFRow row =sheet.createRow(0); //Create row
		row.createCell(0).setCellValue("Welcome"); //Create cell
		row.createCell(1).setCellValue("To");
		row.createCell(2).setCellValue("Automation");
		
		XSSFRow row1 =sheet.createRow(1); //Create row
		row1.createCell(0).setCellValue("Join"); //Create cell
		row1.createCell(1).setCellValue("Core");
		row1.createCell(2).setCellValue("Java");
		
		workbook.write(file); //writing
		workbook.close();
		file.close();
	}

		
}
