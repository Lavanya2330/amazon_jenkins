Feature: Search
  As a end user
  I want to search for a product
  So that I should be able to see relevant products
@smoke
  Scenario: search for a product
    Given I am on HomePage
    When I search for a product "nike"
    Then I should  see the relevant products

Scenario: select a random product
  Given I am on HomePage
  When I search for a product "nike"
  And I select random product
  Then I sholud be able to confitm the selected product
