package scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	
		public static WebDriver driver;
		public static void main(String[] args) {
			
			//launching Web browser
					driver=new ChromeDriver();
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					//launching web application
					driver.get("https://www.hubilo.com/");
					driver.manage().window().maximize();
					
					//scrolling by using pixel values(250,1000)
					//scroll down till the element is presented
					//scroll down till the web page ending
					//scroll up 
					
					//INitialize the JavascriptExecutor
					
					JavascriptExecutor jse=(JavascriptExecutor)driver;
					
					////scrolling by using pixel values(250,1000)
				/*jse.executeScript("window.scrollBy(0,4000)", "");
				System.out.println("scrolling is completed by using pixel val;ues");
			    System.out.println(jse.executeScript("return window.pageYOffset;"));*/
	               
// scrolling down till the element present
				
		/*WebElement ele1=driver.findElement(By.xpath("//h2[text()='Hubilo case studies']"));
		
		jse.executeScript("arguments[0].scrollIntoView();", ele1);
		System.out.println(jse.executeScript("return window.pageYOffset;"));*/
					
					//scroll down upto end of the page
					
					jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					
					System.out.println(jse.executeScript("return window.pageYOffset;"));
					
					//scroll up 
					jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
					System.out.println(jse.executeScript("return window.pageYOffset;"));		
				
	

	}

}
