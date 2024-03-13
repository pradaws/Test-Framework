package Capture;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Element {

	
		public static WebDriver driver;
		public static void main(String[] args) throws IOException, InterruptedException {
			
			
			//Launching the Web browser
			driver=new ChromeDriver();
			
			//launching the Web Application
			
			driver.get("https://www.orangehrm.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		    
		  
		    String exp_title="OrangeHRM1";
			
			String Act_title=driver.getTitle();
			
			if(Act_title.equals(exp_title)) {
				System.out.println("testcase is passed");
			}else {
				System.out.println("testcase is failed");
			}
			
			//initialize the TakesScreenshot interface
			Thread.sleep(3000);	
			
			TakesScreenshot ts =(TakesScreenshot)driver;
			
			WebElement el=driver.findElement(By.name("action_request"));
			
			File src=el.getScreenshotAs(OutputType.FILE);
			File dest= new File("C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\element.JPG");
			FileUtils.copyFile(src, dest);
	}

}
