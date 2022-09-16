package com.cydeo.tests.day2_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CarInsuranceAppVerification {


    public static void main(String[] args) throws InterruptedException {
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //--------------------------------------------------------
        //2. Go to   https://www.qa1.excelsoirinsurance.com/login
        driver.get("https://www.qa1.excelsoirinsurance.com/login  ");
        //--------------------------------------------------------
        // 3. Verify URL contains  Expected: "excelsoirinsurance"
        String currentURL = driver.getCurrentUrl();
        currentURL = driver.getCurrentUrl();
        if (currentURL.contains("excelsoirinsurance")) {  // YOU CAN ALSO STORE EXPECTED ONE THAT'S THE COMMON WAY
            // Like currentURL.contains(expectedURL) AND USE THAT METHOD not the above one
            System.out.println("URL verification is PASSED");
        } else {
            System.out.println("URL verification is FAILED");
        }

        //--------------------------------------------------------
        //4. Verify title: Expected: "Login | Excelsoir Insurance"
        String expectedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is PASSED");
        } else {
            System.out.println("Title verification is FAILED");


        }
        //--------------------------------------------------------
        Thread.sleep(3000);
        driver.quit();
    }}



