package com.maven.selenium.stepDef;

import com.maven.selenium.pages.HomePage;
import com.maven.selenium.pages.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class SearchStepDef {
public String selectedItem;
   private HomePage homePage = new HomePage();
   private ResultsPage resultsPage = new ResultsPage();

    @Given("^I am on HomePage$")
    public void i_am_on_HomePage(){
       String url = homePage.currentUrl();
       assertThat(url,endsWith("co.uk/"));
        }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String item) {
        selectedItem = item;
        homePage.doSearch(item);
    }
    @Then("^I should  see the relevant products$")
    public void i_should_see_the_relevant_products(){
      String actualTitle =  homePage.getTitle().replace(("\"" ),"");
        System.out.println(actualTitle);
        System.out.println("selectedItem : " + selectedItem);
      assertThat(actualTitle,Matchers.equalToIgnoringCase(selectedItem));

    }

    @When("^I select random product$")
    public void i_select_random_product() {
          resultsPage.randomProductSelect();
    }

    @Then("^I sholud be able to confitm the selected product$")
    public void i_sholud_be_able_to_confitm_the_selected_product() {
      List<String> nameList =  resultsPage.nameListOFProducts();
      String name = resultsPage.randomProductSelect();
      assertThat(nameList,Matchers.contains(name));


    }


}
