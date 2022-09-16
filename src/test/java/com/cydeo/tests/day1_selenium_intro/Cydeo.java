package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cydeo {
    public static void main(String[] args) {
        // 1) Set up web driver manager
        WebDriverManager.chromedriver().setup();

        // 2) opening an empty browser with creating instance driver

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.cydeo.com");

        String expectedTitle ="Cydeo";
        String actualTitle =driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED");
        }else{
        System.out.println("Title verification is FAILED");

        driver.quit();





    }
}}
