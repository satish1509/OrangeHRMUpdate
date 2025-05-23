package com.qa.propertyIns.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyPage {
	
	public PropertyPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	

}
