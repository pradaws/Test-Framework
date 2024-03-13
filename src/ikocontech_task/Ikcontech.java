package ikocontech_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ikcontech {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.ikcontech.com/");
		driver.findElement(By.linkText("https://www.ikcontech.com/about-us")).click();
		
		

	}

}
