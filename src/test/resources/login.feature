Feature: login
  As a end user
  I want to login
  So that I should able to buy products

  Scenario: login with credentials
    Given I am on HomePage
    When I enter the credentials in login page
    Then I should see welcome message
