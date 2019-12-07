package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementaions {
	public ChromeDriver driver;
	@Given("open the chrome browser")
	public void openTheChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	    
	}

	@Given("maximize the browser")
	public void maximizeTheBrowser()
	{
		driver.manage().window().maximize();
	    
	}

	@Given("load the url")
	public void loadTheUrl() 
	{
	    
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Set the timeout")
	public void setTheTimeout() throws InterruptedException 
	{
	    Thread.sleep(3000);
	    
	}

	@Given("Enter the username")
	public void enterTheUsername() 
	{
		driver.findElementById("username").sendKeys("demosalesmanager");
	     
	    
	}

	@Given("Enter the password")
	public void enterThePassword()
	{
		
		 driver.findElementById("password").sendKeys("crmsfa");
	    
	}

	@When("click on login")
	public void clickOnLogin() 
	{
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@Then("verfiy the login")
	public void verfiyTheLogin()
	{
	    System.out.println("Login is successful");
	    
	}
	@Given("Click on crmsfa")
	
	public void clickcrmsfa() 
	{
	    
		
		driver.findElementByLinkText("CRM/SFA").click();
	}
	

	@Given("click Lead")
	public void clickLead() 
	{
	    
		driver.findElementByLinkText("Leads").click();
	}
	@Given("Set the timeout1")
	public void setTheTimeout1() throws InterruptedException 
	{
	    Thread.sleep(3000);
	    
	}
	@Given("click create lead")
	public void clickCreateLead() 
	{
	    
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("enter company name as (.*)")
	public void enterCompanyName(String CompanyName) 
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(CompanyName);
	    
	}

	@Given("Enter first name as (.*)")
	public void enterFirstName(String firstname) 
	{
	    
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
		
	}

	@Given("Enter Last name as (.*)")
	public void enterLastName(String lastname) 
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
	    
	}

	@When("clcik create lead")
	public void clcikCreateLead() 
	{
		driver.findElementByClassName("smallSubmit").click();  
	    
	}

	@Then("verify whether the lead is created")
	public void verifyWhetherTheLeadIsCreated()
	{
	    
	    System.out.println("Create Lead is successful");
	}


}
