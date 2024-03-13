package Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_2nd_date {

	
		public static WebDriver driver;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			driver=new ChromeDriver();
			
			driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		       
		    driver.manage().window().maximize();
		       
			driver.findElement(By.id("second_date_picker")).click();
			
			String Month="December";
			String Year="2025";
			String date="16";
			
			while(true) 
			{
				String m= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
				String y= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(m.equals(Month)&& y.equals(Year)) 
				{
					  break;
				}
				
				
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				WebElement ele= driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
				jse.executeScript("arguments[0].click();", ele);
				
				
			}
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
