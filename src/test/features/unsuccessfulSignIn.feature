@Regression
  Feature:signIn Un-Happy path
    Background: I am background for amazon web application
      Given I am on home page
      Then I verify if logo is displayed


    Scenario: Tc_02_signIn Unsuccessful with invalid Username
      When I click sign in btn
      Then I get Text:"Sign-In"
      And I enter email address:"demot@gmail.com"
      And I click continue btn
      Then I get errorMessage Text:"We cannot find an account with that e-mail address"


    Scenario Outline: Tc_03_signIn Unsuccessful with invalid password
      When I click sign in btn
      Then I get Text:"Sign-In"
      And I enter email address:"gudia.swathi05@gmail.com"
      And I click continue btn
      And I enter password:"<incorrectpasswordvalue>"
      And I click pwd sign In Btn
      Then I verify signIn Btn is displayed
      Examples:
      |incorrectpasswordvalue|
      |abcd|
      |1234|
