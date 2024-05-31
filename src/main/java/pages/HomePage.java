package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage{

	public HomePage(AppiumDriver driver) {
		super(driver);

	}
	
	
	
	@AndroidFindBy(id="com.solodroid.solomerce:id/search")
	public WebElement searchIcon;
	
	@AndroidFindBy(id="com.solodroid.solomerce:id/search_src_text")
	public WebElement searchTextBox;
	
	@AndroidFindBy(id="com.solodroid.solomerce:id/category_image")
	public WebElement searchResultImage;
	
	@AndroidFindBy(id="com.solodroid.solomerce:id/btn_add_cart")
	public WebElement addToCartButton;
	
	@AndroidFindBy(id="com.solodroid.solomerce:id/userInputDialog")
	public WebElement orderInputBox;
	
	@AndroidFindBy(id="android:id/button1")
	public WebElement addButton;
	
	@AndroidFindBy(id="com.solodroid.solomerce:id/cart")
	public WebElement cartIcon;
	
	@AndroidFindBy(id="com.solodroid.solomerce:id/btn_checkout")
	public WebElement checkoutButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Shopping Cart']")
	public WebElement shoppingcartLabel;
	
	
	
	public boolean verifyItemAddedToCart(AppiumDriver driver,String text1,String text2) {
		boolean isItemAddedToCart=false;
		if(searchIcon.isDisplayed()) {
			searchIcon.click();
		}if(searchTextBox.isDisplayed()) {
			searchTextBox.sendKeys(text1);
			((HidesKeyboard) driver).hideKeyboard();
		}if(searchResultImage.isDisplayed()) {
			searchResultImage.click();
		}if(addToCartButton.isDisplayed()) {
				addToCartButton.click();
			}if(orderInputBox.isDisplayed()) {
				orderInputBox.click();
				orderInputBox.sendKeys(text2);
				addButton.click();
			}if(cartIcon.isDisplayed()) {
				cartIcon.click();
				if(checkoutButton.isDisplayed()) {
					isItemAddedToCart=true;
				}
		}
		return isItemAddedToCart;
	}
	
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector().resourceId(\"com.solodroid.solomerce:id/recycler_view\")).scrollForward()."
			+ "scrollIntoView(new UiSelector().text(\"Animal Jumpsuit for Newborn Baby\"))")
	public WebElement jumpsuitImage;
	
	@AndroidFindBy(uiAutomator="new UiSelector().text(\"Samsung Galaxy S10 - Black\")")
	public WebElement Image1;
	
	public boolean verifyJumpsuitImageDisplayed() {
		boolean isImageDisplayed=false;
		if(jumpsuitImage.isDisplayed()) {
			jumpsuitImage.click();
			isImageDisplayed=true;
			System.out.println("Image is displayed");
		}
		return isImageDisplayed;
	}
	
	
	
	
	
	
	
	

}
