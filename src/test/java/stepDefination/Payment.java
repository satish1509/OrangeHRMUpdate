package stepDefination;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.PaymentDetailsPage;

import io.cucumber.java.en.*;

public class Payment {
	PaymentDetailsPage pp;
	
	public Payment() {
		pp=new PaymentDetailsPage (DriverFactory.getDriver());
	}



}
