package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead
{
	 public static void main(String[] args) throws InterruptedException

     {

       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

       ChromeDriver  driver=new ChromeDriver();

       driver.get("http://leaftaps.com/opentaps/control/main");

       driver.manage().window().maximize();

       driver.findElementById("username").sendKeys("demosalesmanager");

       driver.findElementById("password").sendKeys("crmsfa");

       driver.findElementByClassName("decorativeSubmit").click();

       driver.findElementByLinkText("CRM/SFA").click();

       driver.findElementByLinkText("Leads").click();

       driver.findElementByLinkText("Find Leads").click();

       driver.findElementByXPath("//span[text()='Email']").click();

       driver.findElementByXPath("//input[@id='ext-gen282']").sendKeys("bhuvani2013@gmail.com");

       Thread.sleep(3000);

       driver.findElementByXPath("//button[text()='Find Leads']").click();
       
       Thread.sleep(3000);

      String text = driver.findElementByLinkText("Bhuvaneshwari").getText();

       System.out.println("captured Lead name" + text);

       Thread.sleep(3000);

       driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

       Thread.sleep(3000);

       driver.findElementByLinkText("Duplicate Lead").click();

       Thread.sleep(3000);

      // String text2 = driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();

      // System.out.println(text2);

      // Thread.sleep(3000);
       System.out.println(driver.getTitle());

       driver.findElementByXPath("//input[@class='smallSubmit']").click();

       Thread.sleep(3000);
       String name = driver.findElementById("viewLead_firstName_sp").getText();
       System.out.println("Duplicate Lead name:" + name);
       
       boolean equals = text.equals(name);
       System.out.println(equals);

       driver.close();

      

     

       

       

}

}
