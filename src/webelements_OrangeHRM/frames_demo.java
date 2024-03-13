package webelements_OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frames_demo {

	public static  WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        driver =new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//frame1//frame[@src='frame_1.html']
		WebElement ele1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(ele1);
		
	     
	  driver.findElement(By.name("mytext1")).sendKeys("frame1");
		
	  driver.switchTo().defaultContent();
	  
	  WebElement ele2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  driver.switchTo().frame(ele2);
		
	     
	  driver.findElement(By.name("mytext2")).sendKeys("frame 2");
		
	  driver.switchTo().defaultContent();
	  
	  WebElement ele3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	  driver.switchTo().frame(ele3);
		
	     
	  driver.findElement(By.name("mytext3")).sendKeys("frame 3");
		
	  driver.switchTo().defaultContent();
	  
	  WebElement ele4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
	  driver.switchTo().frame(ele4);
		
	     
	  driver.findElement(By.name("mytext4")).sendKeys("frame 4");
		
	  driver.switchTo().defaultContent();
	  
	  
	   

	}

}
