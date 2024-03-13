package webelements_OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes_selenium {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().window().maximize();
		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(all.size());
		
		/*for(int i=0;i<all.size();i++)
		{
		    all.get(i).click();
		    
		    
		}*/
		//specific box
		
		for(int i=3;i<=3;i++) 
		{
			all.get(i).click();
		}

		for(int i=6;i<all.size();i++) 
		{
			all.get(i).click();
		}
	}

}
