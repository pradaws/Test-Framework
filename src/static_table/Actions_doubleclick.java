package static_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_doubleclick {

	
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	        
			//launch web browser
			driver=new ChromeDriver();
			//Launch webapplication
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
			
			driver.manage().window().maximize();
			
			driver.switchTo().frame("iframeResult");
			
			WebElement ele1=driver.findElement(By.xpath("//button[text()='Copy Text']"));
			
			Actions ac=new Actions(driver);
			ac.doubleClick(ele1).build().perform();
			
			driver.switchTo().defaultContent();
	}

}
