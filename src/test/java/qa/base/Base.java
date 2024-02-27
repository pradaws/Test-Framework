package qa.base;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	
	public AndroidDriver mobileDriver;
	public String appiumserver="127.0.0.1";
	public int appiumport =4723;
	URL appiumURL=null;
	public static Properties prop;
	
	public Base() 
	{
		
		try {
			prop=new Properties();
			FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"");
			prop.load(ip);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	public AndroidDriver initialiseDriver() 
	{
		try {
			appiumURL= new URL("htpps://"+ appiumserver+":"+appiumport+"wd/hub");
			this.mobileDriver=new AndroidDriver(appiumURL,setAppCapabiltiesAndroid());
			}catch(Exception e) 
		{
				e.printStackTrace();
		}
		
		return mobileDriver;
	}
	public DesiredCapabilities setAppCapabiltiesAndroid() {
		
		DesiredCapabilities  cap =new DesiredCapabilities();
		cap.setCapability("platformName", "pradeep");
		cap.setCapability("appium:platformVersion", "9.0");
		cap.setCapability("App",System.getProperty("user.dir"+"/Application/"+"ApiDemos-debug.apk"));
		cap.setCapability("appium:automationName", "uiautomator2");
		return cap;
		
	public String takeScreenShotPath(String testCaseName,AndroidDriver MobileDriver) 
	{
		TakesScreenshot ts= (TakesScreenshot)MobileDriver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		
	}
	}

}
