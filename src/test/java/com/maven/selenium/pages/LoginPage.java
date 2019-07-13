package com.maven.selenium.pages;

import com.maven.selenium.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverFactory {
    // @FindBy(id = "ap_email")
    //  private WebElement emailId;

    // @FindBy(id = "ap_password")
    //  private WebElement password;

    @FindBy(id = "signInSubmit")
    private WebElement signInButton;

    public void login() {
       // System.out.println("hi");
        // emailId.clear();
        // emailId.sendKeys("ra.lavanyaa@gmail.com");
        driver.findElement(By.cssSelector("#ap_email")).clear();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("ra.lavanyaa@gmail.com");
        driver.findElement(By.cssSelector("#ap_password")).clear();
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("ananya23");
        driver.findElement(By.cssSelector("#signInSubmit")).click();
        //  password.clear();
        // password.sendKeys("ananya23");
        // signInButton.click();
    }


    private WebElement nameClass;
    public String getSignInUrl(){
        String name = driver.getCurrentUrl();
        return name;
    }


}
