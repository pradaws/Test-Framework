package webelements_OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_demoqa {

	
public static WebDriver driver;
		
		public static void main(String[] args) {
			
			//Launching web browser
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			//launching web application
			
			driver.get("https://demoqa.com/select-menu");

			WebElement ele1=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
			
			//initialize the select class
			
			Select sc=new Select(ele1);
			
			
			sc.selectByValue("3");
			
			sc.selectByIndex(2);
			
			sc.selectByVisibleText("Blue");
			
		    //find all options
            List<WebElement>list=driver.findElements(By.xpath("//select[@id='oldSelectMenu']/option"));
			
			System.out.println(list.size());
			
			for(int i=0;i<list.size();i++)
			{
				
				System.out.println(list.get(i).getText());//fetch the all options
				
				
				
			}
			
		
		


	
	}

}
