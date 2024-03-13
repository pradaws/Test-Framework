package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	
		public static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//launch web browser
			driver=new ChromeDriver();
			//Launch webapplication
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
			
			driver.manage().window().maximize();
			
			WebElement slide1=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all'][1]"));
			
			Actions ac=new Actions(driver);
			ac.dragAndDropBy(slide1, 500,200);
			
			WebElement slide2=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all'][2]"));
			ac.dragAndDropBy(slide2, -150, 0);
			
	}

}
