package Capture;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_orange_particular {

	
		public static WebDriver driver;
		public static void main(String[] args) throws IOException, InterruptedException {
			
			
			//Launching the Web browser
			driver=new ChromeDriver();
			
			//launching the Web Application
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			
			driver.findElement(By.name("password")).sendKeys("admin123");
			
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
		    driver.findElement(By.xpath("//span[text()='PIM']")).click();
	
			
		    String exp_title="OrangeHRM1";
			
			String Act_title=driver.getTitle();
			
			if(Act_title.equals(exp_title)) {
				System.out.println("testcase is passed");
			}else {
				System.out.println("testcase is failed");
			}
			
			//initialize the TakesScreenshot interface
			Thread.sleep(3000);	
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			

			
			File src1=ts.getScreenshotAs(OutputType.FILE);//
			File destination2=new File("C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\cap2.png");
			FileUtils.copyFile(src1,destination2);
	}

}
