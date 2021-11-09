package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.security.Signature;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UnregisteredUserHomePage {
    //variable
    public WebDriver driver;

    public UnregisteredUserHomePage(WebDriver driver) {

        this.driver = driver;
    }


    @FindBy(xpath = "//title")
    WebElement titleHomePage;
    @FindBy(xpath = "//a[@href=\"/ref=nav_logo\"]")
    WebElement homepageLogo;
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchInputBox;
    @FindBy(xpath = "//*[@id=\"search\"]//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span[1]")
    WebElement searchResultsText;
    //    @FindBy(xpath="//span[contains(text(),'Price and other details may vary based on product size and colour.')]")
//    WebElement priceTxt;



    @FindBy(xpath="//div[@data-component-id=\"114\"]//h2//span")
    WebElement firstProductTitle;


    @FindBy(xpath = "//*[@id=\"nav-tools\"]/a[@data-nav-role='signin']")
    WebElement signInBtn;


    public void clickFirstSearchItem() {
        firstProductTitle.click();

    }
    public String getFirstProductTitle(){
        return firstProductTitle.getText();
    }

        public boolean isHomePageLogo() {
        return homepageLogo.isDisplayed();
    }

    public String getTitle() {
        return titleHomePage.getText();
    }

    public void enterSearch(String searchText) {
        searchInputBox.click();
        searchInputBox.sendKeys(searchText);
        searchInputBox.sendKeys(Keys.ENTER);
    }
    public boolean isSearchResultsTxtDisplayed() {
        return searchResultsText.isDisplayed();
    }

    //true //false

    public void clickSignInBtn() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       //mouse action
        Actions actionProvider = new Actions(driver);
        actionProvider.moveToElement(signInBtn);
        //javascript element click // element not interactable exeception
        WebElement signInButton  = driver.findElement(By.xpath("//*[@id=\"nav-tools\"]/a[@data-nav-role='signin']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", signInButton);
    }





}