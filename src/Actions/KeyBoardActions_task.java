package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions_task {

	

		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	        
			//launch web browser
			driver=new ChromeDriver();
			//Launch webapplication
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://text-compare.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("inputText1")).sendKeys("Hello world");
			
			Actions ac=new Actions(driver);
			
			ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
			
			ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
			
			ac.sendKeys(Keys.TAB).perform();
			
			ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
			
			driver.findElement(By.xpath("//div[text()='Compare!']")).click();
			
			
			
			
			
			
			
			
	}

}
