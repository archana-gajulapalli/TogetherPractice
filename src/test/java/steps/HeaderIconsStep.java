package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class HeaderIconsStep extends BaseTest {
    @Then("I verify title is displayed")
    public void iVerifyLoginIconIsDisplayed() {
        //boolan return tru or false
        Assert.assertTrue(headerIconsPageObj.isJfyTitleDisplayed());
        Assert.assertEquals("Justyouroutfit",headerIconsPageObj.getTitle());

    }
}
