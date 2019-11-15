package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LogoutPage {
	
	

	WebDriver ldriver;
	
	public LogoutPage(WebDriver rdriver){
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
}

	
	@FindBy(name="email")
	@CacheLookup
	WebElement EmailOrPhone;
	
	@FindBy(name="pass")
	@CacheLookup
	WebElement Password;
	
	@FindBy(id="u_0_b")
	@CacheLookup
	WebElement Submit;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div[2]/div/div/a/div")
	@CacheLookup
	WebElement Logout;

	@FindBy(xpath="//div/div/ul/li[17]/a/span/span")
	@CacheLookup
	WebElement Logout1;
	
	
	
	//METHODS 
	public void setusername(String uname)
	{
EmailOrPhone.sendKeys(uname);	
	
}

public void setpass(String pass)
{
Password.sendKeys(pass);	

}

public void setsubmit()
{
     Submit.click();	

  }
	
	public void Logout()
	{
		Logout.click();
	     
	}
	
	public void Logout1()
    {
		Logout1.click();
	     
	     
	}



}