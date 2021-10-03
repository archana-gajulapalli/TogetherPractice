Feature: Common actions

  @regression @smoke
  Scenario: TC_01_Verify user is on home page
    Given I am on home page
    And I verify home page logo

  @regression
  Scenario: TC_02_Verify login icon on home page
    Given I am on home page
    Then I verify login icon is displayed