package week5day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.leaftaps.base.ProjectSpecificMethod;
import org.testng.annotations.Test;

public class DuplicateLeadTN extends ProjectSpecificMethod
{
	@Test 
	public void DuplicateLead() throws InterruptedException 

    {

         
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

     /* driver.findElementByLinkText("Duplicate Lead").click();

      Thread.sleep(3000);

       System.out.println(driver.getTitle());

      driver.findElementByXPath("//input[@class='smallSubmit']").click();

      Thread.sleep(3000);
      String name = driver.findElementById("viewLead_firstName_sp").getText();
      System.out.println("Duplicate Lead name:" + name);
      
      boolean equals = text.equals(name);
      System.out.println(equals);

      driver.close();*/

}

}
