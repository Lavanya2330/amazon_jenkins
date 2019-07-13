package com.maven.selenium.pages;

import com.maven.selenium.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

  public static String selectedItem;
    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(css = ".nav-input")
    private WebElement magnifierGlass;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    private WebElement titleClass;

    @FindBy(css = "#nav-link-accountList")
    private WebElement accountPageLink;

    public void doSearch(String Item) {
        searchTextBox.sendKeys(Item);
        selectedItem = Item;
        magnifierGlass.click();
    }

    public String currentUrl() {
        String actualUrl = driver.getCurrentUrl();
        return actualUrl;
    }

    public String getTitle() {
        String title = titleClass.getText();
        return title;
    }

    @FindBy(id="nav-link-accountList")
    private WebElement signIn;

    public void accountLink() {
        signIn.click();
    }

}
