package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.Text;

public class SignInPage {
    //variable
    public WebDriver driver;

    //constructor is
    //access type + method with a class name
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1")
    WebElement signInText;//variable
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement emailInputBox;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement continueBtn;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement passwordInputbox;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement signInBtn;

    //accesstype returntype methodname(){}
    //String
    public String getSignInPageTitle() {
        return driver.getTitle();
    }
    //what is you name --> it will return what ever text is for that element
    public String getSignInText() {
        String text=  signInText.getText();
        System.out.println(text);
        return text;
    }

    //boolean
    public boolean isSignInTextDisplayed(){
        return signInText.isDisplayed();
    }

    //click and whenYouwantToEnterInput
    public void enterEmailId(String email){
        emailInputBox.sendKeys(email);
    }
    public void clickConitnueBtn() {
        continueBtn.click();
    }
    public void enterPassword(String pwd){
        passwordInputbox.sendKeys(pwd);
    }
    public void clickSignInSubmitBtn() {
        signInBtn.click();
    }



}