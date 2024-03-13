package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	        
			//launch web browser
			driver=new ChromeDriver();
			//Launch webapplication
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://demoqa.com/text-box");
			
			driver.manage().window().maximize();
			driver.findElement(By.id("userName")).sendKeys("pradeep");
			driver.findElement(By.id("userEmail")).sendKeys("rps@gmail.com");
			WebElement ele1=driver.findElement(By.id("currentAddress"));
			ele1.sendKeys("coimbatore");
			
			Actions ac=new Actions(driver);
			ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
			ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
			ac.sendKeys(Keys.TAB).perform();
			ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
			
			ac.sendKeys(Keys.TAB).perform();
			
			driver.findElement(By.id("submit")).click();
			String text=driver.findElement(By.id("output")).getText();
			if(text.contains("pradeep"))
			{
				System.out.println("matched");
				
			}
			else 
			{
				System.out.println("Not matched");
				
			}
			
			
			
	}

}
