package week1.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Optionsindrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		//Thread.sleep(4000);

		
		WebElement dropdown =driver.findElementById("dropdown1");
		Select sel3 = new Select(dropdown);
		List<WebElement> options =sel3.getOptions();
		int size=options.size();
		System.out.println("No of options available:  "+size);
		
			

		for(int l = 0; l <size; l++)
		{
		    System.out.println(options.get(l).getText());
		}
	}

}
