package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_RadioButton {

    public static void main(String[] args) {


//    1. Open Chrome browser

      WebDriver driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//    2. Go to https://practice.cydeo.com/radio_buttons

       driver.get("https://practice.cydeo.com/radio_buttons");

//    3. Click to “Hockey” radio button

      WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
      hockeyButton.click();

        System.out.println(hockeyButton.isSelected()); // it returns boolean true or false

//    4. Verify “Hockey” radio button is selected after clicking.

      if(hockeyButton.isSelected()) { // this is first time we are using its a condition
          System.out.println("Hockey button is SELECTED");
      }else{
          System.out.println("Hockey button is NOT SELECTED");
      }
      driver.quit();
}}
