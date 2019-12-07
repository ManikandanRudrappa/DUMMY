package learnAUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
	    driver.manage().window().maximize();
	    WebElement src = driver.findElementById("draggable");
	    WebElement dest = driver.findElementById("droppable");
	    Actions builder =new Actions(driver);
	    builder.dragAndDrop(src, dest).perform();
	}

}
