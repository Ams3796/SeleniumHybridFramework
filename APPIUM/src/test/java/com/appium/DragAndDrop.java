package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragAndDrop {
	
	@Test
	public void dragAndDrop() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","POCO X2");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformName","appium");
		dc.setCapability("platformVersion","10");
		dc.setCapability("UDID","db4cf023");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		dc.setCapability("noReset",true);
		
		URL url=new URL("http://localhost:4723/wd/hub");
	    AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
		driver.findElementByAccessibilityId("Drag and Drop").click();
		WebElement src = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		WebElement dest = driver.findElementById("io.appium.android.apis:id/drag_dot_3");
		TouchAction to=new TouchAction(driver);
		to.longPress(src).waitAction(2000).moveTo(dest).release().perform();
	}

}

          
