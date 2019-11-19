package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class likepost {

	
WebDriver ldriver;
	
	public  likepost(WebDriver rdriver){
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
		 
		 
		
}

	@FindBy(xpath="//div[2]/div[1]/div[2]/div[1]/div/a")
	@CacheLookup
	WebElement Scroll;
	
	
		public void scrollpage()
		{
		
		Scroll.click();
	}
		
		
		
		
		
		
		
		
		@FindBy(className="_2qgu _54rt img")
		@CacheLookup
		WebElement openprofile;
		
		
			public void openprofilepage()
			{
			
			openprofile.click();
		}

	}
	
	