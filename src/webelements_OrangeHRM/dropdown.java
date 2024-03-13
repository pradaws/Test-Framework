package webelements_OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	
		
		public static WebDriver driver;
		
		public static void main(String[] args) {
			
			//Launching web browser
			
			
			driver=new ChromeDriver();
			
			//launching web application
			
			driver.get("https://demo.nopcommerce.com/register");

			WebElement ele1=driver.findElement(By.name("DateOfBirthDay"));
			
			//initialize the select class
			
			Select sc=new Select(ele1);
			
			sc.selectByValue("3");
			
		
			
			List<WebElement>list=driver.findElements(By.xpath("//select[@name='DateOfBirthDay']/option"));
			
			//findout the size of the elements
			
			System.out.println(list.size());
			
			for(int i=0;i<list.size();i++) {
				
				System.out.println(list.get(i).getText());//fetch the all options
			}
			
			
		


	}

}
