package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage {
    WebDriver driver;

    public ProductDescriptionPage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(xpath="//*[@id=\"productTitle\"]")
    private WebElement productTitle;
//get

    @FindBy(xpath="//*[@id=\"quantity\"]")
    private WebElement quantityDropDown;

    @FindBy(xpath="//*[@id=\"quantity\"]/option[2]")
    private WebElement quantityDropDownOption2;

    @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
    private WebElement addToBasket;

//get title method
    public String getTitle(){
        return productTitle.getText();
    }
    public void clickQuantityDropDown(){
     quantityDropDown.click();
    }
    public void clickOption2(){
        quantityDropDownOption2.click();
    }
    public void clickAddToBasket(){
        addToBasket.click();
    }

}
