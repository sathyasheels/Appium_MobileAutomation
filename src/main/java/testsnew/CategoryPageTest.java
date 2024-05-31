package testsnew;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CategoryPage;

public class CategoryPageTest extends BaseTest{
	
	@BeforeMethod
	public void preRequisite() throws IOException, InterruptedException
	{
	
		driver= BaseTest.getDriver("android");
		Thread.sleep(3000);
		}
	
	@Test
	public void checkHomeAndFurniturePage() {
		CategoryPage cp=new CategoryPage(driver);
		Assert.assertTrue(cp.verifyFurniturePageDisplayed());
	}
	

}
