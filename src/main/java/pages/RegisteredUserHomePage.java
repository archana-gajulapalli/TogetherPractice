package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisteredUserHomePage {


    WebDriver driver;

    public RegisteredUserHomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElement registeredUserText;

public boolean isHelloSwathiTextDisplayed(){
        return registeredUserText.isDisplayed();
}

}
