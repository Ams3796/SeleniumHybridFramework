package com.Web;

public interface AutoConstantapp {
	String DirPath = null;
	String ExtentReportPath = DirPath+"/reports_app/Report_APPIUM";
	String PropertyFile="../APPIUM/DesiredCapData.properties";
	String JsonFile="../APPIUM/Read_data.json";
	String automationName="automationName";
	String deviceName="deviceName";
	String platformName="platformName";
	String platformVersion="platformVersion";
	String UDID="UDID";
	String appPackage="com.androidsample.generalstore";
	String appActivity=".SplashActivity";

}
