package static_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTables {
	
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
		
		//find the how many pages is there in the webtable
		
		// get text
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		
		System.out.println(text);
		
		// string to integer
		
		int pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		System.out.println(pages);
		
		//How many rows is available
		
		for(int i=0;i<=9;i++)
		{
			try
			{
				WebElement ele1=driver.findElement(By.xpath("//ul[@class='pagination']/li/*[text()="+i+"]"));
				
				int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
				
				System.out.println(rows);
				
				
				ele1.click();
				
				for (int r=1;r<=rows;r++)
				{
					
					String customername=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr["+r+"]/td[2]")).getText();
					System.out.println(customername);
				}
				
				
			   // System.out.println(ele1);
			    
			    Thread.sleep(1000);
			    
			}catch(Exception e)
			
			{
				
				System.out.println(e.getMessage());
				
			}
			
			
			    
			
		}
		
		
		
		
		//fetch the data
		
		
	}

}
