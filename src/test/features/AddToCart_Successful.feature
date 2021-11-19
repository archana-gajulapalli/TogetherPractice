@Regression
Feature: Home page

  Background: I am background for amazon web application
    Given I launch amazon url
    And I accept cookies
    Then I verify if logo is displayed

Scenario: TC_01_Verify Product Title
     When I search for: "toys"
     And I click on first search item
    Then I verify product title

#  Scenario: TC_02_Verify product Quantity added
#    When I select quantity
#     And I click on add to basket
#    Then I verify the product quantity added from basket icon








