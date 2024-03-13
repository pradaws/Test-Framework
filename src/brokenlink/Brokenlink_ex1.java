package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink_ex1 {

	
		public static WebDriver driver;
		public static void main(String[] args) throws IOException {
			
			//launching web browser
			driver=new ChromeDriver();
			//open the web application
			driver.get("http://www.deadlinkcity.com/");
			driver.manage().window().maximize();
			//find the no of links in a web page
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println("Total number of links:"+links.size()); //48
			
			int brokenlinks=0;
			
			for(WebElement linkEle:links)
			{
				String hrefAttValue=linkEle.getAttribute("href");
				
				// pre-requisite for checking broken link
				if(hrefAttValue==null || hrefAttValue.isEmpty())
				{
					System.out.println("href attribute value is empty.");
					continue;
				}
				
				//Checking link is broken or not
				URL url=new URL(hrefAttValue); // convert String --> URL format
				//open the conncetion			
				HttpURLConnection conn=(HttpURLConnection) url.openConnection(); ////send request to server - open , connect
				//connect the conncetion
				conn.connect();
				
				if(conn.getResponseCode()>=400)
				{
					System.out.println(hrefAttValue+"     "+"====> Broken Link");
					brokenlinks++;
				}
				else
				{
					System.out.println(hrefAttValue+"     "+"====> Not Broken Link");
				}
				
				
			}
			System.out.println("total number of broken links"+  brokenlinks );
	}

}
