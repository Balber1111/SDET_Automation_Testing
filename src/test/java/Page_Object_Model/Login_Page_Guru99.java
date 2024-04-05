package Page_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Guru99 {
	
WebDriver driver; //Global variable
	
	//Constructor
	
Login_Page_Guru99(WebDriver driver)
	{
	  this.driver=driver;
	  PageFactory.initElements(driver, this); //PageFactory is class and initElements is method
	//When we use PageFactory, we do not need to use locate element in normal way, we can use @FindBy notation
	}


 //Locate the Elements // Using Notation @FindBy with help of PageFactory class

   @FindBy(css="img[alt='Guru99 Demo Sites']")
   WebElement logo;
   
   @FindBy(name="userName")
   WebElement user_name;
   
   @FindBy(name="password")
   WebElement pass_word;
   
   @FindBy(xpath="//input[@type='submit']")
   WebElement clickbutton;
	
	//Actions
	

  public void setUserName(String username) 
  {
	user_name.sendKeys(username) ;
  }
 
  public void setUserPassword(String password) 
  {
	pass_word.sendKeys(password) ;
  }
 
  public void clickSubmit()
  {
	clickbutton.click() ;
  }
  
  public boolean checkLogo()
  {
	boolean status= logo.isDisplayed() ;
	return status;
  }
  
}

