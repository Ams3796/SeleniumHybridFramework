package com.Web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Landing_Page {
	
	AndroidDriver driver;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement countryDD;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nametxtbox;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement maleradiobtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement femaleradiobtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement letsshopbtn;
    
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getNametxtbox() {
		return nametxtbox;
	}

	public WebElement getMaleradiobtn() {
		return maleradiobtn;
	}

	public WebElement getFemaleradiobtn() {
		return femaleradiobtn;
	}

	public WebElement getLetsshopbtn() {
		return letsshopbtn;
	}
	
	public Landing_Page(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	public void logintoApp()
	{
		//countryDD.click();
		nametxtbox.sendKeys("abc");;
		maleradiobtn.click();
		letsshopbtn.click();
		
	}
	
	public void logintoApp(String name)
	{
		//getCountryDD().click();
		getNametxtbox().sendKeys(name);
		getFemaleradiobtn().click();
		getLetsshopbtn().click();
		
	}

}
