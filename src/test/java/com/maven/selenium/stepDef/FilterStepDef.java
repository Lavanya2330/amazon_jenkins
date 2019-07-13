package com.maven.selenium.stepDef;

import com.maven.selenium.pages.FilterPage;
import com.maven.selenium.pages.HomePage;
import com.maven.selenium.pages.ResultsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.number.OrderingComparison;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Every.everyItem;

public class FilterStepDef {
    private HomePage homePage = new HomePage();
    FilterPage filterPage = new FilterPage();
    ResultsPage resultsPage = new ResultsPage();
 public static String selectedFilter;
 //public static String givenFilter;

    @When("^I search for a department and a product \"([^\"]*)\"$")
    public void i_search_for_a_department_and_a_product(String item)  {
        filterPage.selectDepartment();
        String selectItem = item;
        homePage.doSearch(selectItem);
    }


    @When("^I filter the products by a price range$")
    public void i_filter_the_products_by_a_price_range() {
        filterPage.selectProductsByPrice("£15 - £50");
    }

    @Then("^I should be able to get products with in the  price range$")
    public void i_should_be_able_to_get_products_with_in_the_price_range() {
        List<Double> priceList = filterPage.getSelectedProductsByPrice();
        assertThat(priceList, everyItem(OrderingComparison.greaterThanOrEqualTo(15.0)));
        assertThat(priceList, everyItem(OrderingComparison.lessThanOrEqualTo(50.0)));
    }


    @When("^I filter the products by Filter \"([^\"]*)\"$")
    public void i_filter_the_products_by_Filter(String filter)  {
      //String selectedFilter = filter;
        String nameOfProduct = resultsPage.randomProductSelect();
        List<String> nameList =  resultsPage.nameListOFProducts();
        assertThat(nameList, Matchers.contains(nameOfProduct));

    }

    @Then("^I should be able to get products according to the filter$")
    public void i_should_be_able_to_get_products_according_to_the_filter()  {
             filterPage.getSelectedProductsByPrice();
    }


}
