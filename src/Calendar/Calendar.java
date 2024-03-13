package Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	
		public static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		   
		       driver=new ChromeDriver();
		       
		       //launching web application
		       
		       driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		       
		       driver.manage().window().maximize();
		       
		       
		       //approach 1: by using send keys method
		       
		       //driver.findElement(By.id("first_date_picker")).sendKeys("10/04/2024");
		       
//		        System.out.println("date is selected");
		       
		       //approach--2
		       
		       driver.findElement(By.id("first_date_picker")).click();
		       
		       //create the parameters
		       
		       String month="April";
		       String Year="2024";
		       String date="20";
		       
		       while(true) {
		           
		           //identify the month and year
		           
		           String months=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		           
		           String Years=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		           
		           if(months.equals(month) && Years.equals(Year) ) {
		               
		               break;
		           }
		           
		           JavascriptExecutor jse=(JavascriptExecutor)driver;
		           WebElement ele1=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
		           jse.executeScript("arguments[0].click();", ele1);
//		            ele1.click();
		           
		       }
		       
		       //select the date
		       
		       List<WebElement>all=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
		       
		       int dates=all.size();
		       System.out.println(dates);//35
		       
		       
		       /*for(int i=0;i<dates;i++) {
		           if(all.get(i).getText().equals(date)) {
		               all.get(i).click();
		               break;
		           }
		       }*/
		       
		       //by using advanced forloop (enhanced for loop)
		       
		       for(WebElement alldates:all) {
		           
		           if(alldates.getText().equals(date)) {
		               alldates.click();
		               break;
		           }
		       }
		       

	}

}
