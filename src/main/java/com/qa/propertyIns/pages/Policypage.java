package com.qa.propertyIns.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.propertyIns.utils.EleInt;
import com.qa.propertyIns.utils.JSEUtility;

public class Policypage {
	
	WebDriverWait wait;
	WebDriver driver;
	public Policypage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	     this.driver=driver;
	}
	
	

}







