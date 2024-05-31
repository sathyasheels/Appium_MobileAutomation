package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CategoryPage extends BasePage {
	
	public CategoryPage(AppiumDriver driver) {
		super(driver);
	}
	
	
	
	@AndroidFindBy(uiAutomator="new UiScrollable(\"new UiSelector().resourceId(\"com.solodroid.solomerce:id/recycler_view\")\")."
			+ "setAsHorizontalList.scrollForward().scrollTextIntoView(\"Home & Furniture\")")
	public WebElement categoryPage;
	
	@AndroidFindBy(uiAutomator="new UiSelector().text(\"Health & Sports\")")
	public WebElement homeandFurnitureSection;
	
	@AndroidFindBy(uiAutomator="new UiSelector().text(\"Robot Vacuum Cleaner Wellcomm Home 2.0\")")
	public WebElement RobotVaccuum;
	
	public boolean verifyFurniturePageDisplayed() {
		boolean isFurniturePageDisplayed=false;
		if(categoryPage.isDisplayed()) {
			if(homeandFurnitureSection.isDisplayed()) {
				homeandFurnitureSection.click();
			}
		}if(RobotVaccuum.isDisplayed()) {
			isFurniturePageDisplayed=true;
		}
	return isFurniturePageDisplayed;
	}
	

}
