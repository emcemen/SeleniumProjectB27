package com.cydeo.tests.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H6_Day4 {

    //TC #6:  XPATH LOCATOR practice
    public static void main(String[] args) {


//            1. Open Chrome browser
              WebDriver driver = WebDriverFactory.getDriver("chrome");
              driver.manage().window().maximize();

//            2. Go to http://practice.cydeo.com/multiple_buttons
              driver.get("http://practice.cydeo.com/multiple_buttons");

//            3. Click on Button 1
              WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
              button1.click();

//            4. Verify text displayed is as expected: Expected: “Clicked on button one!”

                String actual = driver.findElement(By.xpath("//p[@id='result']")).getText();
                System.out.println(actual);
                String expected = "Clicked on button one!";

                if(actual.equals(expected)){
                    System.out.println("PASSED");
                }else{
                    System.out.println("FAILED");
                }



//              USE XPATH LOCATOR FOR ALL WEB ELEMENT LOCATORS
}}
