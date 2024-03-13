package webelements_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

	
		public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			//launch web browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
			driver=new ChromeDriver();

			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//launch web application
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			//find the element
			/*WebElement ele1=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
	        //perform click activity
			ele1.click();
			//handle normal alert
			driver.switchTo().alert().accept();//ok*/
			
			//handle confirmation alert
			WebElement ele2=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
			//perform click activity
			ele2.click();
			//ok===> accept();
			//cancel==>dismiss();
			org.openqa.selenium.Alert a=driver.switchTo().alert();
			
			a.accept();
			//a.dismiss();
			
		    String actual_res=driver.findElement(By.xpath("//p[text()='You clicked: Cancel']")).getText();
			String exp_res="You clicked: Cancel";
			
			if(actual_res.equals(exp_res)) {
				System.out.println("testcase is passed");
			}
			else {
				System.out.println("testcase failed");
			}
			System.out.println("click activity is completed");
			
			//prompt alerts
			//identify the element
			WebElement ele3=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
			//perform click activity
			ele3.click();
			Thread.sleep(3000);
			a.sendKeys("selenium");
			Thread.sleep(3000);
			a.accept();
			WebElement ele4=driver.findElement(By.xpath("//p[text()='You entered: selenium']"));
			String act_res=ele4.getText();
			String expected_res="You entered: selenium";
			
			if(act_res.equals(expected_res)) {
				System.out.println("prompt alert functionality is completed");
			}
			else {
				System.out.println("it's not working");
			}
			

		

	}
		private void accept() {
			// TODO Auto-generated method stub
			
		}
		
}
