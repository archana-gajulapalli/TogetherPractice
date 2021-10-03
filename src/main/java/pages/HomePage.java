package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {
    //variable
    public WebDriver driver;
    //constructor(java methodname=class name) and no return
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

//locator
    @FindBy(xpath = "//a[@class='headerLogo']")
    private WebElement homepageLogo;
    @FindBy(xpath="//li[@data-tab=\"tab-1\"]/ul/li[3]//a[@href='/most-wanted/']")
    private WebElement mostWantedClothing;
    @FindBy(xpath="//*[@id=\"mainMenu\"]//a[@href='/womens/']/../div/ul/li")
    private WebElement womenTab;


//java methods on elements
    public boolean verifyHomePageLogo() {
        return homepageLogo.isDisplayed();
    }


    public void clickWomenTab(){
        //webdriver driver. action
        womenTab.click();
    }


    public void getMenuItem(String mName) {
        List<WebElement> allText = driver.findElements(By.xpath("//*[@id=\"mainMenu\"]//a[@href=\"/womens/\"]"));
        for (WebElement element : allText) {
            System.out.println(element.getText());
            if (element.getText().equalsIgnoreCase(mName)) {
                element.click();
            }
        }
    }


    public void clickMostwantedWomenClothing(){
        mostWantedClothing.click();

    }


}
