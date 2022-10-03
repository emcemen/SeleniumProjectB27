package com.cydeo.tests.day2_locaters_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H3_Day2 {
    //TC #3: Back and forth navigation
    public static void main(String[] args) {



//              1- Open a chrome browser
                WebDriver driver= WebDriverFactory.getDriver("chrome");
                driver.manage().window().maximize();


//              2- Go to: https://google.com
                driver.get("https://google.com");

//              3- Click to Gmail from top right.
                WebElement gmail = driver.findElement(By.className("gb_d"));
                gmail.click();

//              4- Verify title contains: Expected: Gmail
                String actual =driver.getTitle();
                String expected = "Gmail";
                System.out.println(actual +" is actual and "+expected+" is expected");
                if(actual.equals(expected)){
                    System.out.println("Test Passed");
                }else{
                    System.out.println("Test Failed");
                }

//              5- Go back to Google by using the .back();
                 driver.navigate().back();

//              6- Verify title equals: Expected: Google
                String actual2 =driver.getTitle();
                String expected2 = "Google";
                System.out.println(actual2 +" is actual2 and"+expected2+" is expected2");
                if(actual2.equals(expected2)){
                System.out.println("Test2 Passed");
                }else{
                System.out.println("Test2 Failed");
                }
                driver.quit();

}}
