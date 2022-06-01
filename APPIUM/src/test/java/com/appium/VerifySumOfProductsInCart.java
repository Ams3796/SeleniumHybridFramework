package com.appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Web.AutoConstantapp;
import com.Web.JsonFile;

import io.appium.java_client.android.AndroidDriver;

public class VerifySumOfProductsInCart {
	
	@Test
	public void verify() throws IOException, ParseException
	{
		JsonFile json=new JsonFile();
		DesiredCapabilities dc=new DesiredCapabilities();
   		dc.setCapability(AutoConstantapp.deviceName,json.readDataFromJson("deviceName"));
   		dc.setCapability(AutoConstantapp.automationName,json.readDataFromJson("automationName"));
   		dc.setCapability(AutoConstantapp.platformName,json.readDataFromJson("Android"));
   		dc.setCapability(AutoConstantapp.platformVersion,json.readDataFromJson("platformVersion"));
   		dc.setCapability(AutoConstantapp.UDID,json.readDataFromJson("UDID"));
   		dc.setCapability(AutoConstantapp.appPackage,json.readDataFromJson("appPackage"));
   		dc.setCapability(AutoConstantapp.appActivity,json.readDataFromJson("appActivity"));
   		dc.setCapability("noReset",true);
   		
   		URL url=new URL("http://localhost:4723/wd/hub");
   	    AndroidDriver driver=new AndroidDriver(url,dc);
   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   		
   		driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();
   		scrollToElement(driver,"text","India");
   		driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
   		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Ams");
   		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
   		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
   		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]\r\n"
   				+ "").click();
   		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]\r\n"
   				+ "").click();
   		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
   		String text = driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();
   		String amt1 = driver.findElementByXPath("//android.widget.TextView[@text='$160.97']").getText();
   	    String amt2 = driver.findElementByXPath("//android.widget.TextView[@text='$120.0']").getText();
   	    System.out.println(amt1);
   	    System.out.println(amt2);
   	    String price1=amt1.replace("$","");
   	 String price2=amt2.replace("$","");
   	 int cost1=Integer.parseInt(price1);
   	 int cost2=Integer.parseInt(price2);
   	 
//   		String expected="amt1+amt2";
//   		System.out.println(expected);
//   		int actual = Integer.parseInt(text);
//   		WebElement amt1 = driver.findElementByXPath("//android.widget.TextView[@text='$160.97']");
//   		System.out.println();
//   		WebElement amt2 = driver.findElementByXPath("//android.widget.TextView[@text='$120.0']");
//   		String expect="amt1+amt2";
//   		int expected = Integer.parseInt(expect);
//   		Assert.assertEquals(text,expected);
//   		System.out.println("Passes");
   		
	}

	public void scrollToElement(AndroidDriver driver,String an,String av)
    {
 	   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
 	   
    }
	
}
