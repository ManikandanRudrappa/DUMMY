package week1.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://redbus.in");
	    driver.manage().window().maximize();
	   
		WebElement source=driver.findElementById("src");
		source.sendKeys("Chennai");
		Thread.sleep(4000);
		//source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		
		
		WebElement dest=driver.findElementById("dest");
		dest.sendKeys("Trichy");
		Thread.sleep(4000);
		//source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		driver.findElementByXPath("*//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[2]").click();
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//span[@class='f-bold busFound']")).click();
		driver.findElementByXPath("*//*[@class='db text-trans-uc tal']").click();
		Thread.sleep(4000);
		driver.findElementByXPath("*//*[@id='rb-calendar_return_cal']/table/tbody/tr[7]/td[4]").click();
		Thread.sleep(4000);
		
		driver.findElementById("search_btn").click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@class='fl button']")).click();
		
		
		//driver.findElementByClassName("custom-checkbox[4]").click();
		
		driver.findElement(By.xpath("(//label[@class='custom-checkbox'])[4]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//label[@for='bt_AC'])[1]")).click();
		Thread.sleep(4000);
		
		String buses = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No of buses available:"+ buses);
		
	}

}
