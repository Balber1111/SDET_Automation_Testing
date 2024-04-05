package Get_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method_getWindowId {
	public static void main(String[] args) {
		
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String windowid=driver.getWindowHandle();
		System.out.println("The window is is: "  +windowid);
		
	}

}
