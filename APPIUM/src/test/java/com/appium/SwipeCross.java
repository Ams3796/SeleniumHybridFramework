package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwipeCross {
	
	
	public void swipe() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","POCO X2");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","10");
		dc.setCapability("UDID","db4cf023");
		dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity",".TouchScreenTestActivity");
		dc.setCapability("noReset",true);
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.swipe(520,513,544,1201,1000);
		
		Dimension size = driver.manage().window().getSize();
		int ht = size.getHeight();
		int wd = size.getWidth();
		System.out.println(ht);
		System.out.println(wd);
		
		driver.swipe((int)(wd*0.1),(ht/2),(int)(wd*0.9),(ht/2),500);
        driver.swipe((wd/2),(int)(ht*0.2),(wd/2),(int)(ht*0.8),500);
		
	}

}
