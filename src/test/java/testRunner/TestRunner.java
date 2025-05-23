package testRunner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// You can run your test cases from here 
//@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"./src/test/resources/Features/Login.feature"},
    glue = {"applicationHooks", "stepDefination"},
    plugin = {
        
        "html:./Reports/myReports.html",
        
    }
)
public class TestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios() {
		return super.scenarios();
	}


	
}
