package com.testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.utilities.readConfig;

public class BaseClass {
	
	readConfig readconfig = new readConfig();
	
	public String BaseURL = readconfig.GetapplicationURL();
	public String EmailOrPhone = readconfig.Username() ;
	public String Password	= readconfig.Password();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	public void setup()
	
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
				System.setProperty("webdriver.chromedriver",System.getProperty("user.dir")+ readconfig.Chromepath());
		driver= new ChromeDriver(options);
		
		
		
		driver.get(BaseURL)	;
		
		
		logger = Logger.getLogger("Facebookautomation");
		PropertyConfigurator.configure("log4j.properties");
		
	
	
	
	}

/*	@AfterClass
	public void teardown()
	
	{
		driver.quit();
			}
	*/
	
	 public static void takeSnapShot(WebDriver webdriver,String tname) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(System.getProperty("user.dir")+ "/Screenshots/" +tname + ".png"	);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    }

	

}
