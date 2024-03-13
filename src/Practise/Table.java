package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://testingmasters.weebly.com/webtables.html");
        
        List<WebElement> all= driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr"));
        int rows=all.size();
        System.out.println(all.size());
		
        List<WebElement> all1= driver.findElements(By.xpath("//table[@id='VisitingTable']/thead/tr/th"));
        int col=all1.size();
        System.out.println(all1.size());
        
        for(int i=1;i<rows;i++)
        {
        	for (int j=1;j<col;j++) {
        		
        		String values=driver.findElement(By.xpath("//table[@id='VisitingTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
            	System.out.println(values);
        		
        	}
        	
        }
	
	}
}
