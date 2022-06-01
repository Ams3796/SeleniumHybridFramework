package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LaunchCalendar {
          
	@Test
	public void LaunchCalendar() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","POCO X2");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformName","appium");
		dc.setCapability("platformVersion","10");
		dc.setCapability("UDID","db4cf023");
		dc.setCapability("appPackage","com.xiaomi.calendar");
		dc.setCapability("appActivity","com.android.calendar.homepage.AllInOneActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementById("android:id/button1").click();
		driver.findElementById("com.xiaomi.calendar:id/change_language").click();
		String res = driver.findElementByXPath("//android.view.View[@content-desc=\"28 September 2021 ( according to lunar calendar).Tuesday\"]").getText();
		System.out.println(res);
		
		
		
		
	}
}
