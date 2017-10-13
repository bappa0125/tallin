package com.oms.commonlib;

import java.io.File;

import org.openqa.selenium.WebDriver;


public class ConstantClass {
	
	
	// Application URL
	
	public static String joshuaExtnPath = ".\\extensions\\chrome-ext.crx";
	
	//public static String chromeDriverPath = ".\\chromeDriver\\chromedriver.exe";
	// Application Linux
	public static String chromeDriverPath = "./chromeDriver/chromedriver";
	public static WebDriver globaldriver;
	
	//
	public static final File projectDir =  new File(System.getProperty("user.dir"));

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	

}
