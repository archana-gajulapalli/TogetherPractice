@Regression
Feature: Home page

  Background: I am background for amazon web application
    Given I am on home page
    When accept cookie
    Then I verify if logo is displayed

    #Then I verify title of the page conatins amazon

Scenario: test womens department braclet
  #accept cookie
     When I search for: "jewellery"
     And I click on department womens braclet

  #//*[@id="n/10382861031"]
    # Then I verify womens bracelet text is displayed
  Scenario:








