package com.testcases;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.pageobjects.LoginPage;
import com.pageobjects.LogoutPage;

public class TC_Logout_002 extends BaseClass{
	
	@Test
	public void logouttest() throws IOException
	{
		logger.info("URL is opened");

		driver.manage().window().maximize();
	
	
	LogoutPage logt = new LogoutPage(driver);
	
	logt.setusername(EmailOrPhone);
	logger.info("Entered username");
	logt.setpass(Password);
	logger.info("Entered password");
	logt.setsubmit();
	logger.info("Submit clicked");
	
	//taking snapshot anywhere
	try {
		takeSnapShot(driver,"beforelogoutTest");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	logt.Logout();
	logger.info("logout dropdown clicked");
    driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS) ;
    logt.Logout1();
	logger.info("logout clicked");
	
	
	
	
	}
}
