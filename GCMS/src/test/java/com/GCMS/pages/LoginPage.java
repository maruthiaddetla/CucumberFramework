package com.GCMS.pages;

import com.GCMS.testbase.BaseClass;
import com.GCMS.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Products']")
    public WebElement products;


    public LoginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

}
