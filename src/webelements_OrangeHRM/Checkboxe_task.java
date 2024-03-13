package webelements_OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxe_task {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();

		// driver.findElement(By.xpath("//button[@type='button']")).click();
		// Find out all check boxes

		List<WebElement> all = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(all.size());

		// 1.select all checkboxe
		for (int i = 0; i < all.size(); i++) {
			all.get(i).click();
		}

		// 2) select alternative chekboxes
		for (int i = 0; i < all.size(); i += 2) {
			all.get(i).click();
		}
		// 3)select last 2 checkboxes
		for (int i = 4; i < all.size(); i++) {
			all.get(i).click();
		}
		// 4) select 1st two checkboxes
		for (int i = 0; i < (all.size() - 4); i++) {
			all.get(i).click();
		}
		// 5)select specified checkbox
		for (int i = 3; i <= 3; i++) {
			all.get(i).click();
		}

	}

}
