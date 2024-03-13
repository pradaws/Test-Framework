package Practise;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement ele1=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		
		Select sc=new Select(ele1);
		
		sc.selectByIndex(1);
		
		List<WebElement> all= driver.findElements(By.xpath("//select[@name='DateOfBirthDay']/option"));
		
		for(int i=0;i<all.size();i++)
		{
			
			System.out.println(all.get(i).getText());
		}
		
		
		
		
	}
	
}
