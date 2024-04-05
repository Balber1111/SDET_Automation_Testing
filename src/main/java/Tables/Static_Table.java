package Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Table { 
	public static void main(String[] args) {
	
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://testautomationpractice.blogspot.com/");
    
//    Easy approach to get the rows from web table if we have single table on web-page
    
    //int rows= driver.findElements(By.tagName("tr")).size();  // size of list(rows)//tagName
    //System.out.println("Total number of rows are: " + rows);
    
// 2nd approach
    int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();  // size of list(rows)//CusXpath
    System.out.println("Total number of rows are: " + rows);
    
//Easy approach to get the columns from web table if we have single table on web-page
    
    //int columns= driver.findElements(By.tagName("th")).size();  // size of list(columns)//tagName
    //System.out.println("Total number of columns are: " + columns);
    
// 2nd approach
     int columns= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();  // size of list(columns)//CusXpath
     System.out.println("Total number of columns are: " + columns);
     
   // To print single cell data
     
    // String text= driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[1]")).getText(); //CustXpath for cell
    // System.out.println("The data in the given cell is: " + text );
    
   // To print all table data
    System.out.println("BookName" + "   " + "Author" + "   " + "Subject" +"   " + "Price"); 
     
    for(int r=2;r<=rows;r++) //for rows
    {
  	  for(int c=1;c<=columns;c++) //for columns
  	  {
  		  String TableData= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();  
  		  System.out.print(TableData);
  	  }
  	      System.out.println();
    }
    
    // Print value of a specific column cell when rows value are changing
    
    for( int r=2;r<=rows;r++)
    {
  	  String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
  	  if (value.equals("Amit"))
      		  {
      	  String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
      	  System.out.println(BookName);  
      		  }
    }
    
    // Print adding all the value  available in a table
    
    int sum=0;  //To store table value after addition
    
    for(int r=2;r<=rows;r++)
    {
        String price= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
        sum=sum+Integer.parseInt(price); //Type casting int to string
    }
    System.out.println("Additon of all prices of the books is: " + sum);

    
    }

}

