package file_upload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class upload_robot {

	
		public static WebDriver driver;
		public static void main(String[] args) throws AWTException, InterruptedException {


			//launching web browser

			driver=new ChromeDriver();

			//launching the web application

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.foundit.in/seeker/registration");
			driver.manage().window().maximize();

			//identify the element

			//		JavascriptExecutor exe=(JavascriptExecutor)driver;
			WebElement ele1=driver.findElement(By.className("uploadResume"));
			//perform file upload by using sendkeys();
			//		exe.executeScript("arguments[0].click();", ele1);
			//		ele1.sendKeys("D:\\Kiran Resume\\Kiran_Darapu_QA.docx");
			//		
			//		System.out.println("fileuploading activity is completed");

			Actions ac=new Actions(driver);
			ac.moveToElement(ele1).click().perform();

			//2nd approach by using robot class
			//initialize the robot class

			Robot r=new Robot();

			//copy the file from the your home directory
			//select the file from HomeDirectory
			StringSelection ss=new StringSelection("C:\\Users\\Dell\\Desktop\\04.07.23_Pradeep_'Functional testing'.docx");
			//Copy the file

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);//copy the file
			
			Thread.sleep(1000);

			//pasting by ctrl+v
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);

			//release the key
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);

			//press enter key to upload the file
			r.keyPress(KeyEvent.VK_ENTER);

			r.keyRelease(KeyEvent.VK_ENTER);	

			System.out.println("fileuploading activity is completed");

	}

}
