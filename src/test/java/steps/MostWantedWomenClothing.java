package steps;

import base.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MostWantedWomenClothing extends BaseTest {

    @When("I click most wanted women clothing")
    public void iClickMostWantedWomenClothing(){
        homePageObj.clickMostwantedWomenClothing();
    }
//cucumber annotation execution given when then before


}
