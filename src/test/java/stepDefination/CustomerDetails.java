package stepDefination;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.CustomerDetailsPage;

public class CustomerDetails {
	CustomerDetailsPage n1; 
	

	public CustomerDetails() // parameterized constructor create
	{
		
		n1=new CustomerDetailsPage(DriverFactory.getDriver());
	}


	
}
