package Mouse_Event_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Double_Click {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		//driver.get("https://demo.opencart.com/");
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.switchTo().frame("iframeResult");
        
        WebElement frame=driver.findElement(By.id("field1"));
        frame.clear();
        frame.sendKeys("Welcome");
        WebElement copytextbutton=driver.findElement(By.xpath("//buttopn[normalize-space()='Copy Text']"));
        
        Actions action= new Actions(driver);
        
        //perform double click method
        action.doubleClick(copytextbutton).perform();
        
        //validation
        
        WebElement frame2=driver.findElement(By.xpath("//input[@id='field2']"));
        // String text=frame2.getText(); //getText() return only inner text of button or box
        // System.out.println(text);
         
        
      //return value of mentioned attribute (here we have field1 and field2 attribute)
        String text= frame2.getAttribute("value"); 
        
        System.out.println(text);
       
        if(text.equals("welcome"))
         {
        	 System.out.println("Test is passed");
         }
         else
         {
        	 System.out.println("Test is failed");
         }   
        
}

}