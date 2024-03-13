package Calendar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar_3rd_date {

	
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			driver=new ChromeDriver();
			
			driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		       
		    driver.manage().window().maximize();
		       
			driver.findElement(By.id("third_date_picker")).click();
			
			String Month="June";
			String Year="2023";
			String date="16";
			
			WebElement e1=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			e1.click();
			//ui-datepicker-year
			Select sc=new Select(e1);
			sc.selectByVisibleText("Jun");
			
			WebElement e2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			e2.click();
			
			
			Select sc1=new Select(e2);
			sc1.selectByVisibleText("2023");
			
			//Thread.sleep(5000);
			
			
			
			List<WebElement>all=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		       
		    int dates=all.size();
		    System.out.println(dates);
			
		    for (WebElement alldates:all) 
		    {
		    	if(alldates.getText().equals(date)) 
		    	{
		    		
		    		alldates.click();
		    		
		    	}
		    }
			
		
			
			
			
		    
		}
}