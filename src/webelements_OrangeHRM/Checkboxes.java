package webelements_OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		// Find out all check boxes
		
		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(all.size());
		
		//select all check boxes
		/*for(int i=0;i<all.size();i++) 
		{
			all.get(i).click();
		}*/
		;
		//Select specific check box
		/*for(int i=5;i<=5;i++) 
		{
			all.get(i).click();
		}*/
		//Select last 2 check box
		for(int i=9;i<all.size();i++) 
		{
			all.get(i).click();
		}

	}

}
