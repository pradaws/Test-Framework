package webelements_OrangeHRM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Switch_windows_testautomation {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		
		e1.sendKeys("Automation");
		
	
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[text()='Automation']")).click();
		
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		
	
		
	
		
		Set<String>all= driver.getWindowHandles();
		
		System.out.println(all);
		
		List<String>windowid=new ArrayList(all);
		String parentid=windowid.get(0);
		String childid=windowid.get(2);
		
		String title=driver.switchTo().window(childid).getTitle();
		
		if(title.equals("Your Store"))
		{
		
			WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(20));
	        
			WebElement ele1=driver.findElement(By.xpath("//input[@type='text']"));
			
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
			
		}
	

	}

}
