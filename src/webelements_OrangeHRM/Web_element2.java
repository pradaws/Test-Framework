package webelements_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element2 {

		
		public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			//Launch WebApplication
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
	       driver=new ChromeDriver();
	       
	       //Launch WebApplication
	       driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php");
	       
	       WebElement username= driver.findElement(By.name("username"));
			//sendkeys();pass some arguments into the input box
			username.sendKeys("pradeep123");
			
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys("India@123");
			
			WebElement loginbtn=driver.findElement(By.id("login"));
			loginbtn.click();
	       
	       //back();
	       driver.navigate().back();
	       Thread.sleep(2000);
	       
	       //forward();
	       driver.navigate().forward();
	       Thread.sleep(2000);
	       
	       //refresh
	       driver.navigate().refresh();
		

	}

}
