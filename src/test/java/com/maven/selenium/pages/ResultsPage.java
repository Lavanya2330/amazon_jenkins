package com.maven.selenium.pages;

import com.maven.selenium.drivers.DriverFactory;
import com.maven.selenium.utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends  DriverFactory {
    public String randomProductSelect() {
        List<WebElement> products = driver.findElements(By.cssSelector(".a-section.a-spacing-none.a-spacing-top-small"));
        int size = products.size();
        int randomNumber = new Helpers().generateRandomNumber(size);
        String selectedProduct = products.get(randomNumber).getText();
        System.out.println(selectedProduct);
        products.get(randomNumber).click();
        return selectedProduct;
    }

    public List<String> nameListOFProducts() {
        List<String> nameList = new ArrayList<>();
        List<WebElement> productNamesWebElements = driver.findElements(By.cssSelector(".a-section.a-spacing-none.a-spacing-top-small"));
        for (WebElement productName : productNamesWebElements) {
            String name = productName.getText();
            nameList.add(name);


        }
        return nameList;
    }
}