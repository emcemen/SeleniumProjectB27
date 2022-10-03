package com.cydeo.tests.day2_locaters_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H2_Day2 {
    public static void main(String[] args) {


    //TC #2: Zero Bank header verification
//         1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();



//         2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

//         3. Verify header text Expected: “Log in to ZeroBank”
        WebElement header = driver.findElement(By.className("page-header"));
        String actual = header.getText();
        String expected = "Log in to ZeroBank";

        if(actual.equals(expected)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        driver.quit();

}}
