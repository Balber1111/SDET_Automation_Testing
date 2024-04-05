package Special_Classes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link_Demo {
	public static void main(String[] args) throws IOException {
		
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("http://www.deadlinkcity.com/");
	    driver.manage().window().maximize();
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("The number of links are: " + links.size());
	    
	    int brokenlinks=0; //for storing numbers of broken links
	    
	    for(WebElement linkElement:links)  // Links are WebElement not String
	    {
	    	String hrefValue=linkElement.getAttribute("href"); //href contains value in string form
	    	if(hrefValue==null || hrefValue.isEmpty())
	    	{
	    		System.out.println("Link is broken or href value is empty");
	    	    continue;
	    	}
	    	//Connection---We need to send the request to server
	    	
	    	URL linkurl= new URL(hrefValue); //Convert String to URL //URL is a class
	    	HttpURLConnection connection= (HttpURLConnection)linkurl.openConnection();       //Sending request to server
	    	connection.connect();
	        
	    	if(connection.getResponseCode()>400) //To get the status code of link
	    	{
	    		System.out.println(hrefValue + " "+"Broken Link");
	    		brokenlinks++;
	    		}
	    		else
	    		{
	    		System.out.println(hrefValue + " "+" NOT Broken Link");
	    		}
	    	}
	     
	            System.out.println("Total number of broken links are:" + brokenlinks);
	}

}
