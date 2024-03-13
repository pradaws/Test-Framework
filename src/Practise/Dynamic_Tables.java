package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Tables {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		//launch web browser
		driver=new ChromeDriver();
		//Launch webapplication
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-username")).sendKeys("demo");
		
		driver.findElement(By.id("input-password")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()){
			
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
			
			Thread.sleep(1000);
			
		}
		
		driver.findElement(By.xpath("//li[@id='menu-customer']/a")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		String text= driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		
		System.out.println(text);
		int pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		System.out.println(pages);
	}

}
