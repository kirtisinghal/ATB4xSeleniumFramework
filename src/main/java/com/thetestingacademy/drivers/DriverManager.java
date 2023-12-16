package com.thetestingacademy.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverManager {
    // Static Method = Shared by All the Testcases
    // Thread Local = 1 Class or Test per Driver

    static WebDriver driver;

    @BeforeMethod
    static void init(){
        if(driver == null){
            driver = new EdgeDriver();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }


    @AfterMethod
    static void down(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }



}
