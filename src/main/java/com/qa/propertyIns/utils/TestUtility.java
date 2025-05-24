package com.qa.propertyIns.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class TestUtility {

    private static Faker faker = new Faker();  // single shared Faker instance

    // Existing utility methods (openPage, clickElement, etc.)
    public static void openPage(WebDriver driver, String url) {
        driver.get(url);
    }

    public static WebElement findElement(WebDriver driver, By selector) {
        return driver.findElement(selector);
    }

    public static void clickElement(WebElement element) {
        element.click();
    }

    public static void enterText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public static void enterTextWithBy(WebDriver driver, By ele, String text) {
        driver.findElement(ele).sendKeys(text);
    }

    public static String getText(WebElement element) {
        return element.getText();
    }

    public static String getPageSource(WebDriver driver) {
        return driver.getPageSource();
    }

    public static void fileupload(String filepath) throws Exception {
        Robot rb = new Robot();

        StringSelection str = new StringSelection(filepath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }

    // --- New Faker-based methods ---

    // Enter random first name into given WebElement
    public static void enterRandomFirstname(WebElement element) {
        String firstName = faker.name().firstName();
        element.sendKeys(firstName);
        System.out.println("Entered Random First Name: " + firstName);
    }

    // Enter random last name into given WebElement
    public static void enterRandomLastname(WebElement element) {
        String lastName = faker.name().lastName();
        element.sendKeys(lastName);
        System.out.println("Entered Random Last Name: " + lastName);
    }

    // You can add more faker helpers here, e.g. email, phone, etc.
}
