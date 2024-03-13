package static_table;

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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		//find the rows in webtable
		List<WebElement>all=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		
		int rows=all.size();
		System.out.println(all.size());
		//find the columns
		
        List<WebElement>all1=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		int col=all1.size();
		System.out.println(all1.size());
		
		//find specific data
		String value=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[3]/td[3]")).getText();
		System.out.println(value);
		
		//print whole data
		for (int i=2;i<rows;i++)
		{
			for (int j=1;j<col;j++) {
				
				String val=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(val);
				
			}
		}
		
	}

}