package com.webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class NetworkConnection {
	@Test
	public void network() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName","POCO X2");
		dc.setCapability("automationName","appium");
		dc.setCapability("platformName","appium");
		dc.setCapability("platformVersion","10");
		dc.setCapability("UDID","db4cf023");
		dc.setCapability("app","C:\\\\Users\\\\Admin\\\\Downloads\\\\General-Store.apk");
		dc.setCapability("noreset","true");
		URL url=new URL("http://localhost:4723/wd/hub");
	    AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Connection currentstate = driver.getConnection();
		System.out.println(currentstate);
		Thread.sleep(3000);
		
		driver.setConnection(Connection.DATA);
		System.out.println(driver.getConnection());
		
		driver.setConnection(Connection.WIFI);
		System.out.println(driver.getConnection());
		
		driver.setConnection(Connection.AIRPLANE);
		System.out.println(driver.getConnection());
	}

}
