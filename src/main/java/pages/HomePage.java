package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {
    //variable
    public WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(xpath = "//title")
    WebElement titleHomePage;
    @FindBy(xpath = "//a[@href=\"/ref=nav_logo\"]")
    WebElement homepageLogo;
    @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
    WebElement searchInputBox;
    @FindBy(xpath="//*[@id=\"search\"]//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span[1]")
    WebElement searchResultsText;
//    @FindBy(xpath="//span[contains(text(),'Price and other details may vary based on product size and colour.')]")
//    WebElement priceTxt;
    @FindBy(xpath="//*[@id=\"sp-cc-accept\"]")
    WebElement cookieAccept;
    @FindBy(xpath="//*[@id=\"n/10382868031\"]")
    WebElement womensBraceletsDepartment ;



    public boolean isHomePageLogo() {
        return homepageLogo.isDisplayed();
    }


    public String getTitle(){
        return titleHomePage.getText();
    }
    public void enterSearch(String searchText){
        searchInputBox.click();
        searchInputBox.sendKeys(searchText);
        searchInputBox.sendKeys(Keys.ENTER);
    }

    public boolean isSearchResultsTxtDisplayed(){
        return searchResultsText.isDisplayed();
    }



public boolean isCookie(){
        return cookieAccept.isDisplayed();
    }

    public void clickCookieAccept(){
        cookieAccept.click();



    }
public boolean isWomensBraceletDepartmentDisplaed(){
        return womensBraceletsDepartment.isDisplayed();

}

    public void clickWoensBraceletsDepartment(){

        womensBraceletsDepartment.click();
    }

}
