package week1.dayy1;

import java.awt.Dimension;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPage
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElementById("home").click();
		driver.findElementByLinkText("Button").click();
		Point loc =driver.findElementById("position").getLocation();
		System.out.println(loc);
		org.openqa.selenium.Dimension si1= driver.findElementById("size").getSize();
		System.out.println(si1);
	}
}