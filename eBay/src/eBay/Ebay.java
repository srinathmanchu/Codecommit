package eBay;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Ebay extends NewTest {

	@Test
	public void validateTitle() throws InterruptedException {
		
		Homepageobjects ref = new Homepageobjects(driver);
		ref.validateHeader();
		Thread.sleep(5000);
		System.out.println("Launched the app");
		
	}
	
	
}
