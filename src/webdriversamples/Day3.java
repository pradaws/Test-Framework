package webdriversamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch web application
		// System.setProperty("webdriver.chrome.driver","C:\\Users/Dell/eclipse-workspace/SeleniumWebDriver/driver/chromedriver.exe");
			
	      driver= new ChromeDriver();
	      //browser method
	      driver.get("https://www.hubilo.com/");
	      
	      System.out.println(driver.getTitle());
	      
	      String curl=driver.getCurrentUrl();
	      
	      System.out.println(curl);
	      
	      String pagesource= driver.getPageSource();
	      
	      System.out.println(pagesource);
	      
	      driver.close();
	      
	      
		 
		
	}

}
