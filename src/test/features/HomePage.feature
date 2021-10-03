@Mainataince
Feature: Home page

  Background: user is on just for your outfit application
    Given I am on home page:"URL"
    Then I verify title is displayed

@Regression
  Scenario: TC_01_Select item from menu item
#    When I cancel pop
    When I select women tab
    Then I verify current url:"https://www.justyouroutfit.com/womens/"


@MyScenario
 Scenario: TC_02_Verify_MostWanted_Women_Clothing
   When I click most wanted women clothing
   Then I verify current url:"https://www.justyouroutfit.com/most-wanted/"
  #Then my url is: "ajhdfjagdjf"

