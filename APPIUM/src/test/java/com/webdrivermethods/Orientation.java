package com.webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Orientation {

       @Test
       public void orientation() throws MalformedURLException, InterruptedException {
    	   
    	   DesiredCapabilities dc=new DesiredCapabilities();
	   		dc.setCapability("deviceName","POCO X2");
	   		dc.setCapability("automationName","appium");
	   		dc.setCapability("platformName","appium");
	   		dc.setCapability("platformVersion","10");
	   		dc.setCapability("UDID","db4cf023");
	   		dc.setCapability("appPackage","io.appium.android.apis");
	   		dc.setCapability("appActivity",".ApiDemos");
	   		dc.setCapability("noReset",true);
	   		
	   		URL url=new URL("http://localhost:4723/wd/hub");
	   	    AndroidDriver driver=new AndroidDriver(url,dc);
	   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
	   		ScreenOrientation currentscreenorientation = driver.getOrientation();
    	   System.out.println(currentscreenorientation);
    	   Thread.sleep(3000);
    	   
    	   driver.rotate(ScreenOrientation.LANDSCAPE);
    	   System.out.println(driver.getOrientation());
    	   Thread.sleep(3000);
    	   
    	   driver.rotate(ScreenOrientation.PORTRAIT);
    	   System.out.println(driver.getOrientation());
    	   
    	   
       }

}
