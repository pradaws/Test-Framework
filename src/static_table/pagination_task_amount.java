package static_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagination_task_amount {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int t1 = 0;
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("input-username")).sendKeys("demo");

		driver.findElement(By.id("input-password")).sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {

			driver.findElement(By.xpath("//button[@class='btn-close']")).click();

			Thread.sleep(1000);

		}

		driver.findElement(By.xpath("//ul[@id='menu']/li[5]/a")).click();

		driver.findElement(By.xpath("//ul[@id='collapse-4']/li[4]/a")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-4-3']/li/a")).click();

		// How many rows is available

		/*
		 * for (int i = 0; i <= 9; i++) { try { WebElement ele1 =
		 * driver.findElement(By.xpath("//ul[@class='pagination']/li[" + i + "]"));
		 * 
		 * int rows = driver .findElements(By.
		 * xpath("//table[@class='table table-bordered table-hover']/tbody/tr"))
		 * .size();
		 * 
		 * System.out.println(rows);
		 * 
		 * ele1.click();
		 */

		for (int r = 1; r <= 4; r++) {

			String t = driver
					.findElement(
							By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[" + r + "]/td[5]"))
					.getText();

			t = t.replace('$', ' ');

			int intAmount = (int) Double.parseDouble(t);

			System.out.println(intAmount);

			t1 = t1 + intAmount;

		}

		System.out.println("Total amount in the page 1 is" + "" + t1);

		Thread.sleep(1000);

	}

}


	

