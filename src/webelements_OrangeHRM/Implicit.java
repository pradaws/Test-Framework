package webelements_OrangeHRM;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void main(String[] args) {
		
		//launching browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//launch web application
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement ele1 = driver.findElement(By.name("username"));
		ele1.sendKeys("Admin");
		
		WebElement ele2= driver.findElement(By.name("password"));
		ele2.sendKeys("admin123");
		
		
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	   // driver.close();
	    
	    
		
	
		
		
		
	}
	
}		
		
		
			
		