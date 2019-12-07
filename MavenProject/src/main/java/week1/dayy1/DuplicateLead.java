package week1.dayy1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead
{

	public static void main(String[] args)
	{
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeDriver driver =new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    driver.findElementById("username").sendKeys("demosalesmanager",Keys.TAB);
	    driver.findElementById("password").sendKeys("crmsfa",Keys.TAB);
	    driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	   driver.findElementByLinkText("Leads").click();	   
	   // driver.findElementByXPath("//*html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[3]/a").click();
	    driver.findElementByLinkText("Find Leads").click();
	    driver.findElementByXPath("//*[@id=\"ext-gen900\"]").click();
	}

}
//*[@id="ext-gen907"]//*[@id="ext-gen857"]

//*html/body/div[6]/div/div[1]/div[1]/div[2]/ul/li[3]/a
//#ext-gen857