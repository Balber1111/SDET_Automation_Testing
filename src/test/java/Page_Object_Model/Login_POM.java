package Page_Object_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



// Creation of POM(Page Object Model) class

public class Login_POM {
	
	WebDriver driver; //Global variable
	
	//Constructor
	
	Login_POM(WebDriver driver)
	{
	  this.driver=driver;
	}
	
	
	//Locate the Elements 
	By logo=By.cssSelector("img[alt='company-branding']");
	By user_name= By.name("username"); //This is the way to locate elements in POM
	By pass_word= By.name("password");
	By clickbutton=By.xpath("//button[@type='submit']");
	
	//Actions
	

  public void setUserName(String username) 
  {
	driver.findElement(user_name).sendKeys(username) ;
  }
 
  public void setUserPassword(String password) 
  {
	driver.findElement(pass_word).sendKeys(password) ;
  }
 
  public void clickSubmit()
  {
	driver.findElement(clickbutton).click() ;
  }
  
  public boolean checkLogo()
  {
	boolean status= driver.findElement(logo).isDisplayed() ;
	return status;
  }
  
}
