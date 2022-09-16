package com.cydeo.tests.day2_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {
        // 1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

         //2- Go to: https://google.com/
          driver.get("https://google.com");

         //3- Write “apple” in search box
         //4- Use Keys.ENTER to search
        WebElement searchBox = driver.findElement(By.name("q"));// ******NEW METHOD********
        searchBox.sendKeys("apple"+ Keys.ENTER);// it is same function with click method

        //5- Verify title Expected: Title should start with “apple” word

        String expectedInTitle ="apple";
        String actualTitle =driver.getTitle();
        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.quit();

}}
