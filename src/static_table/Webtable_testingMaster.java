package static_table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_testingMaster {

	
		public static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub

	        driver =new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("http://testingmasters.weebly.com/webtables.html");
			
			driver.manage().window().maximize();
			//find the rows in webtable
			List<WebElement>all=driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr"));
			
			int rows=all.size();
			
			System.out.println(all.size());
			//find the columns
			
			List<WebElement>all1=driver.findElements(By.xpath("//table[@id='VisitingTable']/thead/tr/th"));
			int col=all1.size();
			System.out.println(all1.size());
			
			//specific row data
			String r1=driver.findElement(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[6]")).getText();
			System.out.println(r1);
			
			//specific col data
			String c1=driver.findElement(By.xpath("//table[@id='VisitingTable']/thead/tr/th[5]")).getText();
			System.out.println(c1);
			
			//Whole data
			for (int i=1;i<rows;i++)
			{
				for (int j=1;j<col;j++) {
					
					String val=driver.findElement(By.xpath("//table[@id='VisitingTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(val+"   ");
					
				}
				
				System.out.println();
			}


	}

}
