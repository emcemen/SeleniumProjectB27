package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3 {
    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get("https://library1.cydeo.com/ ");

        libraryLoginPage = new LibraryLoginPage();
        @Test
        public void library_positive_login_test () {
            //1- Open a chrome browser
            //2- Go to: https://library1.cydeo.com
            // Driver.getDriver().get("https://library1.cydeo.com");
            //3- Enter incorrect username or incorrect password
            //LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
            libraryLoginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("library.app.username"));
            libraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("library.app.password"));
            libraryLoginPage.signInButton.click();


        }

        @AfterMethod
        public void tearDown () {
            Driver.closeDriver();
        }

    }}

