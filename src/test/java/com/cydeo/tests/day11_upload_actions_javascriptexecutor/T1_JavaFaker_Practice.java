package com.cydeo.tests.day11_upload_actions_javascriptexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_JavaFaker_Practice {

   /** TC#1: Registration form confirmation
    Note: Use JavaFaker OR read from configuration.properties file when possible
    "COMPLETE AT NIGHTTTTTTTTTT.*/

   @Test
   public void registration_form(){
//        1. Open browser
//        2. Go to website: https://practice.cydeo.com/registration_form
          Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

          Faker faker = new Faker();// for fill up the blanks I need faker so I set up faker

//        3. Enter first name
           WebElement firstname =Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
           firstname.sendKeys(faker.name().firstName());

//        4. Enter last name
          WebElement lastname = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
          lastname.sendKeys(faker.name().lastName());

//        5. Enter username
          WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
          String fakerUsername =faker.gameOfThrones().dragon()+faker.numerify("####");
          username.sendKeys(fakerUsername);
          faker.numerify("#"+1);



          }
//        6. Enter email address


//        7. Enter password


//        8. Enter phone number


//        9. Select a gender from radio buttons


//        10. Enter date of birth


//        11. Select Department/Office


//        12. Select Job Title


//        13. Select programming language from checkboxes


//        14. Click to sign up button


//        15. Verify success message “You’ve successfully completed registration.” is
//        displayed.

     //  Note:
     //  1. Use new Driver utility class and method
     //  2. User JavaFaker when possible
    //   3. User ConfigurationReader when it makes sense

   }






