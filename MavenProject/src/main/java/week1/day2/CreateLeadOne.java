package week1.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager",Keys.TAB);
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mani");
		driver.findElementById("createLeadForm_lastName").sendKeys("R");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Jeen");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("J");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("MR");
		driver.findElementById("createLeadForm_sicCode").sendKeys("8765");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("15000");
		driver.findElementByName("generalProfTitle").sendKeys("Manager");
		WebElement dropdown1=driver.findElementById("createLeadForm_dataSourceId");
		Select sel1 =new Select(dropdown1);
		sel1.selectByIndex(2);
		
		WebElement dropdown2=driver.findElementById("createLeadForm_industryEnumId");
		Select sel2 =new Select(dropdown2);
		sel2.selectByIndex(2);
		
		WebElement dropdown3=driver.findElementById("createLeadForm_ownershipEnumId");
		Select sel3 =new Select(dropdown3);
		sel3.selectByIndex(2);
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		driver.findElementById("createLeadForm_description").sendKeys("Abcdxyz");
		driver.findElementById("createLeadForm_importantNote").sendKeys("dfgtevhhh hjjk");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$#@");
		
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Manju");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("https://xyz.com");
		
		driver.findElementById("createLeadForm_generalToName").sendKeys("Manikandan");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Pacifica aurum");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Padur");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("603103");		
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("678");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("manjula@gmail.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9876590486");
		WebElement dropdown4=driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select sel4 =new Select(dropdown4);
		sel4.selectByIndex(3);
		
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(4000);
		
		String name= driver.findElementById("viewLead_firstName_sp").getText();
		//Thread.sleep(4000);
		System.out.println("First Name: "+ name);
		
			}

}
