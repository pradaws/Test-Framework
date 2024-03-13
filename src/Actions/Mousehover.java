package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {


	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch web browser
		driver=new ChromeDriver();
		//Launch webapplication
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.orangehrm.com/");
		
		driver.manage().window().maximize();
		
		WebElement ele1= driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']/ul/li[2]/a/button"));
		
		System.out.println(ele1.getLocation());
		Actions ac=new Actions(driver);
		ac.moveToElement(ele1).click().perform();
		
		
	}

}
