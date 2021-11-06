package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class SignInPageStep extends BaseTest {

    @Then("I verify sign page title:{string}")
    public void iVerifySignInPageTitle(String title) {
        String signInTitle = signInPageObj.getSignInPageTitle();
        System.out.println(signInTitle);
      Assert.assertEquals(signInTitle,title);
    }

    //verification of the text containing signin
    @And("I verify {string} Text is displayed")//glue for feature file and step def
    public void iVerifyTextIsDisplayed(String textFromScenario) {
        String textFromMethod = signInPageObj.getSignInText();
        System.out.println("Actual text is:"+ textFromMethod);
        System.out.println("Expected text is:"+textFromScenario);
        //a=a
        //compare two strings
        Assert.assertEquals(textFromMethod,textFromScenario);
    }

    @Then("I verify error message is{string}")
    public void iVerifyErrorMessageIs(String errorMessageFromScenario) {
        String errormessage = signInPageObj.getErrorMessageText();
        System.out.println("Actual text is:"+ errormessage);
        System.out.println("Expected text is:"+errorMessageFromScenario);
        //a=a
        //compare two strings
        Assert.assertEquals(errormessage,errorMessageFromScenario);
    }

    @And("I enter email address:{string}")
    public void iEnterEmailAddress(String email) {
        signInPageObj.enterEmailId(email);

    }
    @And("I click continue btn")
    public void iClickContinueBtn() {
        signInPageObj.clickConitnueBtn();
    }

    @And("I enter password:{string}")
    public void iEnterPassword(String pwd) {
        signInPageObj.enterPassword(pwd);
    }

    @And("I click pwd sign In Btn")
    public void clickSignInBtn() {
        signInPageObj.clickSignInSubmitBtn();
    }



}






