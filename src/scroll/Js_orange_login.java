package scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_orange_login {

	
		public static WebDriver driver;
		public static void main(String[] args) {
			
			
			//launching Web browser
			driver=new ChromeDriver();
			
			
			//launching web application
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			WebElement ele1=driver.findElement(By.name("username"));
			ele1.sendKeys("Admin");
			
			WebElement ele2=driver.findElement(By.name("password"));
			ele2.sendKeys("admin123");
			
			WebElement ele3=driver.findElement(By.xpath("//button[@type='submit']"));
			
			//initialize the JSE
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			
			jse.executeScript("arguments[0].click();", ele3);
			System.out.println("it's executed");
			
			WebElement ele4=driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]/a"));
			
			jse.executeScript("arguments[0].click();", ele4);
		
			driver.manage().window().maximize();
			
			jse.executeScript("window.scrollBy(0,5000)","");
			
			System.out.println("Scrolling is completed");
			
			System.out.println(jse.executeScript("return window.pageYOffset;"));
			
			jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			System.out.println(jse.executeScript("return window.pageYOffset;"));
			
	}

}
