package webelements_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame_Hyrtutorial {

	public static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver =new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		//frame1
		
		driver.switchTo().frame("frm1");
		
		WebElement ele1=driver.findElement(By.xpath("//select[@id='selectnav1']"));
		
		Select sc=new Select(ele1);
		
		//sc.selectByVisibleText("-- Selenium");
		
		sc.selectByIndex(6);
		//sc.selectByValue("8");
		
		WebElement ele2=driver.findElement(By.id("course"));
		Select sc1=new Select(ele2);
		
		sc1.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		
		//frame2
		
		driver.switchTo().frame("frm2");
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pradeep");
	
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("srinivasan");
		
		WebElement ele3=driver.findElement(By.xpath("//input[@id='malerb']"));
		
		Thread.sleep(2000);
		
		ele3.click();
		
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();	
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pradeep@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		
		driver.findElement(By.xpath("//button[@id='registerbtn']")).click();
		
		driver.switchTo().defaultContent();

	}

}
