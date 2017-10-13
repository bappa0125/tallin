package com.oms.genericlib;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.oms.commonlib.ConstantClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ReporterConfig {

	
	public static ExtentReports report;
	public static ExtentTest logger;  
	  static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz");  //yyMMddHHmmssZ
	   static //get current date time with Date()
	   Date date = new Date();
	  // System.out.println(dateFormat.format(date));
	   
	   static Calendar cal = Calendar.getInstance();
       static SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
      // System.out.println( sdf.format(cal.getTime()) );
	
	public static String ReportLocation=ConstantClass.projectDir+"/Utilities/Report/estonia"+ sdf.format(cal.getTime())+".html";
	
public static void intialiseconfig()
{
	report=new ExtentReports(ReportLocation,false);
	
	logger=report.startTest("Tallin");	

}


public static String captureScreenShot(WebDriver driver,String screenshotname)
{
	try{
		TakesScreenshot ts=(TakesScreenshot) driver; 
		File src=ts.getScreenshotAs(OutputType.FILE);
		String des=ConstantClass.projectDir+"\\Utilities\\Report\\Screenshots\\"+screenshotname+".png";
		File destination =new File(des);
		FileUtils.copyFile(src, destination);
		
		//System.out.println("Screen Shot taken ");
		
		return des;		
	}
	catch(Exception e)
	{
		System.out.println("Exception while taking screen shot"+e.getMessage());
		return e.getMessage();
	}
	
}

/*public static void captureScreenShot(WebDriver ldriver){
	 
	  // Take screenshot and store as a file format
	  File src= ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
	try {
	  // now copy the  screenshot to desired location using copyFile method
	 
	 FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));
	       }
	 
	catch (IOException e)
	 
	{
	 
	System.out.println(e.getMessage());
	 
	    }
	 
	}*/

public static void PassCase (String ImgDesc,String imagename )
{
	String screenshot_path=ReporterConfig.captureScreenShot(ConstantClass.globaldriver, imagename);
	String image= logger.addScreenCapture(screenshot_path);
	ReporterConfig.logger.log(LogStatus.PASS, ImgDesc, image);
}

public static void FailCase (String failedDetail,String imagename )
{
	String screenshot_path=ReporterConfig.captureScreenShot(ConstantClass.globaldriver, imagename);
	String image= logger.addScreenCapture(screenshot_path);
	ReporterConfig.logger.log(LogStatus.FAIL, failedDetail, image);
}


	
}
