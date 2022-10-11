package com.cydeo.tests.day7_windows_webtables;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_MultipleWindows {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        //1.Set up Browser
       driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_windows_test(){

        //3. Assert: Title is “Windows”
        //Assert.assertEquals(driver.getTitle(),"Windows");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle,expectedTitle);

        //4. Click to: “Click Here” link
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));// you can use xpath text --->
        // a[.='Click Here']
        clickHere.click();

        //5. Click to: “CYDEO” link
        WebElement clickLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        clickLink.click();

        //6. Switch to Cydeo page.
        Set<String>allWindows = driver.getWindowHandles();
        for(String eachWindow : allWindows){
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle()= "+driver.getTitle());

            if(driver.getTitle().equals("Cydeo")){
                break;
            }
        }

        //7. Assert: Title is “Cydeo"
        Assert.assertEquals(driver.getTitle(),"Cydeo"); // We can also write it like 3.option
    }
    @AfterMethod

    public void tearDown(){
        driver.close();
        driver.quit();

}
}
