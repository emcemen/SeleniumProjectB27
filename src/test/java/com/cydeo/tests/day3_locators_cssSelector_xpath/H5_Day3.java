package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class H5_Day3 {
   // TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
   public static void main(String[] args) {


//            1- Open a chrome browser
              WebDriver driver = WebDriverFactory.getDriver("chrome");
              driver.manage().window().maximize();

//            2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
              driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

//            3- Enter incorrect username into login box:
              WebElement username = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
              username.sendKeys("incorrect");

//            4- Click to `Reset password` button
              WebElement resetBtn = driver.findElement(By.cssSelector("button[class='login-btn']"));
              resetBtn.click();

//            5- Verify “error” label is as expected Expected: Login or E-mail not found
              String actual = driver.findElement(By.className("errortext")).getText();
              String expected ="Login or E-mail not found";
              System.out.println(actual +" is actual and "+"("+expected+")"+" is expected");
              if(actual.equals(expected)){
                  System.out.println("Test Passed");
              }else{
              System.out.println("Test Failed");}
              driver.quit();





//            PS: Inspect and decide which locator you should be using to locate web elements.
 //           PS2: Pay attention to where to get the text of this button from
}}
