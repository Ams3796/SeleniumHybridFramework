package com.Web;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TakeScreenshot {
	
    static AndroidDriver staticdriver;
    static AndroidDriver driver;
    @Test
    public void orientation() throws InterruptedException, IOException {
//    	AppiumDriverLocalService service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
//				.usingPort(4723)
//				.withLogFile(new File("../APPIUM/Logs.txt")));
//    	service.start();
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
	   	    driver=new AndroidDriver(url,dc);
	   	    staticdriver=driver;
	   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   		TakeScreenshot.getscreenshot("ApiDemos");
	   		//service.stop();
   
    }
    
		
		
	public static String getscreenshot(String name) throws IOException 
	{
        File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest = new File(destfile);
		FileUtils.copyFile(srcfile,finaldest);
		return destfile;
		
	}
		
	}
