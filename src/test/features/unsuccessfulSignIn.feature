@Regression
  Feature:signIn Un-Happy path
    Background: I am background for amazon web application
      Given I am on home page
      Then I verify if logo is displayed


    Scenario: Tc_02_signIn Unsuccessful with invalid Username
      When I click sign in btn
      Then I verify "Sign-In" Text is displayed
      And I enter email address:"demot@gmail.com"
      And I click continue btn
      Then I verify error message is"We cannot find an account with that e-mail address"


    Scenario: Tc_03_signIn Unsuccessful with invalid password
      When I click sign in btn
      Then I verify "Sign-In" Text is displayed
      And I enter email address:"demoT2728@gmail.com"
      And I click continue btn
      And I enter password:"checkme12"
      And I click pwd sign In Btn
      Then I verify error message is"Your password is incorrect"