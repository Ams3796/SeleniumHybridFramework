package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class GetAllElementsApiDemo {
	
	@Test
	public void getElements() throws MalformedURLException
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
		List<WebElement> list= driver.findElementsByClassName("android.widget.TextView");
		for(WebElement wb:list)
		{
			System.out.println(wb.getText());
		}
	    
	    
		
		
		
		
	}

}
