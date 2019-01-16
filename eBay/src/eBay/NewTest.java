package eBay;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
public class NewTest {
	AndroidDriver<WebElement> driver;
	public static Process p;
	
	/*
	 * 
	 * @author-Srinath
	 * @Date-16/01/2019
	 * @Summary-base test class executed before and after test
	 */
  @BeforeTest
  public void appLaunch() {
	  		Logger logger = Logger.getLogger("NewTest");
	  		PropertyConfigurator.configure("log4j.properties");
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", "Moto");
			logger.info("Device name is displayed");
			caps.setCapability("udid", "ZY3228RV6C"); 
			caps.setCapability("automationName", "uiautomator2"); 
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "8.1.0");
			logger.info("Platform version is displayed");
			caps.setCapability("appPackage", "com.ebay.mobile");
			logger.info("App package is displayed");
			caps.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"100");
			caps.setCapability("noReset", "true");
			try {
				 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
				 logger.info("Appium is launched");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	  
  @AfterTest
  public void endTest() {
	  
	  driver.quit();
  }
 
  }

