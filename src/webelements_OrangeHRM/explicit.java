package webelements_OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//launch web application
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		
		
        WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(30));
        
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
    
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
        
        //wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.xpath("//button[@type='submit']"))));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
        WebElement ele1 = driver.findElement(By.xpath("//button[@type='submit']"));
       
        ele1.click();
        
	}

}
