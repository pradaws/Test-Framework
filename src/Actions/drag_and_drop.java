package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	        
			//launch web browser
			driver=new ChromeDriver();
			//Launch webapplication
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("http://demo.guru99.com/test/drag_drop.html");
			
			driver.manage().window().maximize();
			
			WebElement Amt=driver.findElement(By.xpath("//ol[@id='amt7']/li"));
			
			WebElement val=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
			
		    Actions ac=new Actions(driver);
		    ac.dragAndDrop(val, Amt).perform();
		    
			

	}

}
