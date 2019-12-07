package week1.dayy1;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://cleartrip.com");
	 //  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.findElementById("RoundTrip").click();
	    driver.findElementById("FromTag").sendKeys("Chennai",Keys.TAB);
	    driver.findElementById("ToTag").sendKeys("Newyork",Keys.TAB);
	    driver.findElementById("DepartDate").click();
	    driver.findElementByLinkText("26").click();
	    driver.findElementById("ReturnDate").click();
	    driver.findElementByLinkText("10").click();
	    WebElement dropdown = driver.findElementById("Adults");
	    Select sel = new Select(dropdown);
	    sel.selectByVisibleText("2");
	    WebElement dropdown1 = driver.findElementById("Childrens");
	    Select sel1 =new Select(dropdown1);
	    sel1.selectByVisibleText("1");
	    WebElement dropdown2 =driver.findElementById("Infants");
	    Select sel2 = new Select(dropdown2);
	    sel2.selectByVisibleText("1");
	    driver.findElementById("MoreOptionsLink").click();
	    WebElement dropdown3 =driver.findElementById("Class");
	    Select sel3 = new Select(dropdown3);
	    sel3.selectByVisibleText("Premium Economy");
	    driver.findElementById("AirlineAutocomplete").sendKeys("Emirtaes",Keys.TAB);
	    driver.findElementById("SearchBtn").click();
	  String Error=  driver.findElementById("homeErrorMessage").getText();
	  System.out.println(Error);
	}

}
