package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.SignInPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePageStep extends BaseTest {

    @Given("I launch amazon url")
    public void i_Launch_Url() throws IOException {
        driver.get(util.readPropertyFile("URL"));
    }
    @Then("I verify if logo is displayed")
    public void isLogoDisplayed() {
        Assert.assertTrue(homePageObj.isHomePageLogo());
    }

    @Then("I verify title of the page conatains amazon")
    public void verifyTitle() {
        String title = homePageObj.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("amazon"));
    }
    @When("I search for: {string}")
    public void enterSearchCriteria(String txt) {
        homePageObj.enterSearch(txt);
        Assert.assertTrue(homePageObj.isSearchResultsTxtDisplayed());
    }
    @When ("I click sign in btn")
    public void clickSignInBtn(){
        topBlackActionPageObj.clickSignInBtn();
    }
    @And("I click on first search item")
    public void clickFirstItem(){
        homePageObj.clickFirstSearchItem();
    }

    @And("I accept cookies")
    public void acceptCookie(){
        if(homePageObj.isCookie()){
            homePageObj.clickCookieAccept();
        }
///       Assert.assertTrue(!homePageObj.isCookie());
    }

//    @Then("I verify womens bracelet text is displayed")
//    public void womensBraceletText(String txt){
//        homePageObj.WomensBraceletText(txt);
//        Assert.assertTrue(homePageObj.isWomensBraceletTextDisplayed());
//    }


//    @And("I verify home page logo")
//    public void i_verify_home_page_logo() {
//        Assert.assertTrue(homePageObj.verifyHomePageLogo());
//        System.out.println(homePageObj.verifyHomePageLogo());
//        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        JavascriptExecutor jse = ((JavascriptExecutor) driver);
//
//        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//
//    }

}