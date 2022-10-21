package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class H7_Day5 {
    // TC #4: Selecting state from State dropdown and verifying result
//            1. Open Chrome browser
//            2. Go to http://practice.cybertekschool.com/dropdown
    @Test
    public void H7() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
//            3. Select Illinois
        WebElement selectBar = Driver.getDriver().findElement(By.id("state"));
        selectBar.click();
        WebElement selectIL = Driver.getDriver().findElement(By.xpath("//option[@value='IL']"));
        selectIL.click();
//            4. Select Virginia
        WebElement selectVA = Driver.getDriver().findElement(By.xpath("//option[@value='VA']"));
        selectVA.click();


//            5. Select California
        WebElement selectCA = Driver.getDriver().findElement(By.xpath("//option[@value='CA']"));
        selectCA.click();
//            6. Verify
        System.out.println("selectCA.isSelected() = " + selectCA.isSelected());
        //final selected option is California.


        //Use all Select options. (visible text, value, index)
    }

    @AfterClass
    public void tearDown() {
        Driver.getDriver().quit();
    }
}
