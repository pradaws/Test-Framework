package file_upload;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_autoit_task {

	
		public static WebDriver driver;
		public static void main(String[] args) throws AWTException, InterruptedException, IOException {


			//launching web browser

			driver=new ChromeDriver();

			//launching the web application

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.foundit.in/seeker/registration");
			driver.manage().window().maximize();

			
			WebElement ele1=driver.findElement(By.className("uploadResume"));
			

			Actions ac=new Actions(driver);
			ac.moveToElement(ele1).click().perform();
			
		   
			
			Runtime.getRuntime().exec("C:\\Users\\Dell\\Documents\\auto2.exe"+"  "+"‪C:\\Users\\Dell\\Downloads\\Pradeep_Hubilo_Description.docx");
			
			Thread.sleep(1000);
			
			System.out.println("fileuploading activity is completed");

	}

}
