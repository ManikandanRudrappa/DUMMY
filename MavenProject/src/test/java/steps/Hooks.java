package steps;

import cucumber.api.Scenario;

public class Hooks 
{
	public void AppLogin(Scenario sc)
	{
		System.out.println("TC Name"+ sc.getName());
		System.out.println("Line no" + sc.getId());
		System.out.println("Status:" + sc.getStatus());
	}
	public void AfterCreateLead(Scenario sc)
	{
		
		System.out.println("Status:" + sc.getStatus());
	}
	
	
	

}
