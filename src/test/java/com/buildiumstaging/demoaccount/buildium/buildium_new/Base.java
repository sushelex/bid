package com.buildiumstaging.demoaccount.buildium.buildium_new;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	public static WebDriver driver;
	public static Properties p = new Properties(); 
	
	public WebDriver initializeDriver() throws IOException
	{
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Resource\\Property.properties");
	p.load(fis);
	String browser = p.getProperty("browser");
	if(browser.equalsIgnoreCase("chrome"))
	{
		
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resource\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		/*driver.get(p.getProperty("url"));*/
		
	}
	
	else if(browser.equals("firefox"))
	{
		if(driver==null)
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Resource\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	else if(browser.equals("Internet Explorar"))
	{
		if(driver==null)
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Resource\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
	}
	return driver;
	}
	

}
