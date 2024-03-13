package static_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_rightclick {


		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	        
			//launch web browser
			driver=new ChromeDriver();
			//Launch webapplication
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			
			driver.manage().window().maximize();
			
			WebElement ele1=driver.findElement(By.xpath("//span[text()='right click me']"));
			
			Actions ac=new Actions(driver);
			ac.contextClick(ele1).perform();
			driver.findElement(By.xpath("//span[text()='Paste']")).click();
			driver.switchTo().alert().accept();
			
			WebElement loc=driver.findElement(By.xpath("//a[text()=' Fork on GitHub']"));
			System.out.println(loc.getLocation());
	}

}
