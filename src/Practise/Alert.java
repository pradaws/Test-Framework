package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	
		public static WebDriver driver;
		public static void main(String[] args) {
			
			driver=new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement ele1= driver.findElement(By.xpath("//button[@id='promtButton']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele1);
			ele1.click();
		    driver.switchTo().alert().sendKeys("sss");
		    driver.switchTo().alert().accept();
	}

}
