package com.maven.selenium;

import com.maven.selenium.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
   private DriverFactory driverFactory = new DriverFactory();
   @Before
    public void setUp(){
driverFactory.openBrowser();
driverFactory.getUrl();
driverFactory.maxWindow();
driverFactory.maxWindow();
    }

  //  @After
    public void tearDown(){
       driverFactory.closeBrowser();
    }
}
