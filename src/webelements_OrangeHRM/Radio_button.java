package webelements_OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {


		public static WebDriver driver;
		
		public static void main(String[] args) {
			
			//Launching web browser
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			//launching web application
			
			driver.get("https://designsystem.digital.gov./components/radio-buttons/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			WebElement ele1=driver.findElement(By.xpath("//fieldset[@class='usa-fieldset']/div[3]/label"));
			ele1.click();
			
			

	}

}
