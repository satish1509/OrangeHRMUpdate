package com.qa.propertyIns.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.utils.EleInt;

public class Homepage {
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

}
