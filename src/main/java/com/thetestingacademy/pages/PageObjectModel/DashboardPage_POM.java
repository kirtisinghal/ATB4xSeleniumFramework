package com.thetestingacademy.pages.PageObjectModel;

import com.thetestingacademy.base.BasePage;
import org.openqa.selenium.By;

public class DashboardPage_POM extends BasePage {

    DashboardPage_POM(){

    }

    By userNameDashboard = By.cssSelector("//span[@data-qa='lufexuloga']");


}
