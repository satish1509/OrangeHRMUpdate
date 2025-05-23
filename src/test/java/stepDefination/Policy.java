package stepDefination;

import org.testng.Assert;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.Policypage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Policy {

	Policypage p1;

	public Policy() {
		p1 = new Policypage(DriverFactory.getDriver());
	}


}
