
package com.oms.genericlib;
import java.io.File;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.oms.commonlib.ConstantClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Driver{
                
                static ConstantClass CC = new ConstantClass();
                public static WebDriver driver;
                
                public static WebDriver configChromeDriver() throws Exception
                {
                	System.setProperty("webdriver.chrome.driver", ConstantClass.chromeDriverPath);
            		ChromeOptions options = new ChromeOptions();
            		//options.addExtensions(new File(ConstantClass.joshuaExtnPath));
            		DesiredCapabilities capabilities = new DesiredCapabilities();
            		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            		driver = new ChromeDriver(capabilities);
            		driver.manage().window().maximize();
            		driver.manage().deleteAllCookies();
            		ReporterConfig.intialiseconfig();
                     ConstantClass.globaldriver=driver;
                	return driver;
                }
                
                @SuppressWarnings("rawtypes")
				public static WebDriver configAndroidDriver() throws Exception
                {
                	DesiredCapabilities capabilities=DesiredCapabilities.android();
            		// set the capability to execute test in chrome browser
            		 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME); 
            		// set the capability to execute our test in Android Platform
            		   capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID); 
            		// we need to define platform name
            		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
            		// Set the device name as well (you can give any name)
            		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"my phone");
            		 // set the android version as well 
            		   capabilities.setCapability(MobileCapabilityType.VERSION,"6.0.1");
            		 // Create object of URL class and specify the appium server address
            		 URL url= new URL("http://127.0.0.1:4723/wd/hub");
            		 
            		// Create object of  AndroidDriver class and pass the url and capability that we created
            		 driver = new AndroidDriver(url,capabilities);
            		 
            		ReporterConfig.intialiseconfig();
                     ConstantClass.globaldriver=driver;
                	return driver;
                }
}

