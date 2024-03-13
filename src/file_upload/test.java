package file_upload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {

	
		   public static WebDriver driver;
		   
		   public static void main(String[] args) throws IOException {
		       
		       
		       //launching web browser
		       
		               driver=new ChromeDriver();
		               
		               //launching web application
		               driver.get("https://demo.automationtesting.in/Register.html");
		               
		               driver.manage().window().maximize();
		               
		               WebElement ele1=driver.findElement(By.id("imagesrc"));
		               
		               Actions ac=new Actions(driver);
		               ac.moveToElement(ele1).click().perform();
		               
		               Runtime.getRuntime().exec("C:\\Kiran\\AutoIT\\MyOwnWork.exe"+" "+"C:\\Kiran\\RecentOne.xlsx");
		              // Runtime.getRuntime().exec("C:\\Kiran\\AutoIT\\OnlyONe.exe");
		           
		               //C:\Kiran\AutoIT\OnlyONe.exe
		           	   
		               System.out.println("file uploading activity is completed");

	}

}
