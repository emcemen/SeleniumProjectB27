package com.cydeo.tests.day2_locaters_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H4_Day2 {

  //  TC #4: Practice Cydeo – Class locator practice
  public static void main(String[] args) {



//              1- Open a chrome browser
                WebDriver driver = WebDriverFactory.getDriver("chrome");
                driver.manage().window().maximize();

//              2- Go to: https://practice.cydeo.com/inputs
                driver.get("https://practice.cydeo.com/inputs");

//              3- Click to “Home” link
                WebElement homeLink = driver.findElement(By.className("nav-link"));
                homeLink.click();

//              4- Verify title is as expected:Practice
                String actual = driver.getTitle();
                String expected = "Practice";
                System.out.println(actual +" is actual and "+"("+expected+")"+" is expected");
                if(actual.equals(expected)){
                System.out.println("Test Passed");
                }else{
                System.out.println("Test Failed");
                driver.quit();
      }
}}
