package webelements_OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_demoqa {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// launch web browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// launch web application
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		// Normal alert
		
		/* WebElement ele1=driver.findElement(By.
		 xpath("//button[text()='Click me'][@id='alertButton']")); ele1.click();
		 driver.switchTo().alert().accept();
	*/
		
		 //5 sec alert 
		 WebElement ele2=driver.findElement(By. xpath("//button[@id='timerAlertButton'][text()='Click me']")); ele2.click();
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele2);
		 Thread.sleep(5000);
	     driver.switchTo().alert().accept();


		// confirm alert

	
		/* WebElement ele3 = driver.findElement(By. xpath("//button[text()='Click me'][@id='confirmButton']")); // scroll problem
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele3);
		 ele3.click(); 
		 driver.switchTo().alert().accept();*/
		 
		 //prompt
		 WebElement ele4 = driver.findElement(By. xpath("//button[@id='promtButton']")); // scroll problem
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele4);
		 ele4.click(); 
		 driver.switchTo().alert().sendKeys("selenium");
		 driver.switchTo().alert().accept();

	}
}
