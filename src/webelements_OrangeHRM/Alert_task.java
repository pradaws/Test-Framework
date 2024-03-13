package webelements_OrangeHRM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_task {

	
		public static WebDriver driver;
		public static void main(String[] args)  {

			//launch web browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//launch web application
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
			//Normal alert
			/*WebElement ele1=driver.findElement(By.xpath("//button[text()='Click me']"));  
			ele1.click();
		    driver.switchTo().alert().accept();
		    
		    //confirm alert
		    WebElement ele2=driver.findElement(By.xpath("//button[@id='confirmBox' and text()='Click me']"));  
			ele2.click();
			
			
			//a.accept();
			//a.dismiss();*/
			
			//prompt alert
			WebElement ele3=driver.findElement(By.xpath("//button[@id='promptBox' and text()='Click me']"));
			ele3.click();
			org.openqa.selenium.Alert a = driver.switchTo().alert();
			a.sendKeys("str");
			a.accept();
			
			
			
			
			
	}

}
