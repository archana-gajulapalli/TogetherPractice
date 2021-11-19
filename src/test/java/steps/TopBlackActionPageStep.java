package steps;

import base.BaseTest;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class TopBlackActionPageStep extends BaseTest {

    @Then("I verify successful signIn text:{string}")
    public void iVerifySuccessfulSignInText(String successfulSignInTextFromScenario) {
        Assert.assertEquals(topBlackActionPageObj.getUserName(), successfulSignInTextFromScenario);

    }

}
