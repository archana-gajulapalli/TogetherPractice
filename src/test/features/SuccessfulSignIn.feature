@Regression
Feature:SignIN Happy path
  Background: I am background for amazon web application
    Given I am on home page
    Then I verify if logo is displayed

  Scenario: TC_01_signIn Successful
    When I click sign in btn
    Then I verify sign page title:"Amazon Sign In"
      #userstory: Sign-In but not SignIn signin sign in
     And I verify "Sign-In" Text is displayed
     And I enter email address:"demoT2728@gmail.com"
     And I click continue btn
     And I enter password:"checkme123@"
     And I click pwd sign In Btn
#    Then I verify user is successfully SignedIn and text:"Hello, Swathi" is displayed
##   #DB connect
##    And I connect to database "name""primary key""endpoint"
##    #query partition ey and row key
##    Then I verify if customer with name:"" and rowkey "" is present
