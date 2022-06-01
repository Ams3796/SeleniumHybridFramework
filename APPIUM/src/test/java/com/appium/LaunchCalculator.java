package com.appium;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class LaunchCalculator {

	
		@Test
		public void launchcalculator() throws MalformedURLException{
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("deviceName","POCO X2");
			dc.setCapability("automationName","appium");
			dc.setCapability("platformName","Android");
			dc.setCapability("platformVersion","10");
			dc.setCapability("UDID","db4cf023");
			dc.setCapability("appPackage","com.miui.calculator");
			dc.setCapability("appActivity",".cal.AllInOneCalculatorActivity");
			
			URL url=new URL("http://localhost:4723/wd/hub");
			
			AndroidDriver driver=new AndroidDriver(url,dc);
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElementById("android:id/button1").click();
			driver.findElementById("com.miui.calculator:id/btn_7_s").click();
			driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
			driver.findElementById("com.miui.calculator:id/btn_3_s").click();
			driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
			driver.findElementById("com.miui.calculator:id/btn_4_s").click();
			driver.findElementById("com.miui.calculator:id/btn_equal_s").click();
			String res = driver.findElementById("com.miui.calculator:id/result").getText();
			String expected="= 14";
            Assert.assertEquals(res, expected);
			System.out.println(res);
			
			
		}
		
			
}	



