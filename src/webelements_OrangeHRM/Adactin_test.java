package webelements_OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_test {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 //launch web application
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		 
		 //webelement methods
		 //findElement();
		WebElement username= driver.findElement(By.tagName("input"));
		//sendkeys();pass some arguments into the input box
		username.sendKeys("Admin");
//clear()==> clear the previous entered data
		//username.clear();
		
		
		System.out.println("username is entered");
		
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.tagName("password"));
		password.sendKeys("pradeep123");
		System.out.println(password.isSelected());
		System.out.println("password is entered");
		Thread.sleep(2000);
		
		WebElement btnlogin=driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		
        System.out.println(btnlogin.isEnabled());//true
		
		//isDisplayed
		System.out.println(btnlogin.isDisplayed());//true
		
		//click();
		btnlogin.click();
		System.out.println(btnlogin.isSelected());
		System.out.println("clicking activity is completed");
		
		
		Thread.sleep(2000);
		
		//findElements()
		
		List<WebElement>links=driver.findElements(By.tagName("div"));
		System.out.println(links.size());//totally how many links the value printed in the console window
		
		for(int i=0;i<=links.size();i++) {
			System.out.println(links.get(i).getText());
			
		}
	}

	}


