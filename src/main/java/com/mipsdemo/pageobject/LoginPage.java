package com.mipsdemo.pageobject;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mipsdemo.base.TestBase;

public class LoginPage extends TestBase{	
	
	
	@FindBy(id="username")
	private WebElement username1;
	
	@FindBy(id="password")
	private WebElement password1;
	
	@FindBy(id="Login")
	private WebElement loginbutton;
	
	
	/*
	@FindBy(id="logo")
	@CacheLookup
	private WebElement saleforceLogo;
	*/
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)	{
		PageFactory.initElements(driver, this);		
		}	
	
		

	public void enterUserName(String username) {		
		username1.sendKeys(username);		
	}
	
	public void enterPassword(String password) {		
		password1.sendKeys(password);
		}
	
	public void clickOnLogin() {		
		loginbutton.click();
	}
	
	public void setLoginCredentials(String username, String password) throws Exception {
		try 
		{
		//	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
			username1.click();
			username1.sendKeys(username);
		//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			password1.click();
			password1.sendKeys(password);

		} catch (Exception e)
		{e.printStackTrace();}
	}
	
	public void clicklogin()
	{
		loginbutton.click();
	}
	
	public void geturl()
	{
		System.out.println("I am here1");
		Properties prop = new Properties();
		System.out.println("I am here");
		prop.getProperty("url");
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean validatesaleforceImage() {
		
		return saleforceLogo.isDisplayed();
		
	}	
	
	
	public HomePage login(String user_name, String user_password ) {
		username.sendKeys(user_name);
		password.sendKeys(user_password);
		loginbutton.click();
		
		return new HomePage();
	}
*/

	
