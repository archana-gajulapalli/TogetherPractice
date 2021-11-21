package steps;

import base.BaseTest;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ProductDescriptionPageStep extends BaseTest {

 @Then("I verify product title")
 public void verifyTitle(){
  String title_1 = homePageObj.getFirstProductTitle();
  String title_2 = productDescriptionPageObj.getTitle();
  Assert.assertEquals(title_1,title_2);
 }

}