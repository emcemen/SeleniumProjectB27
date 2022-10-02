package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
    driver=WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void alertTask1(){
        //3. Click to “Click for JS Alert” button
        WebElement informationAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        informationAlertBtn.click();

        //4. Click to OK button from the alert
        //to handle javascript alerts we have to use Alert Method
        Alert alert = driver.switchTo().alert();
        alert.accept();
       // accept() method will click on pop op OK button

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement textMessage = driver.findElement(By.xpath("//p[@id='result']"));
        String actualTextMessage = textMessage.getText();
        String expectedTextMessage= "You successfully clicked an alert";
        Assert.assertEquals(actualTextMessage,expectedTextMessage,"Fail");


    }








}
