package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    //variable
    public WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    @FindBy(xpath="//*[@id='a-autoid-0']")
    WebElement cookieAccept;
    @FindBy(xpath = "//title")
    WebElement titleHomePage;
    @FindBy(xpath = "//a[@href=\"/ref=nav_logo\"]")
    WebElement homepageLogo;
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchInputBox;
    @FindBy(xpath = "//*[@id=\"search\"]//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span[1]")
    WebElement searchResultsText;
    @FindBy(xpath="//div[@data-component-id=\"53\"]//h2//span")
    WebElement firstProductTitle;



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

    public boolean i() {
        return firstProductTitle.isDisplayed();
    }


    public boolean isCookie(){
        return cookieAccept.isDisplayed();
    }
        
    public void clickCookieAccept(){    
        cookieAccept.click();
        
        
    }





}