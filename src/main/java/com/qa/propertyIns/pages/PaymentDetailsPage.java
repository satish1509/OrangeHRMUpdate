package com.qa.propertyIns.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.utils.EleInt;
import com.qa.propertyIns.utils.ExpWait;

public class PaymentDetailsPage {
	EleInt elem;
	WebDriver driver;
      public  PaymentDetailsPage(WebDriver driver) {
	  
    	  PageFactory.initElements(driver, this);
    	  this.driver=driver;
      }

      
}
