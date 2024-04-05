package Get_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle
		
		System.out.println("The title of the page is: " + driver.getTitle());
		
		//getUrl
		
		System.out.println( "The URL of the page is: " + driver.getCurrentUrl());
		
		//getPageSource
		
		System.out.println("The Page Source of the page is: " + driver.getPageSource());
		
		
				

	}

}
