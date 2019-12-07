package week5day1;

import org.testleaf.leaftaps.base.ProjectSpecificMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethod
{
	@BeforeTest
	public void setData()
	{
		 NewFileName = "EditLead";
	}
	@Test(dataProvider = "senddata")
	public void edit (String Phonenumber,String CompanyName) throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(Phonenumber);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(CompanyName);
		driver.findElementByName("submitButton").click();
		System.out.println("Edit Lead is successful");
		
		
}
}

