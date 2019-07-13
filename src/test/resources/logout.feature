Feature: logout
  As a end user
  I want to click logout
  so that I should logged out of my account

  Scenario: logging out
    Given I am on my account
    When I click logout
    Then I should logged out of my account

