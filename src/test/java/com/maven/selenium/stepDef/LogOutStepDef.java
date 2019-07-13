package com.maven.selenium.stepDef;

import com.maven.selenium.pages.HomePage;
import com.maven.selenium.pages.LogOutPage;
import com.maven.selenium.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class LogOutStepDef {

   private LoginPage loginPage = new LoginPage();
   private LogOutPage logOutPage = new LogOutPage();
   private HomePage homePage = new HomePage();

    @Given("^I am on my account$")
    public void i_am_on_my_account()  {
        homePage.accountLink();
        loginPage.login();
       }

    @When("^I click logout$")
    public void i_click_logout() {
        logOutPage.logout();
    }

    @Then("^I should logged out of my account$")
    public void i_should_logged_out_of_my_account() {
          String title = logOutPage.logOutAssert();
          assertThat(title,equals("Sign-In"));
    }

}
