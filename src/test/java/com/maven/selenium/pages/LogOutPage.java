package com.maven.selenium.pages;

import com.maven.selenium.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogOutPage extends DriverFactory {
    public void logout(){
   WebElement element = driver.findElement(By.cssSelector("#nav-link-accountList"));
   Actions actions = new Actions(driver);
 actions.moveToElement(element).build().perform();
  WebElement clickElement = driver.findElement(By.linkText("Sign Out"));
  actions.moveToElement(clickElement).click().perform();
    }

    public String logOutAssert(){
        String title = driver.findElement(By.cssSelector(".a-spacing-small")).getText();
        return title;
    }
}
