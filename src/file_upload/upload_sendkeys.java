package file_upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class upload_sendkeys {

	
		public static WebDriver driver;
		public static void main(String[] args) throws AWTException, InterruptedException {


			//launching web browser

			driver=new ChromeDriver();

			//launching the web application

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.foundit.in/seeker/registration");
			driver.manage().window().maximize();

			//identify the element

			//JavascriptExecutor exe=(JavascriptExecutor)driver;
			WebElement ele1=driver.findElement(By.className("uploadResume"));
			//perform file upload by using sendkeys();
			
		//	exe.executeScript("arguments[0].click();", ele1);
		//	Thread.sleep(1000);
			
			Actions ac=new Actions(driver);
			ac.moveToElement(ele1).click().perform();

			ele1.sendKeys("‪C:\\Users\\Dell\\Downloads\\Pradeep_Res.docx");
			
			Thread.sleep(1000);
			
			System.out.println("fileuploading activity is completed");

			



	}

}
