import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	public static void main(String[] args) {
		
		ChromeDriver  driver= new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=yKCAxwOKex8");
		driver.findElement(By.xpath("//*[@id='yt-logo-red-updated-svg_yt52']")).click();
		
		
		
		
		
	}

}
