package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {// actually in real work environment the class name called LoginPage.

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    } // to see "this" elements we need to write them

    @FindBy (id="inputEmail")
    //WebElement inputUsername=Driver.getDriver().findElement(By.xpath())
    //we are not using that method no more.Remember about funeral of findElement.
    public WebElement inputUsername;

    @FindBy (xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[.='Sign in']")
    public  WebElement signInButton;

    @FindBy (xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErrorMsg;

    @FindBy (xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterInvalidEmailErrorMsg;

    @FindBy (xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailAndPasswordErrorMsg;

















}
