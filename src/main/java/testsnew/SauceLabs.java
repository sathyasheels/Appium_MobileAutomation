package testsnew;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pages.HomePage;
import utils.FileUtils;

public class SauceLabs {
	
	AndroidDriver driver;
	
	@Test
	public void CloudDemo() throws MalformedURLException {
	MutableCapabilities caps = new MutableCapabilities();
	caps.setCapability("platformName", "Android");
	caps.setCapability("appium:app", "storage:filename=Solodroid_E-CommerceApp Demo_3.2.0.apk");  // The filename of the mobile app
	caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
	caps.setCapability("appium:platformVersion", "12.0");
	caps.setCapability("appium:automationName", "UiAutomator2");
	MutableCapabilities sauceOptions = new MutableCapabilities();
	sauceOptions.setCapability("username", "oauth-sathya.be2009-70154");
	sauceOptions.setCapability("accessKey", "d49aaea8-a4eb-4cdd-90f6-6f15adc44971");
	sauceOptions.setCapability("build", "appium-build-MLL9P");
	sauceOptions.setCapability("name", "SauceLabs");
	sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
	caps.setCapability("sauce:options", sauceOptions);
	
	
	// Start the session
	URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
	driver = new AndroidDriver(url, caps);
	}
	
	@Test
	public void checkAddingItemToCart() throws IOException {
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(hp.verifyItemAddedToCart(driver,FileUtils.readHomePageTestData("search.text"),
				FileUtils.readHomePageTestData("add.order")));
		driver.quit();
	}

	// replace with commands and assertions
//	try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	String jobStatus = "passed"; // or "failed"
//
//	// end the session
//	driver.executeScript("sauce:job-result=" + jobStatus);
//	driver.quit();
//

}
