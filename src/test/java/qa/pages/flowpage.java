package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import io.appium.java_client.android.AndroidDriver;
import qa.base.Base;

public class flowpage extends Base{
	public AndroidDriver mobileDriver;

	@FindBy(id="android:id/button1")
	WebElement acceptbtn;

	@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Open drawer\"]")
	WebElement btnsidemenu;

	public flowpage(AndroidDriver mobileDriver) {
		this.mobileDriver=mobileDriver;
		PageFactory.initElements( mobileDriver,this);
		System.out.println("");

	}

	public void accept() {
		try {
			acceptbtn.click();
		}catch(Exception e) {
			e.printStackTrace();}
	}
	public sideMenuPage clicksideMenuPage() {
		try {
			btnsidemenu.click();
			return new sideMenuPage(mobileDriver);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
