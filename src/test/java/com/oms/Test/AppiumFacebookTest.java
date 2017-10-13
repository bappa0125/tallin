package com.oms.Test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.oms.businesslib.FindOwnersLib;
import com.oms.businesslib.HomePageLib;
import com.oms.businesslib.MobileHomePageLib;
import com.oms.commonlib.ConstantClass;
import com.oms.genericlib.Driver;
import com.oms.genericlib.ReporterConfig;
import com.oms.webelementrepositoryCreateOrder.FindOwners;
import com.relevantcodes.extentreports.LogStatus;

public class AppiumFacebookTest {

	
	MobileHomePageLib mobilehomePageLib;

	@BeforeClass
	public void config() throws Exception
	{
		Driver.configAndroidDriver();
		
		 mobilehomePageLib = new MobileHomePageLib();
	}
	
	@BeforeMethod
	public void navigateToApplication(Method testMethod) throws Exception
	{
		mobilehomePageLib.navigateToMobileApplicationURL();;
		ReporterConfig.logger = ReporterConfig.report.startTest(testMethod.getName());
	}
	
	@Test(priority=1)
	public void addNewOwner() throws Exception
	{
		mobilehomePageLib.loginMobileApp();
	}
	
	@AfterClass
	public void finalcall() {
		ReporterConfig.logger.log(LogStatus.INFO, "Test End");
		ReporterConfig.report.endTest(ReporterConfig.logger);
		ReporterConfig.report.flush();
		//ConstantClass.globaldriver.get(ReporterConfig.ReportLocation);
	}
	
}
