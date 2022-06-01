package com.Web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwitchFromLocalAppToWebAp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
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

//   		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
//   		scrollToElement(driver,"text","India");
   		//driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
   		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Ams");
   		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
   		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
   		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]\r\n"
   				+ "").click();
   		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
   		driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
   		
   		Set<String> windows = driver.getContextHandles();
   		for(String win:windows)
   		{
   			System.out.println("Active Applications: "+win);
   		}
   		Thread.sleep(2000);
   		//driver.context("WEBVIEW_com.androidsample.generalstore");
   		
   		driver.findElementByXPath("//input[@class='gLFyf']").sendKeys("Poco x2");
   		driver.findElementById("((//li[@class='sbct'])[1]").click();
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
   		
	}
	public static void scrollToElement(AndroidDriver driver,String an,String av)
    {
 	   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
    }

}
