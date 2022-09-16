package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1) Set up web driver manager
        WebDriverManager.chromedriver().setup(); // firstly you need to set up your web driver with browser

        // 2) opening an empty browser with creating instance driver

        WebDriver driver= new ChromeDriver();
        //Session id:

        //making window full screen/ maximizing
        driver.manage().window().maximize();
        // 3) go to https://store.playstation.com

        driver.get("https://store.playstation.com");

        driver.navigate().to("htpps://www.google.com");
        String currentTitle= driver.getTitle();
        System.out.println("title ="+currentTitle);

        //System.out.println("driver.getTitle() ="+driver.getTitle());

        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL ="+currentURL);

        driver.navigate().to("https://store.playstation.com/en-us/pages/ps5");
        driver.navigate().to("https://store.playstation.com/en-us/concept/230079");
        // navigate().to method is loading to url in browser code instead of that we will use get. method



        Thread.sleep(3000);  // for stop the execution or make it slower in this case we make it 3 milsecond slower
        // than before
        driver.navigate().back();  //for to go back on the web page

        Thread.sleep(3000);
        driver.navigate().forward(); // for to go forward on the web page

        Thread.sleep(3000);
        driver.navigate().refresh();

        // close() method will close current opened page
      //  driver.close();

        //quit() method will close all opened pages
       // driver.quit(); // at the end of code we need to use it bc its killing session id from web driver then we are
        // not able to use it so we will use close or quit method at the end of the code
        driver.navigate().to("htpps://www.google.com");
        currentTitle= driver.getTitle();
        System.out.println("title ="+currentTitle);

        //System.out.println("driver.getTitle() ="+driver.getTitle());

        currentURL= driver.getCurrentUrl();
        System.out.println("currentURL ="+currentURL);











        driver.quit();








    }
}
