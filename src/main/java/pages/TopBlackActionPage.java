package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBlackActionPage {

    WebDriver driver;

    public TopBlackActionPage(WebDriver driver) {
        this.driver = driver;
    }
   @FindBy(xpath="//*[@id=\"nav-cart-count\"]")
    private WebElement quantityNumber;


    public String getQuantityFromBasketIcon(){
        return quantityNumber.getText();
    }

}
