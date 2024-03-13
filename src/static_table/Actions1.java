package static_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	        
			//launch web browser
			driver=new ChromeDriver();
			//Launch webapplication
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().window().maximize();
			
			driver .findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//mousehover
			WebElement ele1=driver.findElement(By.xpath("//span[text()='PIM']"));
			
			Actions ac=new Actions(driver);
			ac.moveToElement(ele1).click().perform();
			System.out.println("Click activity is completed");
			

	}

}
