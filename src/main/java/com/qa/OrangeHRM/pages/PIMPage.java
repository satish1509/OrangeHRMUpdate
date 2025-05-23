package com.qa.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.propertyIns.utils.TestUtility;

public class PIMPage {

    WebDriver driver;

    public PIMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Login Elements
    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "(//*[text()='Admin Two'])[1]")
    private WebElement userInfo;

    // Navigation Tabs
    @FindBy(xpath = "(//ul/li)[2]")
    private WebElement pimTab;

    @FindBy(xpath = "//a[text()='Add Employee']")
    private WebElement addEmployeeTab;

    // Add Employee Form
    @FindBy(name = "firstName")
    private WebElement firstNameField;

    @FindBy(name = "middleName")
    private WebElement middleNameField;

    @FindBy(name = "lastName")
    private WebElement lastNameField;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement employeeIdField;

    @FindBy(xpath = "(//img[@alt='profile picture'])[2]")
    private WebElement photographUploadInput;

    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
    private WebElement createLoginSwitch;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement usernameField;

    @FindBy(xpath = "(//*[text()='Disabled']/following::input[@type='password'])[1]")
    private WebElement passwordField;

    @FindBy(xpath = "(//*[text()='Disabled']/following::input[@type='password'])[2]")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']")
    private WebElement savedEmployeeNameToast;

    // ========== Action Methods ==========

    public void openURL(String url) {
        TestUtility.openPage(driver, url);
    }

    public void enterLoginCredentials(String user, String pass) {
        TestUtility.enterText(username, user);
        TestUtility.enterText(password, pass);
    }

    public void clickLogin() {
        TestUtility.clickElement(loginButton);
    }

    public boolean verifyLoginSuccess(String expectedUserName) {
        return TestUtility.getText(userInfo).equalsIgnoreCase(expectedUserName);
    }

    public void navigateToAddEmployee() {
        TestUtility.clickElement(pimTab);
        TestUtility.clickElement(addEmployeeTab);
    }

    public void fillEmployeeDetails(String firstName, String lastName) {
        TestUtility.enterText(firstNameField, firstName);
        TestUtility.enterText(lastNameField, lastName);
    }

    public void uploadPhoto(String pathToImage) {
        photographUploadInput.sendKeys(pathToImage);
    }

    public void enableLoginCreation() {
        TestUtility.clickElement(createLoginSwitch);
    }

    public void enterLoginDetails(String loginUsername, String loginPassword, String confirmPassword) {
        TestUtility.enterText(usernameField, loginUsername);
        TestUtility.enterText(passwordField, loginPassword);
        TestUtility.enterText(confirmPasswordField, confirmPassword);
    }

    public void clickSave() {
        TestUtility.clickElement(saveButton);
    }

    public boolean isEmployeeSaved() {
        return savedEmployeeNameToast.isDisplayed();
    }

    public String getSavedEmployeeId() {
        return TestUtility.getText(employeeIdField);
    }
}
