package week5day1;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.leaftaps.base.ProjectSpecificMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	@BeforeTest
	public void setData()
	{
		 NewFileName = "TestData";
	}
	@Test(dataProvider = "senddata")
	
	public void CreateLeadone(String CName, String Fname, String Lname) throws InterruptedException 
	{
		driver.findElementByLinkText("Leads").click();
			Thread.sleep(3000);
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(3000);
		driver.findElementById("createLeadForm_companyName").sendKeys(CName);
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
		Thread.sleep(3000);
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(3000);
		System.out.println("Create lead is successful");
		
		

	}
	
		/*String[][] data = new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="Manikandan";
		data[0][2]="Rudrappa";
		
		data[1][0]="TTTT";
		data[1][1]="MMM";
		data[1][2]="RRR";
	
		return data;*/
	}



