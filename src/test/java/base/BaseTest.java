package base;

import helper.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;

public class BaseTest {
    protected HomePage homePageObj;
    protected SignInPage signInPageObj;
    protected ProductDescriptionPage productDescriptionPageObj;
    protected TopBlackActionPage topBlackActionPageObj;
    public static WebDriver driver;
    protected Utility util;

    public BaseTest(){
        homePageObj= PageFactory.initElements(driver, HomePage.class);
        signInPageObj= PageFactory.initElements(driver, SignInPage.class);
        productDescriptionPageObj= PageFactory.initElements(driver, ProductDescriptionPage.class);
        topBlackActionPageObj= PageFactory.initElements(driver,TopBlackActionPage.class);
        util = PageFactory.initElements(driver, Utility.class);


    }


}
