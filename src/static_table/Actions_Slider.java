package static_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Slider {

	
		
		public static WebDriver driver;
		
		public static void main(String[] args) {
			
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			//launching web application
			driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
			driver.manage().window().maximize();
			
			WebElement ele1=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
			
			WebElement ele2=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
			System.out.println(ele2.getLocation());
			Actions ac=new Actions(driver);
			
		    ac.dragAndDropBy(ele1, 400, 250).perform();
			//ac.dragAndDropBy(ele2, -150, 0).perform();
			
			

		

	}

}
