Feature: Home page

  Background: user is on just for your outfit application
    Given I am on home page
    Then I verify if logo is displayed
    Then I verify title of the page conatins amazon

Scenario: i test
     When I search for: "hgh"
    Then I verify price text is displayed