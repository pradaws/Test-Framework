package Capture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_screenshots {

	
		public static WebDriver driver;
		public static void main(String[] args) throws IOException {
			
			
			//Launching the Web browser
			driver=new ChromeDriver();
			
			//launching the Web Application
			
			driver.get("https://adactinhotelapp.com/");
			
			driver.findElement(By.id("username")).sendKeys("mahesh23456");
			
			driver.findElement(By.id("password")).sendKeys("India@123");
			
			
			driver.findElement(By.id("login")).click();
			
			String exp_title="Adactin.com - Search Hotel11";
			
			String Act_title=driver.getTitle();
			
			if(Act_title.equals(exp_title)) {
				System.out.println("testcase is passed");
			}else {
				System.out.println("testcase is failed");
			}
			
			//initialize the TakesScreenshot interface
			
			/*TakesScreenshot ts=(TakesScreenshot)driver;
				
			File src=ts.getScreenshotAs(OutputType.FILE);//
			File destination1=new File("C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\newone.png");
			FileUtils.copyFile(src,destination1);*/
			
			TakesScreenshot ts1=(TakesScreenshot)driver;
			WebElement ele1=driver.findElement(By.xpath("//table[@class='login']"));
			
			File src1=ele1.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\second.png");
			FileUtils.copyFile(src1, destination);
			
	}

}
