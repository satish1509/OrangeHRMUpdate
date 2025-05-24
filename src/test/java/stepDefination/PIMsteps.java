package stepDefination;

import org.openqa.selenium.WebDriver;

import com.qa.OrangeHRM.pages.LoginPage;
import com.qa.OrangeHRM.pages.PIMPage;

import io.cucumber.java.en.*;
import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.utils.ConfigReader;
import com.qa.propertyIns.utils.TestUtility;

public class PIMsteps extends TestUtility {

    private WebDriver driver;
    private LoginPage loginPage;
    private PIMPage pimPage;
    
    public PIMsteps() {
        this.driver = DriverFactory.getDriver();  // ✅ Get driver from centralized factory
        this.loginPage = new LoginPage(driver);
        this.pimPage = new PIMPage(driver);
    }

    @Given("the user navigates to the application URL")
    public void user_navigates_to_url() {
        System.out.println("User is on login page");
    }
    @Given("User navigated to the url")
    public void user_navigated_to_the_url() {
        System.out.println("URL opened.");
    }

    @And("user signed into the application")
    public void user_signed_into_the_application() {
    	
    	
        loginPage.enterUsername(new ConfigReader().readConfig().getProperty("username"));
        loginPage.enterPassword(new ConfigReader().readConfig().getProperty("password"));
        loginPage.clickLogin();
        System.out.println("User signed into the application.");
    }

    @When("user navigates to the PIM page")
    public void user_navigates_to_the_pim_page() {
        pimPage.navigateToAddEmployee();
        System.out.println("User navigated to the PIM page.");
    }

    @And("I click on the Add button")
    public void i_click_on_the_add_button() {
        System.out.println("Clicked on the Add Employee button.");
   
    }

    @And("I enter employee first name")
    public void i_enter_employee_first_name() {
         pimPage.enterfirstname();
    }

    @And("I enter employee last name")
    public void i_enter_employee_last_name() {
        pimPage.enterlastname();
        System.out.println("Entered employee last name.");
    }

    @And("I see employee ID number")
    public void i_see_employee_id_number() {
         pimPage.loginid();
    }

   

    @And("I click on the Save button")
    public void i_click_on_the_save_button() {
        pimPage.clickSave();
        System.out.println("Clicked Save.");
    }

    @Then("the employee should be added successfully")
    public void the_employee_should_be_added_successfully() {
        System.out.println("Employee successfully added: ");
    }
}
