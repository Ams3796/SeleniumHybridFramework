package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SendValueInApiDemo {
	@Test
	public void sendValue() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","POCO X2");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformName","appium");
		dc.setCapability("platformVersion","10");
		dc.setCapability("UDID","db4cf023");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
		driver.findElementById("android:id/button1").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Controls\"]").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]").click();
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("Amaya");
		driver.findElementById("io.appium.android.apis:id/check1").click();
		driver.findElementById("io.appium.android.apis:id/button").click();
	}

}
