package week1.dayy1;

//import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.util.List;


public class DropDown 
{

	public static void main(String[] args) throws InterruptedException
   {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		//Thread.sleep(4000);

		
		WebElement dropdown =driver.findElementById("dropdown1");
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);
		//Thread.sleep(4000);
		
		WebElement dropdown1 =driver.findElementByName("dropdown2");
		Select sel1 = new Select(dropdown1);
		sel1.selectByVisibleText("Selenium");
		//Thread.sleep(4000);
		
		WebElement dropdown2 =driver.findElementById("dropdown3");
		Select sel2 = new Select(dropdown2);
		sel2.selectByValue("1");
		Thread.sleep(4000);
		
		WebElement dropdown3 =driver.findElementByClassName("dropdown");
				
		Select sel3 = new Select(dropdown3);
		List<WebElement> options =sel3.getOptions();
		int size=options.size();
		System.out.println("No of options available:  "+size);
		Thread.sleep(4000);
				
		driver.findElementByXPath("(//div[@class='example'])[5]").sendKeys("Selenium");
	
	}

}
