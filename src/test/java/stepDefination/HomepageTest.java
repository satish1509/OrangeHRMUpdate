

package stepDefination;


import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.Homepage;

public class HomepageTest {
	
	Homepage h1;
	
	public HomepageTest() {
		h1 = new Homepage(DriverFactory.getDriver());
	}

	
}
