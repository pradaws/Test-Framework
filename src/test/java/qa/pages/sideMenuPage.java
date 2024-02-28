package qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import qa.base.Base;

public class sideMenuPage extends Base{

	public AndroidDriver mobileDriver;

	@FindBy(xpath="//android.widget.CheckedTextView[@resource-id=\"com.llamalab.automate:id/design_menu_item_text\" and @text=\"Help & feedback\"]")
	WebElement helpandfeedback;
	
	@FindBy(xpath="//android.widget.TextView[@text=\"Help\"]")
	WebElement helptext;
	
	public sideMenuPage(AndroidDriver mobileDriver) {
		this.mobileDriver=mobileDriver;
		PageFactory.initElements( mobileDriver,this);

	}
	
	public void helptext() {
		try {
			helpandfeedback.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public boolean verifyhelpondocumentationIsDisplayed()
	{
		WebDriverWait wait  =new WebDriverWait(mobileDriver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Help\"]")));
		try {
			return helptext.isDisplayed();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
