package pages;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TopBlackActionPage {

    WebDriver driver;

    public TopBlackActionPage(WebDriver driver) {
        this.driver = driver;
    }
   @FindBy(xpath="//*[@id=\"nav-cart-count\"]")
    private WebElement quantityNumber;
    @FindBy(xpath = "//*[@id=\"nav-tools\"]/a[@data-nav-role='signin']")
    WebElement signInBtn;
    @FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElement helloUserText;

    public String getUserName(){
        return helloUserText.getText();

    }

    public String getQuantityFromBasketIcon(){
        return quantityNumber.getText();
    }

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
