package org.testleaf.leaftaps.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5day1.UtilsCopy;

public class ProjectSpecificMethod
{
	public ChromeDriver driver;
	public String NewFileName;
	 @Parameters ({"url","username","password"})
	@BeforeMethod
	public void login(String url1,String uname,String pass) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url1);
	driver.manage().window().maximize();
    driver.findElementById("username").sendKeys(uname);
    driver.findElementById("password").sendKeys(pass);
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
		UtilsCopy newExcel= new UtilsCopy();
		return newExcel.readExcel(NewFileName);		
	}
}
