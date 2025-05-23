package com.qa.propertyIns.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.utils.Dd;
import com.qa.propertyIns.utils.EleInt;
import com.qa.propertyIns.utils.ExpWait;
import com.qa.propertyIns.utils.JSEUtility;

public class QuotePage {
	
	public QuotePage(WebDriver driver) // parameterized constructor create
	{
		PageFactory.initElements(driver, this); // initialize the webelement
	}

	
}
