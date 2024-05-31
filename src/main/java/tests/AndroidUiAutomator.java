package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidUiAutomator {
	
	public static AndroidDriver driver=null;
	
	
	@Test
	public void checkScrollable() throws MalformedURLException, InterruptedException {
		UiAutomator2Options uio= new UiAutomator2Options();
		URL url=new URL("http://127.0.0.1:4723/");
		uio.setPlatformName("ANDROID");
		uio.setDeviceName("OnePlus");
		uio.setPlatformVersion("12");
		uio.setAutomationName("UiAutomator2");
		uio.setAppPackage("com.solodroid.solomerce");
		uio.setAppActivity("com.solodroid.solomerce.activities.MainActivity");
		driver = new AndroidDriver(url,uio);
		Thread.sleep(5000);
		String scrollablecontainer="new UiSelector().resourceId(\"com.solodroid.solomerce:id/recycler_view\")";
		String horizontalscrollcontainer="new UiSelector().resourceId(\"com.solodroid.solomerce:id/swipeRefreshLayout\")";
		String text="Animal Jumpsuit for Newborn Baby";
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("+scrollablecontainer+").scrollForward()"));
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("+scrollablecontainer+").scrollForward()."
			//+ "scrollTextIntoView(\"Animal Jumpsuit for Newborn Baby\")")).click();
		//working but does scroll backward once.
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("+scrollablecontainer+")."
			//	+ "scrollTextIntoView(\"Animal Jumpsuit for Newborn Baby\")")).click(); 
		//error- An element cannot be located on the page with given parameters
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("+scrollablecontainer+")."
			//	+ "scrollIntoView(new UiSelector().textContains(\"Animal Jumpsuit\"))")).click();
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("+scrollablecontainer+").scrollToEnd(5).scrollToBeginning(4)"));
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("+scrollablecontainer+").scrollToEnd(3)."
		//+ "scrollTextIntoView(\""+text+"\")")).click();
		
		//driver.findElement(AppiumBy.androidUIAutomator(text))
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("+scrollablecontainer+").setAsHorizontalList().scrollForward().scrollBackward()"));
		driver.findElement(AppiumBy.id("com.solodroid.solomerce:id/nav_category")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("+horizontalscrollcontainer+").scrollForward()"));
	}

}
