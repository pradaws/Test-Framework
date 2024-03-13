package webelements_OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_elements {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		      driver= new ChromeDriver();
		      //browser method
		      driver.get("https://adactinhotelapp.com/index.php");
		      //webelement methods findElement();

		      WebElement username= driver.findElement(By.id("username"));
		    //sendkeys();pass some arguments into the input box
		  	  username.sendKeys("Pradeep123");
		  	//clear()==> clear the previous entered data
				username.clear();
				System.out.println("username is entered");
			    Thread.sleep(2000);
			    
				//identify the password element
				/*WebElement password=driver.findElement(By.name("password"));
				password.sendKeys("qwerty");
				
				System.out.println(password.isSelected());
				System.out.println("password is entered");
				Thread.sleep(2000);
				//
				WebElement btnlogin=driver.findElement(By.className("login_button"));
				
				//isEnabled
				System.out.println(btnlogin.isEnabled());//true
				
				//isDisplayed
				System.out.println(btnlogin.isDisplayed());//true
				
				//click();
				btnlogin.click();
				System.out.println(btnlogin.isSelected());
				System.out.println("clicking activity is completed");
				
				
				Thread.sleep(2000);
				
				//findElements()
				
				List<WebElement>links=driver.findElements(By.tagName("input"));
				System.out.println(links.size());//totally how many links the value printed in the console window
				
				for(int i=0;i<=links.size();i++) {
					System.out.println(links.get(i).getText());*/
	}
	
	}


