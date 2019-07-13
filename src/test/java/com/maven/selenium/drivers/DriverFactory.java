package com.maven.selenium.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    protected static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
//private String browser = "chrome" ;
   private String browser = System.getProperty("brows");
  private String remoteURL = System.getProperty("remoteURL");

public void openBrowser() {
    switch (browser) {
        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
        case "ie":
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
            break;
        case "safari":
            driver = new SafariDriver();
            break;
        default:
            driver = new FirefoxDriver();
    }
}

//public void getUrl(){
   // driver.get("https://www.amazon.co.uk");
//}
public void maxWindow() {
    driver.manage().window().maximize();
}

public void applyWait(){
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
public void closeBrowser(){
    driver.quit();
}

}
