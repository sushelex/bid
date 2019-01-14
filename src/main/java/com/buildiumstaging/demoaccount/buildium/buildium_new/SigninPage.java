package com.buildiumstaging.demoaccount.buildium.buildium_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage 
{
	WebDriver driver;
	SigninPage()
	{
		
	}
	SigninPage(WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(css = "#txtUserName")
	WebElement email;
	
	@FindBy(css = "#txtPassword")
	WebElement password;
	
	@FindBy(css = "#btnLogIn")
	WebElement signInBtn;
	
	public WebElement getEmail()
	{
		return email;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getSigninBtn()
	{
		return signInBtn;
	}
}
