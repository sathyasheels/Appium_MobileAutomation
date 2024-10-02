package testsnew;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class BaseTest {
	
	static AppiumDriver driver=null;
	public static AppiumDriver getDriver(String driverName) throws MalformedURLException {
		String name=driverName.toLowerCase();
		switch(name) {
		case "android":
			UiAutomator2Options uio= new UiAutomator2Options();
			URL url=new URL("http://127.0.0.1:4723/");
			uio.setPlatformName("ANDROID");
			uio.setDeviceName("OnePlus");
			
			uio.setPlatformVersion("12");
			uio.setAutomationName("UiAutomator2");
			uio.setAppPackage("com.solodroid.solomerce");
			uio.setAppActivity("com.solodroid.solomerce.activities.MainActivity");
			driver = new AndroidDriver(url,uio);
			break;
		
		case "ios":
			URL url1=new URL("http://127.0.0.1:4723/");
			XCUITestOptions xto=new XCUITestOptions();
			xto.setPlatformName("ANDROID");
			xto.setDeviceName("OnePlus");
			xto.setPlatformVersion("12");
			xto.setAutomationName("XCUITest");
			//xto.setAppPackage("com.solodroid.solomerce");
			//xto.setAppActivity("com.solodroid.solomerce.activities.MainActivity");
			driver = new IOSDriver(url1,xto);
			break;
			default:
				driver=null;
				break;
		}
		return driver;
}
	
	
}
