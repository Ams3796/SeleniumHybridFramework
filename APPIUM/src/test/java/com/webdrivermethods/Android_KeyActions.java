package com.webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Android_KeyActions {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc=new DesiredCapabilities();
   		dc.setCapability("deviceName","POCO X2");
   		dc.setCapability("automationName","appium");
   		dc.setCapability("platformName","appium");
   		dc.setCapability("platformVersion","10");
   		dc.setCapability("UDID","db4cf023");
   		dc.setCapability("appPackage","com.android.camera");
   		dc.setCapability("appActivity",".VideoCamera");
   		dc.setCapability("noReset",true);
   		
   		URL url=new URL("http://localhost:4723/wd/hub");
   	    AndroidDriver driver=new AndroidDriver(url,dc);
   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
   		Thread.sleep(5000);
   		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
   		Thread.sleep(3000);
   		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
   		Thread.sleep(3000);
   		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
   		Thread.sleep(3000);
   		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
   		Thread.sleep(3000);
   		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
   		Thread.sleep(3000);
   		

	}

}
