package projectday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementByLinkText("Start your wonderful journey").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.findElementByXPath("(//div[@class='day'])[2]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(3000);
		List<WebElement> carCount = driver.findElementsByXPath("//h3");
		
	    System.out.println("No of cars available : " + carCount.size());
	   
	    //Thread.sleep(3000);
	    
	    Map<String,Integer> map=new HashMap<String,Integer>();
	    List<Integer> amount=new ArrayList<Integer>();
	    int max=carCount.size();
	    int maxAmount = 0;
	    
	       	
	  for(int i=1;i<=carCount.size();i++)
	    {
		  //System.out.println("Hello");
	    	String brandname = driver.findElementByXPath("(//h3)["+i+"]").getText();
	    	String price = driver.findElementByXPath("(//div[@class='price'])["+i+"]").getText();
	    	String duplicate = price.replaceAll("\\D", "");
	    	Integer Price1=Integer.parseInt(duplicate);
	    	map.put(brandname, Price1);
	    	amount.add(Price1);
	    	 
	    }
	   // System.out.println(map);
	    Collections.sort(amount);
	  // System.out.println(amount);
	   for(Integer each:amount)
		{
			//dupnames.add(each);
		   maxAmount=each;
		}
	   
	  // System.out.println("Max count"+ max + "  Max Amount= " + maxAmount );
	   
	   for (Map.Entry<String, Integer> each: map.entrySet()) 
       { 
           
            int amountcheck=each.getValue(); 
            if(amountcheck==maxAmount)
            {
            	System.out.println("Maximum Amount car brand name:"+each.getKey()+  "     Maximum Amount:"+each.getValue() + " ");
            }
             
       }
	}

}
