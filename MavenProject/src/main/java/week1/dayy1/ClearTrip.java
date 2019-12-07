package week1.dayy1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		driver.findElementById("FromTag").sendKeys("MAA",Keys.TAB);
		driver.findElementById("ToTag").sendKeys("NYC",Keys.TAB);
		WebElement dropdown=driver.findElementByName("adults");
		Select sel =new Select(dropdown);
		sel.selectByVisibleText("2");
		WebElement dropdown2=driver.findElementByName("childs");
		Select sel1 =new Select(dropdown2);
		sel1.selectByVisibleText("1");
		driver.findElementById("SearchBtn").click();
		String text = driver.findElementById("homeErrorMessage").getText();
		
		
		
		System.out.println(text);
	}

}
