@Regression
Feature:SignIN Happy path
  Background: I am background for amazon web application
    Given I launch amazon url
    Then I verify if logo is displayed
@Smoke
  Scenario: TC_01_signIn Successful
    When I click sign in btn
    Then I verify sign page title:"Amazon Sign In"
     And I enter email address:"demoT2728@gmail.com"
     And I click continue btn
     And I enter password:"checkme123@"
     And I click pwd sign In Btn
    Then I verify successful signIn text:"Hello, Demo"