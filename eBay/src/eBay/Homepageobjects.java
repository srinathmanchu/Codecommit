package eBay;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepageobjects  {
	AndroidDriver<WebElement> driver;
	//Initiating the Page Factory methos to define a page object objects 
	//Xpath declaration with the variable assigned
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.ebay.mobile:id/capsule_selling']")
    private WebElement header;
	
    public Homepageobjects(AndroidDriver<WebElement> driver) 
    {
    	this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    //Validating the Header and app is sucessfully launched or not.
    public void validateHeader() throws InterruptedException
    {
    	Thread.sleep(6000);
    	if(header.isDisplayed()) {
    		System.out.println("Header is displayed as" +header.getText());
        	assert header.getText().equalsIgnoreCase("Selling");
        	Reporter.log( "Assert Passed");
    	}
        	else {
        		Reporter.log( "Assert Failed");
        	
    	}
    }
	
	}
