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
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_ex1 {

	
		public static WebDriver driver;
		public static void main(String[] args) throws IOException {

			//Launching the Web browser
			
			
			//Approach1:
			
			ChromeOptions options=new ChromeOptions();
			//options.setHeadless(true);
			options.addArguments("--headless=new");
			driver=new ChromeDriver(options);
			
//			//Approach 2
//			ChromeOptions options=new ChromeOptions();
//			options.setHeadless(true);
//			WebDriver driver=WebDriverManager.chromedriver().capabilities(options).create();

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

			TakesScreenshot ts=(TakesScreenshot)driver;
			WebElement ele1=driver.findElement(By.xpath("//img[@class='logo']"));

			File src=ele1.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\cap21.png");

			FileUtils.copyFile(src, destination);


	}

}
