package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class CheckBoxStatus {
	@Test
	public void checkBox() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","POCO X2");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","10");
		dc.setCapability("UDID","db4cf023");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		
		URL url=new URL("http://localhost:4723/wd/hub");
	    AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
	    driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Controls\"]").click();
	    driver.findElementByAccessibilityId("2. Dark Theme").click();
	    
		
		
		
		
		
		
		
		
//		driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
//		driver.findElementById("android:id/button1").click();
//		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
//		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Controls\"]").click();
//		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]").click();
//		boolean chkbx1 = driver.findElementById("io.appium.android.apis:id/check1").isEnabled();
//		boolean chkbx2 = driver.findElementById("io.appium.android.apis:id/check2").isEnabled();
//		boolean radbtn1 = driver.findElementById("io.appium.android.apis:id/radio1").isEnabled();
//		boolean radbtn2 = driver.findElementById("io.appium.android.apis:id/radio2").isEnabled();
//		boolean expected=true;
//		Assert.assertEquals(chkbx1, expected);
//		System.out.println("Checkbox 1 is enabled");
//		Assert.assertEquals(chkbx2, expected);
//		System.out.println("Checkbox 2 is enabled");
//		Assert.assertEquals(radbtn1, expected);
//		System.out.println("Radio button 1 is enabled");
//		Assert.assertEquals(radbtn2, expected);
//		System.out.println("Radio button 2 is enabled");
//		
		
	}

}
