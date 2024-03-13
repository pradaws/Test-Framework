package static_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_draganddrop {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		//launch web browser
		driver=new ChromeDriver();
		//Launch webapplication
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		WebElement Rome=driver.findElement(By.id("box6"));
		WebElement Italy=driver.findElement(By.id("box106"));
		
		Actions ac=new Actions(driver);
		
		ac.dragAndDrop(Rome, Italy).perform();

}
	
}	
