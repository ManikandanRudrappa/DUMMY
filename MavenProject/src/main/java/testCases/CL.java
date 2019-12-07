package testCases;

import java.util.concurrent.TimeUnit;

import org.testleaf.leaftaps.base.ProjectSpecificMethod1;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CL extends ProjectSpecificMethod1
{
	@BeforeTest
	public void setdata()
	{
		NewFileName="TestData";
	}
	@Test(dataProvider="senddata")
	public void runCL(String companyName,String firstname ,String lastname)
	{
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(firstname);
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
	}
	
}


