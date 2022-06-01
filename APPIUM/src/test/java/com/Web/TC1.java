package com.Web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TC1 {

	public void demo(String deviceName,String PlatformVersion,String UDID,String port) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
   		dc.setCapability("deviceName",deviceName);
   		dc.setCapability("automationName","appium");
   		dc.setCapability("platformName","Android");
   		dc.setCapability("platformVersion",PlatformVersion);
   		dc.setCapability("UDID",UDID);
   		dc.setCapability("appPackage","com.androidsample.generalstore");
   		dc.setCapability("appActivity",".SplashActivity");
   		dc.setCapability("noReset",true);
   		
   		URL url=new URL("http://localhost:"+port+"/wd/hub");
   	    AndroidDriver driver=new AndroidDriver(url,dc);
   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   		Landing_Page lp=new Landing_Page(driver);
   		lp.logintoApp("abc");

   		
   		
	}

}
