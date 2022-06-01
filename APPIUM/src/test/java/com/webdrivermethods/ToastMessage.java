package com.webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ToastMessage {
	@Test
	public void toastMessage() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
   		dc.setCapability("deviceName","POCO X2");
   		dc.setCapability("automationName","appium");
   		dc.setCapability("platformName","appium");
   		dc.setCapability("platformVersion","10");
   		dc.setCapability("UDID","db4cf023");
   		dc.setCapability("appPackage","com.androidsample.generalstore");
   		dc.setCapability("appActivity",".SplashActivity");
   		dc.setCapability("noReset",true);
   		
   		URL url=new URL("http://localhost:4723/wd/hub");
   	    AndroidDriver driver=new AndroidDriver(url,dc);
   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
   		scrollToElement(driver,"text","India");
   		driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
//   		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Ams");
   		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
   		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
   		String toastmsg = driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
   		System.out.println(toastmsg);
   		
	}
	public void scrollToElement(AndroidDriver driver,String an,String av)
    {
 	   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
    }
	
	
}
