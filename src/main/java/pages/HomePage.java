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
<<<<<<< HEAD:src/main/java/pages/HomePage.java
    @FindBy(xpath="//div[@data-component-id=\"53\"]//h2//span")
=======
    //    @FindBy(xpath="//span[contains(text(),'Price and other details may vary based on product size and colour.')]")
//    WebElement priceTxt;



    @FindBy(xpath="//div[@data-component-id='118']//h2//span")
>>>>>>> 0dba5e62f55afd3e26648339918db0246f44f75e:src/main/java/pages/UnregisteredUserHomePage.java
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