package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MainActivityTest {
	
	public static AndroidDriver driver=null;
	
	public void scrollUp() {
		Dimension size=driver.manage().window().getSize();
		int ycoordinate=(int)(size.height*0.70);
		int xcoordinate=(int)(size.width*0.70);
		System.out.println("y:"+ycoordinate+"  x:"+xcoordinate);
		PointerInput finger=new PointerInput(Kind.TOUCH,"Finger");
		Sequence scrollup=new Sequence(finger,0);
		scrollup.addAction(finger.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), xcoordinate, ycoordinate));
		scrollup.addAction(finger.createPointerDown(0));
		scrollup.addAction(finger.createPointerMove(Duration.ofSeconds(1), Origin.viewport(), xcoordinate, ycoordinate-800));
		scrollup.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(scrollup));
	}
	public static void scrollDown() {
		Dimension size=driver.manage().window().getSize();
		int ycoordinate=(int)(size.height*0.30);
		int xcoordinate=(int)(size.width*0.70);
		PointerInput finger=new PointerInput(Kind.TOUCH,"Finger");
		Sequence scrolldown=new Sequence(finger,0);
		scrolldown.addAction(finger.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), xcoordinate, ycoordinate));
		scrolldown.addAction(finger.createPointerDown(0));
		scrolldown.addAction(finger.createPointerMove(Duration.ofSeconds(1), Origin.viewport(), xcoordinate, ycoordinate+700));
		scrolldown.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(scrolldown));
		}
	public static void scrollLeft() {
		Dimension size=driver.manage().window().getSize();
		int xaxis=(int)(size.width*0.95);
		int yaxis=(int)(size.height*0.60);
		PointerInput finger=new PointerInput(Kind.TOUCH,"Finger");
		Sequence scrollleft=new Sequence(finger,0);
		scrollleft.addAction(finger.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), xaxis, yaxis));
		scrollleft.addAction(finger.createPointerDown(0));
		scrollleft.addAction(finger.createPointerMove(Duration.ofSeconds(1), Origin.viewport(), xaxis-960, yaxis));
		scrollleft.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(scrollleft));
		}
	public static void scrollRight() {
		Dimension size=driver.manage().window().getSize();
		int xaxis=(int)(size.width*0.10);
		int yaxis=(int)(size.height*0.60);
		PointerInput finger=new PointerInput(Kind.TOUCH,"Finger");
		Sequence scrollright=new Sequence(finger,0);
		scrollright.addAction(finger.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), xaxis, yaxis));
		scrollright.addAction(finger.createPointerDown(0));
		scrollright.addAction(finger.createPointerMove(Duration.ofSeconds(1), Origin.viewport(), xaxis+960, yaxis));
		scrollright.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(scrollright));
		}
	public static void longPress() {
		Dimension size=driver.manage().window().getSize();
		int xaxis=(int)(size.width*0.50);
		int yaxis=(int)(size.height*0.40);
		PointerInput finger=new PointerInput(Kind.TOUCH,"Finger");
		Sequence longpress=new Sequence(finger,0);
		longpress.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), xaxis, yaxis));
		longpress.addAction(finger.createPointerDown(0));
		longpress.addAction(finger.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), xaxis, yaxis));
		longpress.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(longpress));
		}
	public static void doubleTap() {
		Dimension size=driver.manage().window().getSize();
		int xaxis=(int)(size.width*0.50);
		int yaxis=(int)(size.height*0.60);
		PointerInput finger=new PointerInput(Kind.TOUCH,"Finger");
		Sequence doubletap=new Sequence(finger,0);
		doubletap.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), xaxis, yaxis));
		doubletap.addAction(finger.createPointerDown(0));
		doubletap.addAction(finger.createPointerUp(0));
		
		doubletap.addAction(new Pause(finger, Duration.ofMillis(100)));
		doubletap.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), xaxis, yaxis));
		doubletap.addAction(finger.createPointerDown(0));
		doubletap.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(doubletap));
		}
		
	
	public static void pinch() throws InterruptedException {
		Dimension size=driver.manage().window().getSize();
		int xaxis=(int)(size.width/2);
		int yaxis=(int)(size.height/2);
		PointerInput finger1=new PointerInput(Kind.TOUCH,"Finger1");
		PointerInput finger2=new PointerInput(Kind.TOUCH,"Finger2");
		Sequence pinch1=new Sequence(finger1,0);
		pinch1.addAction(finger1.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), xaxis, yaxis+100));
		pinch1.addAction(finger1.createPointerDown(0));
		pinch1.addAction(finger1.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), xaxis, yaxis+600));
		pinch1.addAction(finger1.createPointerUp(0));
		//pinch1.addAction(new Pause(finger1, Duration.ofMillis(100)));
		Sequence pinch2=new Sequence(finger2,0);
		pinch2.addAction(finger2.createPointerMove(Duration.ofSeconds(0), Origin.viewport(), xaxis, yaxis-100));
		pinch2.addAction(finger2.createPointerDown(0));
		pinch2.addAction(finger2.createPointerMove(Duration.ofMillis(2000), Origin.viewport(), xaxis, yaxis-600));
		pinch2.addAction(finger2.createPointerUp(0));
		driver.perform(Arrays.asList(pinch1,pinch2));
		}
		
	

	@Test(enabled=false)
	public void checkLaunchMainActivity() throws MalformedURLException, InterruptedException {
	UiAutomator2Options uio= new UiAutomator2Options();
	URL url=new URL("http://127.0.0.1:4723/");
	uio.setPlatformName("ANDROID");
	uio.setDeviceName("OnePlus");
	uio.setPlatformVersion("12");
	uio.setAutomationName("UiAutomator2");
	uio.setAppPackage("com.solodroid.solomerce");
	uio.setAppActivity("com.solodroid.solomerce.activities.MainActivity");
	driver = new AndroidDriver(url,uio);
	driver.findElement(By.id("com.solodroid.solomerce:id/search")).click();
	driver.findElement(By.id("com.solodroid.solomerce:id/search_src_text")).sendKeys("jumpsuit");
	driver.hideKeyboard();
	//driver.findElement(By.id("com.solodroid.solomerce:id/btn_add_cart")).click();
	//driver.findElement(By.id("com.solodroid.solomerce:id/btn_continue")).click();
	driver.findElement(By.id("com.solodroid.solomerce:id/category_image")).click();
	driver.findElement(By.id("com.solodroid.solomerce:id/btn_add_cart")).click();
	Thread.sleep(5000);
	WebElement orders=driver.findElement(By.id("com.solodroid.solomerce:id/userInputDialog"));
	orders.click();
	orders.sendKeys("1");
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(By.id("com.solodroid.solomerce:id/cart")).click();
	//driver.findElement(AppiumBy.linkText("Shopping Cart"));
	Thread.sleep(6000);
	}
	
	@Test(enabled=false)
	public void checkScrollUpDown() throws MalformedURLException, InterruptedException {
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
		//driver.findElement(AppiumBy.id("com.solodroid.solomerce:id/category_image")).click();
		for(int i=0;i<3;i++) {
			scrollUp();
		}
		for(int i=0;i<2;i++) {
			scrollDown();
		}
		}
	
	
	@Test(enabled=false)
	public void checkScrollUpDownandLeftRight() throws MalformedURLException, InterruptedException {
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
		//driver.findElement(AppiumBy.id("com.solodroid.solomerce:id/category_image")).click();
		for(int i=0;i<3;i++) {
			scrollUp();
		}
		for(int i=0;i<3;i++) {
			scrollDown();
		}
		Thread.sleep(5000);
		for(int i=0;i<3;i++) {
			scrollLeft();
		}
		for(int i=0;i<3;i++) {
			scrollRight();
		}
		}
	
	
	@Test(enabled=false)
	public void checkLongPressDoubleTap() throws MalformedURLException, InterruptedException {
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
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("+scrollablecontainer+").scrollToEnd(3)."
				+ "scrollTextIntoView(\"Animal Jumpsuit for Newborn Baby\")")).click();
		Thread.sleep(2000);
		longPress();
		Thread.sleep(3000);
		doubleTap();
	}
	
	
	@Test
	public void checkZoomIn() throws MalformedURLException, InterruptedException {
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
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable("+scrollablecontainer+").scrollToEnd(3)."
				+ "scrollTextIntoView(\"Animal Jumpsuit for Newborn Baby\")")).click();
		Thread.sleep(2000);
		longPress();
		Thread.sleep(2000);
		pinch();
	}
}