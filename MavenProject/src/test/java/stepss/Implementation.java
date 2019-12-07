package stepss;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation 
{
	public ChromeDriver driver;
	
	@Given("Open the browser")
	public void OpenTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	    
	}
	
	@Given("Maximixe the browser")
	public void MaximixeTheBrowser()
	{
		driver.manage().window().maximize();
	}
	
	@Given("Load the url")
	public void LoadTheUrl()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@Given("Set timeouts")
	public void SetTimeouts() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	@Given("Enter the UserName as (.*)")
	public void enterTheUserName(String Username)
	{
		driver.findElementById("username").sendKeys(Username);
	}
	
	@Given("Enter the PassWord as (.*)")
	public void enterThePassword(String PassWord)
	{
		driver.findElementById("password").sendKeys(PassWord);
	}
	
	@When("Click on Login Button")
	public void clickOnLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("Verify Login is a Success")
	public void loginVerify()
	{
		System.out.println("Login is Successful");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
