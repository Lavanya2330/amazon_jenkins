Feature: filters
  As a end user
  I want to filter products by price
  So that I should be able to get products within the range
@smoke
  Scenario: filter By price select
    Given I am on HomePage
    When I search for a department and a product "nike"
    And I filter the products by a price range
    Then I should be able to get products with in the  price range
@smoke @rk
    Scenario: filter Low To High
      Given I am on HomePage
      When I search for a product "nike"
      And I filter the products by Filter "Price: Low to High"
      Then I should be able to get products according to the filter

