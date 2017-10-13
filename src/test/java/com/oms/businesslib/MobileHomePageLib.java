package com.oms.businesslib;

import org.openqa.selenium.support.PageFactory;

import com.oms.genericlib.Driver;
import com.oms.genericlib.ReporterConfig;
import com.oms.webelementrepositoryCreateOrder.HomePage;
import com.oms.webelementrepositoryCreateOrder.MobileHomePage;
import com.relevantcodes.extentreports.LogStatus;

public class MobileHomePageLib {

	MobileHomePage mobileHomePage = PageFactory.initElements(Driver.driver, MobileHomePage.class);
	
	public void navigateToMobileApplicationURL()
	{
		Driver.driver.get("http://www.facebook.com");
		ReporterConfig.logger.log(LogStatus.PASS, "Opened the application in mobile browser");
	}
	
	public void loginMobileApp() throws Exception
	{
		mobileHomePage.getUserId().sendKeys("subrata.fouzder@gmail.com");
		ReporterConfig.logger.log(LogStatus.PASS, "set the user id");
		mobileHomePage.getPassword().sendKeys("anything");
		ReporterConfig.logger.log(LogStatus.PASS, "set password");
		mobileHomePage.getloginButton().click();
		ReporterConfig.logger.log(LogStatus.PASS,"clicked on the login button");
	}
}
