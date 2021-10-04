package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderIconsPage {
    public WebDriver driver;

    public HeaderIconsPage(WebDriver driver) {
        this.driver = driver;}




    @FindBy(xpath = "//a[@title=\"Go to homepage\"]")
    private WebElement justForYOurOutfitImage;


    public boolean isJfyTitleDisplayed(){
        return justForYOurOutfitImage.isDisplayed();

    }

    public String getTitle(){
        return justForYOurOutfitImage.getText();
    }
}
