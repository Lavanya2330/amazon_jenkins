package com.maven.selenium.stepDef;

import com.maven.selenium.pages.HomePage;
import com.maven.selenium.pages.LoginPage;
import com.maven.selenium.pages.ResultsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginStepDef {
    private HomePage homePage = new HomePage();
    private LoginPage loginPage = new LoginPage();

    @When("^I enter the credentials in login page$")
    public void i_enter_the_credentials_in_login_page(){
      homePage.accountLink();
     loginPage.login();

    }

    @Then("^I should see welcome message$")
    public void i_should_see_welcome_message() {
String name = loginPage.getSignInUrl();
        System.out.println(name);
assertThat(name,Matchers.containsString("signin"));
    }

}
