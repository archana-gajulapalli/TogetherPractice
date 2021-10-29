@Regression
Feature:SignIN Happy path
  Background: I am background for amazon web application
    Given I am on home page
    When accept cookie
    Then I verify if logo is displayed

  Scenario: TC_01_SignIn Successful
    When I click sign in btn
    Then I verify sign page title:"Amazon Sign In"
      #userstory: Sign-In but not SignIn signin sign in
     And I verify "Sign-In" Text is displayed
     And I enter email address:"gudia.swathi05@gmail.com"
     And I click continue btn
#    And I enter password:"******"
#    Then I  verify user is successfully signed in
#





