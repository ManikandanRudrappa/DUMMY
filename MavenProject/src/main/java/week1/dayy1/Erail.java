package week1.dayy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("NMKL",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(4000);
		WebElement train=driver.findElementByXPath("//table[contains(@class,'DataTable TrainList')]");
		List<WebElement> allRows= train.findElements(By.tagName("tr"));
		System.out.println(allRows.size());
		//int size=allRows.size();
		//System.out.println(size);

	}

}
