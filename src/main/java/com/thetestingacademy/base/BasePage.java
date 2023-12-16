package com.thetestingacademy.base;

import com.thetestingacademy.drivers.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
// import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public BasePage(){
        // If you want to call something before every Page Object Class call, Put your code here
        // Open File, Open Data Base Connection You can write code here
    }

    // This is common to all the Pages

// Waits
public void implicitWait(){

        DriverManager.getDriver().manage().timeouts(). implicitlyWait(10, TimeUnit.SECONDS);
}

// Driver Call


// Common Functions

    public void clickElement(By by){
        DriverManager.getDriver().findElement(by).click();
    }

    public WebElement presenceOfElement(final By elementLocation) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(final By elementLocation) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    protected void enterInput(By by, String key){
        DriverManager.getDriver().findElement(by).sendKeys(key);
        }

    protected WebElement getElement(By key){
        return DriverManager.getDriver().findElement(key);
    }

            }

