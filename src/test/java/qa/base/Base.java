package qa.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	
	
	public String appiumserver="127.0.0.1";
	public int appiumport =4723;
	URL appiumURL=null;
	public  AndroidDriver mobileDriver;
	public static Properties prop;
	
	public Base() 
	{
		
		try {
			prop=new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\white\\eclipse-workspace\\Test-Framework\\src\\test\\java\\qa\\base\\qa.properties");
			prop.load(ip);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	public AndroidDriver initialiseDriver() 
	{
		try {
			appiumURL= new URL("http://"+ appiumserver+":"+appiumport+"/wd/hub");
			this.mobileDriver=new AndroidDriver(appiumURL,setAppCapabiltiesAndroid());
			}catch(Exception e) 
		{
				e.printStackTrace();
		}
		
		return mobileDriver;
	}
	public DesiredCapabilities setAppCapabiltiesAndroid() {
		
		DesiredCapabilities  cap =new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "pradeep");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("appium:platformVersion", "9.0");
		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\white\\eclipse-workspace\\Test-Framework\\Application\\com.llamalab.automate_1.31.1-191_minAPI14(arm64-v8a,armeabi-v7a,x86,x86_64)(nodpi)_apkmirror.com.apk");
		//cap.setCapability("App","com.llamalab.automate_1.31.1-191_minAPI14(arm64-v8a,armeabi-v7a,x86,x86_64)(nodpi)_apkmirror.com.apk");
		cap.setCapability("appium:automationName", "uiautomator2");
		return cap;
	}
	public String takeScreenShotPath(String testCaseName,AndroidDriver MobileDriver) throws IOException 
	{
		TakesScreenshot ts= (TakesScreenshot)MobileDriver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination =System.getProperty("user.dir")+"/reports/"+testCaseName+".PNG";
		FileUtils.copyFile(source, new File(destination));
		return destination;
		
	}
	}

