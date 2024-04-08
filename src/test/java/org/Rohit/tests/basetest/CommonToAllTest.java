package org.Rohit.tests.basetest;

import driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {

    // To call the Start the Webdriver
    // Down the WebDriver
    // Start Webdirver start
    @BeforeMethod
    public void setUp(){
        DriverManager.init();
    }

    // Who will close the Webdriver
    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }





}