package com.testcases;


import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.LoginPage;

public class TC_Login_001 extends BaseClass {
	
	@Test
	public void logintest() throws IOException
	{
		logger.info("URL is opened");

		driver.manage().window().maximize();
	
	
	LoginPage lp = new LoginPage(driver);
	
	lp.setusername(EmailOrPhone);
	logger.info("Entered username");
	lp.setpass(Password);
	logger.info("Entered password");
	lp.setsubmit();
	
	
 //	driver.manage().timeouts().implicitlyWait(3 , TimeUnit.SECONDS);
		
//	if (driver.getPageSource().contains("Facebook")) {
//		
//		Assert.assertTrue(true);
//	}
//		 
//	   else {
//		   try {
//			takeSnapShot(driver,"loginTest");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		  Assert.assertTrue(false);
//		}

}
}