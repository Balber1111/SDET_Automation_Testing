package Page_Object_Model;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM_Page_Factory {
WebDriver driver; //Global variable
	
	//Constructor
	
Login_POM_Page_Factory(WebDriver driver)
	{
	  this.driver=driver;
	  PageFactory.initElements(driver, this); //PageFactory is class and initElements is method
	//When we use PageFactory, we do not need to use locate element in normal way, we can use @FindBy notation
	}


 //Locate the Elements // Using Notation @FindBy

   @FindBy(css="img[alt='company-branding']")
   WebElement logo;
   
   @FindBy(name="username")
   WebElement user_name;
   
   @FindBy(name="password")
   WebElement pass_word;
   
   @FindBy(xpath="//button[@type='submit']")
   WebElement clickbutton;
	
	//Locate the Elements // Using By class
	//By logo=By.cssSelector("img[alt='company-branding']");
	//By user_name= By.name("username"); //This is the way to locate elements in POM
	//By pass_word= By.name("password");
	//By clickbutton=By.xpath("//button[@type='submit']");
	
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

