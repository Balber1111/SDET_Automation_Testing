package Data_Driven_Framework_Selenium;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_Excel_ForLoop {
	
public static void main(String[] args) throws IOException {
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+ "\\ExcelFile\\Book1.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(); //We will create sheet
		XSSFSheet sheet=workbook.createSheet("Sheet1"); //Create sheet
		
		Scanner sc=new Scanner(System.in);
		
		for(int r=0;r<3;r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
			
			for(int c=0;c<2;c++)
			{
				//currentRow.createCell(c).setCellValue("Welcome");// For entering Same data in every cell
			 System.out.println("Enter the value of cell");
			 String data =sc.next();
			 currentRow.createCell(c);
			 
			 workbook.write(file); //writing
			 workbook.close();
			 file.close();
			 System.out.println("Writing of file is completed");
			
			}
		}
		

}
}
