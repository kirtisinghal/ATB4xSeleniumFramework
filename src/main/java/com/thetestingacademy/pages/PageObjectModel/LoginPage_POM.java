package com.thetestingacademy.pages.PageObjectModel;

import com.thetestingacademy.base.BasePage;
import com.thetestingacademy.drivers.DriverManager;
import com.thetestingacademy.utils.PropertyReader;
import org.openqa.selenium.By;

public class LoginPage_POM extends BasePage {

    public LoginPage_POM() {
    super();
    }

    // Page Locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");

    // Page Actions

    public LoginPage_POM loginToVWOPositive() throws Exception {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password,PropertyReader.readKey("password"));
        clickElement(signButton);
        // DriverManager.getDriver().findElement(password).click();
        // Pass Control to DashboardPage
        return this;
    }

    public void loginToVWONegative() throws Exception {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password,PropertyReader.readKey("password"));
        clickElement(signButton);
        // error String

    }

    public DashboardPage_POM afterLogin(){
        return new DashboardPage_POM();
    }


}
