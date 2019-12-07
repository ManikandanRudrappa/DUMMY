package week1.dayy1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.SendKeysAction;

public class RedBus1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://redbus.in");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("src")).click();
	    driver.findElement(By.id("src")).sendKeys("Chennai");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li[1]")).click();

	}

}
