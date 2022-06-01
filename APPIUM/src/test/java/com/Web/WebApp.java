package com.Web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebApp {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		//Common DC (Android oi IOS)
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"POCO X2");
   		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
   		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
   		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
   		dc.setCapability(MobileCapabilityType.UDID,"db4cf023");
   		dc.setCapability(MobileCapabilityType.NO_RESET, false);
   		
   		dc.setCapability("browserName","Chrome");   //Launch browser
   		
   		URL url=new URL("http://localhost:4723/wd/hub");   //Appium server port No.
   	    AndroidDriver driver=new AndroidDriver(url,dc);
   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   		
   		driver.get("https://www.amazon.com/");
   		
   	}

}								
