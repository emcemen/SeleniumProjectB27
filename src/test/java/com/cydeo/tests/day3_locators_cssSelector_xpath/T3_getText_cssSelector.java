package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;


public class T3_getText_cssSelector {


    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        //Locate with using cssSelector [[[by type]]] attribute:
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[type='submit'])");

        //Locate with using cssSelector [[[by value]]] attribute
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));

        //Locate with using cssSelector [[[by class]]] attribute syntax #2
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[class='Log In']"));

        //Locate with using cssSelector [[[on click]]] attribute
        // Locate with using cssSelector by onclick attribute
        //WebElement logInBtn = driver.findElement(By.cssSelector("input[onclick=\"BX.addClass(this, 'wait');\"]"));



    }

}
