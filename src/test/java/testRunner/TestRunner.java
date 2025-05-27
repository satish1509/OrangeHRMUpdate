package testRunner;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

import com.qa.propertyIns.utils.AllureReportUtil;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// You can run your test cases from here 
//@RunWith(Cucumber.class)
@CucumberOptions(
	    features = {"./src/test/resources/Features"},
	    glue = {"applicationHooks", "stepDefination"},
	    tags = "@employee or @searchpim or @admin or @searchuser",
	    plugin = {
	        "html:./Reports/myReports.html"
	    }
	)


public class TestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	 @AfterSuite
	    public void generateAllureReport() {
	        AllureReportUtil.openAllureReport();
	    }
	
}
