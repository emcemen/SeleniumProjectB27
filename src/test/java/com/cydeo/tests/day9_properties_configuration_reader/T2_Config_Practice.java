package com.cydeo.tests.day9_properties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Config_Practice extends TestBase { // extended TestBase for  set up testUtility


//  1- Open a Chrome browser
    @Test
    public void google_search_test_using_properties() {

//  2- Go to: https://google.com/
//  driver.get("https://google.com/");
    driver.get(ConfigurationReader.getProperty("google.url"));
// this way we can change th url address in properties and then the address will be change in code too so thats the
// best way  instead of hardcoding as first line.


//  3- Write “apple” in search box
    WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
    searchBox.sendKeys(ConfigurationReader.getProperty("search.keyword")+ Keys.ENTER);

//  4- Verify title: Expected: apple - Google Search
     String actualTitle = driver.getTitle();
//     String expectedTitle = "apple"+" - Google Search";
//     if something is keep changing in code we can use properties so in this case apple can be change for example we
//     can look for another keyword as Tesla or something and then if we make a properties for that keyword and if we
//     change it in our properties that means our code will automatically search the new keyword so if we have it in
//     more line so that can be really helpful to change the code in everywhere.
     String expectedTitle = ConfigurationReader.getProperty("search.keyword")+" - Google Search";

     Assert.assertEquals(actualTitle,expectedTitle);

 }
}
