package com.buildiumstaging.demoaccount.buildium.buildium_new;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class ValidateLogin extends Base
{

	public void validateLogin(WebDriver driver1) throws IOException
	{
		driver1 = initializeDriver();
		driver1.get(p.getProperty("url"));
		/*driver1.get(pp.getProperty("url"));*/
		SigninPage signin = new SigninPage(driver1); 
		signin.getEmail().sendKeys(p.getProperty("username"));
		signin.getPassword().sendKeys(p.getProperty("password"));
		signin.getSigninBtn().click();
	}
	
	public void validateLogin() throws IOException
	/*public static void main(String[] args) throws IOException*/	
	{
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
		/*driver1.get(pp.getProperty("url"));*/
		SigninPage signin = new SigninPage(driver); 
		signin.getEmail().sendKeys(p.getProperty("username"));
		signin.getPassword().sendKeys(p.getProperty("password"));
		signin.getSigninBtn().click();
		/*driver.get(p.getProperty("mailingUrl"));*/
	}
	
	public WebDriver validateLogin2() throws IOException
	/*public static void main(String[] args) throws IOException*/	
	{
		driver = initializeDriver();
		driver.get(p.getProperty("url"));
		/*driver1.get(pp.getProperty("url"));*/
		SigninPage signin = new SigninPage(driver); 
		signin.getEmail().sendKeys(p.getProperty("username"));
		signin.getPassword().sendKeys(p.getProperty("password"));
		signin.getSigninBtn().click();
		/*driver.get(p.getProperty("mailingUrl"));*/
		return driver;
	}

	@Test
	public WebDriver validateLogin1() throws IOException
	/*public static void main(String[] args) throws IOException*/	
	{
		driver = initializeDriver();
		/*driver1.get(pp.getProperty("url"));*/
		SigninPage signin = new SigninPage(driver); 
		signin.getEmail().sendKeys(p.getProperty("username"));
		signin.getPassword().sendKeys(p.getProperty("password"));
		signin.getSigninBtn().click();
		driver.get("https://demoaccount2.buildiumstaging.com/Manager/app/communication/mailing-email-templates");
		return driver;
	}



	@AfterSuite
	public void cleanup()
	{
		/*driver.quit();*/
	}
}
