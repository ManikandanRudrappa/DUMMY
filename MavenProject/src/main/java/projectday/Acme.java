package projectday;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		Thread.sleep(3000);
		Actions builder=new Actions(driver);
		WebElement Vendors = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
	    builder.moveToElement(Vendors).perform();
		Thread.sleep(3000);
	    driver.findElementByLinkText("Search for Vendor").click();
	    driver.findElementById("vendorName").sendKeys("Blue Lagoon");
	    driver.findElementById("buttonSearch").click();
		Thread.sleep(3000);
		String Result = driver.findElementByXPath("(//td)[5]").getText();
	//	Thread.sleep(3000);

		System.out.println("The country name of Blue Lagoon : " +Result);
		
				


	}

}
