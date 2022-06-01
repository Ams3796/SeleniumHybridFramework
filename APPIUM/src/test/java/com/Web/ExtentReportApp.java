package com.Web;

import java.lang.module.ModuleDescriptor.Exports;

import javax.naming.ldap.ExtendedRequest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.reporters.SuiteHTMLReporter;







public class ExtentReportApp {
	
	WebDriver driver=new ChromeDriver();
	SuiteHTMLReporter reporter;
	Exports reports;
	ExtendedRequest test;
	
	@BeforeSuite
	public void setup()
	{
		reporter= new SuiteHTMLReporter(Autoconstant.ExtentReportPath+".html");
		
		reporter.config().setDocumentTitle("SDET19");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("Smoke");
		
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("BuildNO","12");
		reports.setSystemInfo("Env","QA");
		reports.setSystemInfo("Platform","Windows");
		
	}
	@Test
	public void Test1()
	{
		test=reports.createTest("test1");
		driver.get("https://mvnrepository.com/");
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void Test2()
	{
		test=reports.createTest("test2");
		driver.get("https://mvnrepository.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterSuite
	public void close()
	{
		reports.flush();
	}
	
}
