package week1.dayy1;

import java.util.List;

import org.openqa.selenium.WebElement;

//import org.openqa.selenium.Dimension;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElementByLinkText("Go to Home Page").click();
		Thread.sleep(4000);
		driver.findElementByLinkText("HyperLink").click();
		Thread.sleep(4000);
		driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
		Thread.sleep(4000);
		driver.get("http://leafground.com/pages/Link.html");
		Thread.sleep(4000);
	    driver.findElementByLinkText("Verify am I broken?").click();
		Thread.sleep(4000);
		driver.get("http://leafground.com/pages/Link.html");
		Thread.sleep(4000);
		driver.findElementByLinkText("Go to Home Page").click();
		Thread.sleep(4000);
		driver.findElementByLinkText("HyperLink").click();
		Thread.sleep(4000);
		///List<WebElement> len= driver.
	
		
		
	}

}
