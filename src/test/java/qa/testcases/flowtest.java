package qa.testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import qa.base.Base;
import qa.pages.flowpage;
import qa.pages.sideMenuPage;

public class flowtest extends Base {

	public AndroidDriver mobileDriver;
	
	@BeforeMethod
	public void initialise ()
	{
		mobileDriver=initialiseDriver() ;
		
	}
	
	@Test(description="Verify context under help")
    public void verfiyHelptest() {
		flowpage fp=new flowpage(mobileDriver);
		fp.accept();
		sideMenuPage sp=fp.clicksideMenuPage();
		sp.helptext();
		Assert.assertTrue(sp.verifyhelpondocumentationIsDisplayed(),"Help-context, Help on documentation is not displayed");
	}
//	@AfterMethod(alwaysRun=true)
//	public void teardown(ITestResult testresult)
//	{
//		this.mobileDriver.quit();
//	}
	
	
}
