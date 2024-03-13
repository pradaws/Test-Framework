import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleenium {

	public static WebDriver driver;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
        driver =new ChromeDriver();
        
        driver.get("https://demoqa.com/select-menu");
        
        List<WebElement> all=driver.findElements(By.xpath("//select[@id='oldSelectMenu']/option"));
        
        System.out.println(all.size());
        
        for(int i=0;i<all.size();i++)
        {
        	System.out.println(all.get(i).getText());
        }
        
		  
	}

}
