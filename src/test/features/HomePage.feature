@Regression
Feature: Home page

  Background: iam background for amazon .....this is just name no execution
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




