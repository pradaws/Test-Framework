package webelements_OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobutton_selenium {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(20));
        
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Mozilla']")));
		WebElement ele1=driver.findElement(By.xpath("//input[@value='Mozilla']"));
		
		
		Thread.sleep(2000);
		ele1.click();
		
        WebElement ele2=driver.findElement(By.xpath("//input[@value='Opera']"));
		
		
		Thread.sleep(2000);
		ele2.click();
		
        WebElement ele3=driver.findElement(By.xpath("//input[@value='IE']"));
		
		
		Thread.sleep(2000);
		ele3.click();
		
	}

}
