package webelements_OrangeHRM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Switch_windows {
	 
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String>all= driver.getWindowHandles();
		
		System.out.println(all);
		
		List<String>windowid=new ArrayList(all);
		String parentid=windowid.get(0);
		String childid=windowid.get(1);
		
		String title=driver.switchTo().window(parentid).getTitle();
		
		if(title.equals("OrangeHRM"))
		{
			driver.findElement(By.name("username")).sendKeys("Admin");
			
		}
		
		
		
		

	}

}
