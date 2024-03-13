package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	
		public static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//launch web browser
			driver=new ChromeDriver();
			//Launch webapplication
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://demoqa.com/buttons");
			
			driver.manage().window().maximize();
			
			WebElement right=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
			
			Actions ac=new Actions(driver);
			ac.contextClick(right).perform();
			
	
			
			
			
	}

}
