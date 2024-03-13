package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js {

	
		// TODO Auto-generated method stub
		public static WebDriver driver;
		public static void main(String[] args) {
			
			
			//launching Web browser
			driver=new ChromeDriver();
			
			
			//launching web application
			driver.get("https://adactinhotelapp.com/");
			
			WebElement ele1=driver.findElement(By.id("username"));
			ele1.sendKeys("mahesh23456");
			WebElement ele2=driver.findElement(By.id("password"));
			ele2.sendKeys("India@123");
			
			WebElement ele3=driver.findElement(By.id("login"));
			
			//initialize the JSE
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			
			jse.executeScript("arguments[0].click();", ele3);
			System.out.println("it's executed");
			
			
			

		}

	

	}


