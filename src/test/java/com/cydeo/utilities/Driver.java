package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //Creating a private constructor, so we are closing access to the object of thi class from outside of any class
    private Driver() {
    }

    /*
    Making our 'driver' instance private, so that is not reachable from outside of any class
    We make it static because We want it to run before anything else,
    also we will use it in Static Method
     */
    private static WebDriver driver;
        /*
        Create re-usable utility method which will return same driver instance when we call it
         */

    public static WebDriver getDriver() {
        if (driver == null) {
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
        }
       // Same driver instance will be returned every time we call Driver.getDriver() method
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();// this line wil the kill the section.Value will now be null.
            driver = null;
        }
    }

}
