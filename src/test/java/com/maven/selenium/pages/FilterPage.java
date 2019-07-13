package com.maven.selenium.pages;

import com.maven.selenium.drivers.DriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static com.maven.selenium.stepDef.FilterStepDef.selectedFilter;

public class FilterPage extends DriverFactory {
    private HomePage homePage = new HomePage();


    public void selectDepartment() {
        Select department = new Select(driver.findElement(By.cssSelector(".nav-search-dropdown.searchSelect")));
        department.selectByVisibleText("Toys & Games");
    }

    public void selectProductsByPrice(String selectPriceRange) {
        List<WebElement> selectPrices = driver.findElements(By.cssSelector(".a-vertical.a-spacing-medium .a-list-item"));
        for (WebElement selectPrice : selectPrices) {
            if (selectPrice.getText().equals(selectPriceRange)) {
                selectPrice.click();
                break;
            }
        }
    }

    public List<Double> getSelectedProductsByPrice() {
        List<Double> collectAllThePrices = new ArrayList<>();
        List<WebElement> selectedProducts = driver.findElements(By.cssSelector(".a-price"));
        for (WebElement selectedProduct : selectedProducts) {
            String priceInString = selectedProduct.getText().replace("£", "");
            double priceInDouble = Double.parseDouble(priceInString);
            collectAllThePrices.add(priceInDouble);
        }
        System.out.println(collectAllThePrices);
        return collectAllThePrices;
    }

    public void selectFilter(String selectedFilter) {
        Select filter = new Select(driver.findElement(By.cssSelector("#s-result-sort-select")));
        filter.selectByVisibleText(selectedFilter);

    }
}

