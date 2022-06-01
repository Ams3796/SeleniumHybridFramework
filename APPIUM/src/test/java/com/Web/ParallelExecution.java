package com.Web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ParallelExecution {
     
	@Parameters({"deviceName","platformVersion","UDID","PORT"})
	@Test
	
	public void parallelExecution(String deviceName,String platformVersion,String UDID,String port) throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
   		dc.setCapability("deviceName","POCO X2");
   		dc.setCapability("automationName","appium");
   		dc.setCapability("platformName","appium");
   		dc.setCapability("platformVersion","10");
   		dc.setCapability("UDID","db4cf023");
   		dc.setCapability("appPackage","com.androidsample.generalstore");
   		dc.setCapability("appActivity",".SplashActivity");
   		
   		URL url=new URL("http://localhost:4723/wd/hub");
   	    AndroidDriver driver=new AndroidDriver(url,dc);
   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   		
	}
	

}
