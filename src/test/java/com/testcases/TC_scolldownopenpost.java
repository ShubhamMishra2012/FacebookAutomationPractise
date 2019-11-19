package com.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.pageobjects.LogoutPage;
import com.pageobjects.likepost;
import com.pageobjects.LoginPage;

public class TC_scolldownopenpost extends BaseClass {
	@Test(priority=0)
	void likepost() throws IOException
	{
		
		driver.manage().window().maximize();
	//Object calls
		LoginPage lp = new LoginPage(driver);
	
		
		lp.setusername(EmailOrPhone);
		logger.info("Entered username");
		lp.setpass(Password);
		logger.info("Entered password");
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		lp.setsubmit();
		logger.info("Submit clicked");
	}
		
		/*@Test(priority=2)
		void scrolldown2()throws IOException
		{
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	
	   logger.info("page scrolled");
		
		*/
	

		@Test(priority=1)
		void openprofilepicandtakescreenshot()throws IOException
		{
			
			likepost lpost = new likepost(driver);
			lpost.openprofilepage();
			logger.info("profile page opened");
			
			
			
			
		}

}
