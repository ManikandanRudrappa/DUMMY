package org.testleaf.leaftaps.base;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import base.Utils1;
import week5day1.UtilsCopy;

public class ProjectSpecificMethod1
{
	public ChromeDriver driver;
	public String NewFileName;
	@BeforeMethod
    public void login()
    {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.findElementById("username").sendKeys("DemoSalesManager");
	    driver.findElementById("password").sendKeys("crmsfa");
	    driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
    }
	@AfterMethod
	public void logout()
	{
		driver.close();
	}
	@DataProvider
	public String[][] senddata() throws IOException
	{
		Utils1 excel=new Utils1();
		
		return excel.readExcel(NewFileName);
	}
	
	
	

}

