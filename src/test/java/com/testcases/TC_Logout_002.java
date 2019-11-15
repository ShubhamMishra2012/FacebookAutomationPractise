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
	
	
	LogoutPage lp = new LogoutPage(driver);
	
	lp.setusername(EmailOrPhone);
	logger.info("Entered username");
	lp.setpass(Password);
	logger.info("Entered password");
	lp.setsubmit();
	logger.info("Submit clicked");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	lp.Logout();
	logger.info("logout dropdown clicked");
    driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS) ;
	lp.Logout1();
	logger.info("logout clicked");
	
	
	}
}
