
package testsnew;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pages.HomePage;
import testsnew.BaseTest;
import utils.FileUtils;



public class HomePageTest extends BaseTest{
	
//	@BeforeMethod
//	public void preRequisite() throws IOException, InterruptedException
//	{
//		driver= BaseTest.getDriver("android");
//		Thread.sleep(2000);
//		}
	
	@Test(enabled=false)
	public void checkAddingItemToCart() throws IOException {
		HomePage hp=new HomePage(driver);
		Assert.assertTrue(hp.verifyItemAddedToCart(driver,FileUtils.readHomePageTestData("search.text"),
				FileUtils.readHomePageTestData("add.order")));
	}
	
	
	@Test
	public void checkImageDisplayed() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		Assert.assertTrue(hp.verifyJumpsuitImageDisplayed());
		}

}
