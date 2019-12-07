package week4day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Erail {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
   driver.get("https://erail.in");
	//driver.get("https://www.justdial.com/Bangalore/Bakeries");
   driver.manage().window().maximize();
   	Thread.sleep(3000);
   //	WebElement findElementByXPath = driver.findElementByXPath("//*[@id=\"divTrainsListHeader\"]/table/tbody/tr/td[2]/a");
   	driver.findElementById("buttonFromTo").click();
   	Thread.sleep(5000);
   	WebElement col = driver.findElementById("divTrainsListHeader");
   	
   	List<WebElement> allRows = col.findElements(By.xpath("//*[@id=\"divTrainsListHeader\"]/table/tbody/tr/td[2]"));
   	
   	for (WebElement row : allRows) 
   		{ 
   		    List<WebElement> cells = row.findElements(By.tagName("td")); 
   		    for (WebElement cell : cells) { 
   		        System.out.println(cell.getText());
   		    }
   		}
	}
}


