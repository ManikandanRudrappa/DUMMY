package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlepopup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_winopen");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//WebElement frame = driver.findElementByXPath("//button[text()='Try it'])");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Mani");
		driver.switchTo().alert().accept();
		//String text = driver.findElementByXPath("//p[text()='Hello Mani! How are you today?']").getText();
		String text = driver.findElementByXPath("//p[@id='demo']").getText();
		if(text.contains("Mani"))
		{
			System.out.println("Name verified");
		}
		
		else
		{
			System.out.println("Name doesn't match");
		}
		
		
		

	}

}
