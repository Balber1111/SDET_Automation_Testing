package Data_Driven_Framework_Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Excel {
	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream file= new FileInputStream (System.getProperty("user.dir")+ "\\ExcelFile\\Book1.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file); //Tell the workbook which file needs to be opened
		XSSFSheet  sheet= workbook.getSheet("Sheet1"); //Mention the sheet no. of excel sheet to fetch data
	//or	//XSSFSheet  sheet=workbook.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();	//Return row no.	
		int columns=sheet.getRow(1).getLastCellNum();//Return column no.
		
		System.out.println("The number of rows are :" + rows);
		System.out.println("The number of columns are :" + columns);
		
		for(int r=0;r<=rows;r++) //rows
		{
		    XSSFRow	currentRow=sheet.getRow(r); //0,1,2,3,4,5...
			for(int c=0;c<columns;c++) //columns
			{
		    //XSSFCell cellValue=currentRow.getCell(c);
		    //String cell=cellValue.toString()
				
				 //or
		    String cellValue=currentRow.getCell(c).toString(); //Need to store excel cell data in string form to get it
			System.out.println(cellValue+ "   ");
			}
			System.out.println();// Used for formatting
		}
		workbook.close();
		file.close();
	}
}
