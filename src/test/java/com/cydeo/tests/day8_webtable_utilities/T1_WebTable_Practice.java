package com.cydeo.tests.day8_webtable_utilities;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_WebTable_Practice extends TestBase {


 //   WebDriver driver;

 //   @BeforeMethod
 //   public void setUp() {
  //      driver = WebDriverFactory.getDriver("chrome");
  //      driver.manage().window().maximize();
  //      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        1. Go to: https://practice.cydeo.com/web-tables
 //       driver.get("https://practice.cydeo.com/web-tables");
 //   }


    @Test
    public void order_name_verify_test() {

//        2. Verify Bob’s name is listed as expected.Expected: “Bob Martin”
//        //td[.='Bob Martin'] finding with text solution
//        if you have table you need to search from table to text. that can be best in this option
//        we go with  id bc it is uniq //table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']

        WebElement bobMartinName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinName.getText();

        Assert.assertEquals(actualBobName, expectedBobName);

//        3. Verify Bob Martin’s order date is as expected.Expected: 12/31/2021
        WebElement bobMartinDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
//      we can go with the same text model but we tried more uniq and following sibling method
//      another locater //td[.='Bob Martin']/../td[5]

        Assert.assertEquals(bobMartinDate.getText(), "12/31/2021");

    }

    @Test
    public void test2() {

        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver, "Ned Stark");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);

    }

    @Test
    public void test3() {

        WebTableUtils.orderVerify(driver, "Ned Stark", "05/12/2021");

    }
}

// we wil use test base
//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//        driver.quit();
//    }










