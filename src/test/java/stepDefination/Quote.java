package stepDefination;

import org.testng.Assert;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.QuotePage;

import io.cucumber.java.en.*;

public class Quote {
	QuotePage qp;

	public Quote() {
		qp = new QuotePage(DriverFactory.getDriver());
	}
	

	

}