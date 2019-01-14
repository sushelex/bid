package com.buildiumstaging.demoaccount.buildium.buildium_new;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AbcTest extends Base 
{
	WebDriver driver;
	@Test(enabled=true)
	public void testFun() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resource\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoaccount2.buildiumstaging.com/Manager");
		driver.findElement(By.cssSelector("#txtUserName")).sendKeys("sushilkumar@yahoo.com");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Buildium@7jan");
		driver.findElement(By.cssSelector("#btnLogIn")).click();
		driver.get("https://demoaccount2.buildiumstaging.com/Manager/app/communication/mailingtemplates/new");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='templateName']")).sendKeys("hii");
		driver.findElement(By.cssSelector("#templateDescription")).sendKeys("hello");
		int before = driver.findElements(By.tagName("iframe")).size();
		for(int i=0; i<before;i++)
		{
			System.out.println("frames before::"+i+" "+driver.findElements(By.tagName("iframe")).get(i).getAttribute("id"));
		}
		driver.findElement(By.xpath("//a[@id='cke_36']/span[1]")).click();
		Thread.sleep(5000);
		int after = driver.findElements(By.tagName("iframe")).size();
		for(int i=0; i<after;i++)
		{
			System.out.println("frames after::"+i+" "+driver.findElements(By.tagName("iframe")).get(i).getAttribute("id"));
		}
		System.out.println(before+"  "+after); 
		Select select;
		int []a = {19,20,21};
		for(int i=0; i<1;i++)
		{
			
			select = new Select(driver.findElement(By.cssSelector("#ddlText")));
			select.selectByIndex(a[i]);
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.findElements(By.xpath("//*[contains(text(), 'OK')]")).get(2).click();
		}
		
		
		
		
		/*driver.switchTo().frame("cke_81_iframe");*/
/*		Select select = new Select(driver.findElement(By.cssSelector("#ddlText")));*/
		/*select.selectByIndex(5);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElements(By.xpath("//*[contains(text(), 'OK')]")).get(2).click();*/
		driver.findElement(By.cssSelector("#btnSave")).click();
		System.out.println("Done");
		
	}
	@Test(enabled=false)
	public void downloadTenantReport()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resource\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoaccount2.buildiumstaging.com/Manager");
		driver.findElement(By.cssSelector("#txtUserName")).sendKeys("sushilkumar@yahoo.com");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Buildium@7jan");
		driver.findElement(By.cssSelector("#btnLogIn")).click();
		driver.findElement(By.cssSelector("#iconReports")).click();
		driver.findElement(By.xpath("//span[text()='Current tenants']")).click();
		driver.findElement(By.xpath("//span[text()='Export']")).click();
		driver.findElement(By.xpath("//*[text()='PDF - Portrait (.pdf)']")).click();
		
	}
	
	@Test(enabled=false)
	public void addProperty() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resource\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoaccount2.buildiumstaging.com/Manager");
		driver.findElement(By.cssSelector("#txtUserName")).sendKeys("sushilkumar@yahoo.com");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Buildium@7jan");
		driver.findElement(By.cssSelector("#btnLogIn")).click();
		driver.findElements(By.xpath("//a[@id='bd-popover-']/popover-link/span")).get(0).click();
		driver.findElement(By.cssSelector("#lnk_Properties")).click();
		//Properties screen
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btn-addProperty']")));
		driver.findElement(By.cssSelector("#btn-addProperty")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#propertyType_innerSelectizeInput")));
		driver.findElement(By.cssSelector("#propertyType_innerSelectizeInput")).click();
		driver.findElement(By.cssSelector("#propertyType_innerSelectizeInput")).sendKeys("Storage");
		driver.findElement(By.cssSelector("#propertyType_innerSelectizeInput")).sendKeys(Keys.TAB);;
		driver.findElement(By.id("line1_vm.address")).sendKeys("test address");
		driver.findElement(By.id("line2_vm.address")).sendKeys("add line2");
		driver.findElement(By.xpath("//input[@id='city_vm.address']")).sendKeys("City1");
		driver.findElement(By.xpath("//div[@id='state_vm.address-dropdown']")).sendKeys("AA");
		driver.findElement(By.xpath("//div[@id='state_vm.address-dropdown']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='zip_vm.address']")).sendKeys("50089");
		String bank = "test123#";
		driver.findElement(By.xpath("//input[@id='operatingAccount_innerSelectizeInput']")).sendKeys(bank);
		/*driver.findElement(By.xpath("//input[@id='operatingAccount_innerSelectizeInput']")).sendKeys(Keys.TAB);*/
		driver.findElement(By.xpath("//input[@id='propertyReserve']")).sendKeys("200.5");
		driver.findElement(By.xpath("//button[@id='addProperty']")).click();
		
		
	}
	
}




