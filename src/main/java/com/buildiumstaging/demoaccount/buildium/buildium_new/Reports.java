package com.buildiumstaging.demoaccount.buildium.buildium_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports 
{
	WebDriver driver;
	Reports(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//span[text()='Current tenants']")
	WebElement currentTenants;
	
	@FindBy(xpath="//span[text()='Export']")
	WebElement export;
	
	@FindBy(xpath="//*[text()='PDF - Portrait (.pdf)']")
	WebElement pdfPortrait;
	
	public WebElement getPdfPortrait()
	{
		return pdfPortrait;
	}
	
	public WebElement getExport()
	{
		return export;
	}
	
	public WebElement getCurrentTenants()
	{
		return currentTenants;
	}
}
