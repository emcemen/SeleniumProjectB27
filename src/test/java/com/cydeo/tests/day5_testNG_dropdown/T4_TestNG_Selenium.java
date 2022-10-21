package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_TestNG_Selenium {
   WebDriver driver;

        @BeforeMethod
        public void setUpMethod() {
        // with this we dont need main method now
        //Step 1 - Set uo Browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

        @Test
        public void googleTitle(){
            //Step 2 - Navigate to the Google Page

            driver.get("https://www.google.com");

        //Step 3- Verify if the title is "Google"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Googles";

        Assert.assertEquals(actualTitle,expectedTitle,"Title is not Matching");

         }

         @AfterMethod
         public void tearDownMethod(){
         driver.quit();
         }

}
