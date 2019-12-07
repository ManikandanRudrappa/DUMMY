package learnAUI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	   // Thread.sleep(4000);
	 // driver.getKeyboard().sendKeys(Keys.ESCAPE);
	  driver.findElementByXPath("//button[text()='✕']").click();
	    
	   WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
	  Actions builder = new Actions(driver);
	   builder.moveToElement(electronics).perform();
	   Thread.sleep(4000);
	   driver.findElementByLinkText("Mi").click();
	
	}

}
