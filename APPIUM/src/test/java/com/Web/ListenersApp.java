package com.Web;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.appium.VerifyProductAvailableInCart;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ListenersApp implements ITestListener {
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		 test=reports.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,result.getMethod().getMethodName()+"is Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,result.getName()+"is failed");
		test.log(Status.FAIL,result.getThrowable());
		
		try {
		String path=VerifyProductAvailableInCart.getscreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
		
		
		
	}
		
	

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,result.getMethod().getMethodName()+"Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		reporter= new ExtentHtmlReporter("../APPIUM/ExtentReport/report.html");
		
		reporter.config().setDocumentTitle("SDET19");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Smoke");
		
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("BuildNO","12");
		reports.setSystemInfo("Env","QA");
		reports.setSystemInfo("Platform","Windows");
		
	}

	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

	
		

	}


