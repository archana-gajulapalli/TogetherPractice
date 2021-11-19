@Smoke
Feature:Smoke test

  Background:
    Given I launch amazon url

  Scenario:TC_01_successful launch amazon
    Then I verify if logo is displayed
