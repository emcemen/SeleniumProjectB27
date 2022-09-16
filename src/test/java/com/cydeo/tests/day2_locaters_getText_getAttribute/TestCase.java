package com.cydeo.tests.day2_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
    public static void main(String[] args) throws InterruptedException {


    //1- Open a Chrome browser
     WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

    //2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/ ");
        Thread.sleep(3000);// I just want to see steps that is the reason I put sleep method

    //3- Click to A/B Testing from top of the list.
      driver.get("https://practice.cydeo.com/abtest");
      Thread.sleep(3000);

    //4- Verify title is: Expected: No A/B Test
        String expectedTitle ="No A/B Test";
        String actualTitle =driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title Check PASSED");
        }else{
            System.out.println("Title Check FAILED");
        }
    //5- Go back to home page by using the .back();
        driver.navigate().back();
        Thread.sleep(3000);

    //6- Verify title equals: Expected: Practice
        expectedTitle ="Practice";
        actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title Check PASSED");
        }else{
            System.out.println("Title Check FAILED");
        }
        driver.quit();
}}
