package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class AddingProductCart extends BaseClass {
	@Test
	public void tc1() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapplication();
		
		utilies.switchTabs(driver);
		
		SkillraryDemoLoginPage d=new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver,d.getCourseTab());
		d.seleniumtrainingbtn();	
		AddtocartPage a=new AddtocartPage(driver);
		utilies.doubleClick(driver,a.getAddBtn());
		a.addtocartButton();
		utilies.alertPopup(driver);
		
		
		Assert.assertEquals(driver.getTitle(),pdata.getData("addtocartTitle"));
	}

}
