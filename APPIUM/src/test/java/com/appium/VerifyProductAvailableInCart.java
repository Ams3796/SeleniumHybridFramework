package com.appium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Web.AutoConstantapp;
import com.Web.PropertyFile;

import io.appium.java_client.android.AndroidDriver;
@Listeners(com.Web.ListenersApp.class)
public class VerifyProductAvailableInCart {
	
	
	@Test
	public void verifyCart() throws MalformedURLException, FileNotFoundException
	{
		PropertyFile prop=new PropertyFile();
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(AutoConstantapp.deviceName,prop.read_prop("deviceName"));
		dc.setCapability(AutoConstantapp.automationName,prop.read_prop("automationName"));
		dc.setCapability(AutoConstantapp.platformName,prop.read_prop("Android"));
		dc.setCapability(AutoConstantapp.platformVersion,prop.read_prop("platformVersion"));
		dc.setCapability(AutoConstantapp.UDID,prop.read_prop("UDID"));
		dc.setCapability(AutoConstantapp.appPackage,prop.read_prop("appPackage"));
		dc.setCapability(AutoConstantapp.appActivity,prop.read_prop("appActivity"));
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
		Assert.fail();
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		String pro = driver.findElementById("com.androidsample.generalstore:id/productName").getText();
		String expected = "ir Jordan 4 Retro";
		Assert.assertEquals(pro,expected);
		System.out.println("Product is available");



	}
	public static String getscreenshot(String name) throws IOException 
	{
		
		TakesScreenshot staticdriver = null;
		File srcfile = ((TakesScreenshot)staticdriver).getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest = new File(destfile);
		FileUtils.copyFile(srcfile,finaldest);
		return destfile;

	}

	public void scrollToElement(AndroidDriver driver,String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");



	}}

	
