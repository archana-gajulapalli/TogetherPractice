$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/AddToCart_Successful.feature");
formatter.feature({
  "name": "Home page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "I am background for amazon web application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "accept cookie",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.clickCookiesAccept()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.isLogoDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "test womens department braclet",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I search for: \"jewellery\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.enterSearchCriteria(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on department womens braclet",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.clickCategoryNecklace()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/features/SuccessfulSignIn.feature");
formatter.feature({
  "name": "SignIN Happy path",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "I am background for amazon web application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.isLogoDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_signIn Successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I click sign in btn",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.clickSignInBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify sign page title:\"Amazon Sign In\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInPageStep.iVerifySignInPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify \"Sign-In\" Text is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.iVerifyTextIsDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email address:\"demoT2728@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.iEnterEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click continue btn",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.iClickContinueBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password:\"checkme123@\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.iEnterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click pwd sign In Btn",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.clickSignInBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/features/unsuccessfulSignIn.feature");
formatter.feature({
  "name": "signIn Un-Happy path",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "I am background for amazon web application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.isLogoDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tc_02_signIn Unsuccessful with invalid Username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I click sign in btn",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.clickSignInBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify \"Sign-In\" Text is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInPageStep.iVerifyTextIsDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email address:\"demot@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.iEnterEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click continue btn",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.iClickContinueBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify error message is\"We cannot find an account with that e-mail address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInPageStep.iVerifyErrorMessageIs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "I am background for amazon web application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if logo is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.isLogoDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tc_03_signIn Unsuccessful with invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I click sign in btn",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.clickSignInBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify \"Sign-In\" Text is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInPageStep.iVerifyTextIsDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email address:\"demoT2728@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.iEnterEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click continue btn",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.iClickContinueBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password:\"checkme12\"",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.iEnterPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click pwd sign In Btn",
  "keyword": "And "
});
formatter.match({
  "location": "SignInPageStep.clickSignInBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify error message is\"Your password is incorrect\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInPageStep.iVerifyErrorMessageIs(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"auth-error-message-box\"]//span\"}\n  (Session info: chrome\u003d95.0.4638.69)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027swathigudiasMBP\u0027, ip: \u00272a02:c7f:bb2d:f300:74b0:93e7:e7ee:5381%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002711.6.1\u0027, java.version: \u002717.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.69, chrome: {chromedriverVersion: 95.0.4638.17 (a9d0719444d4b..., userDataDir: /var/folders/_9/6mc43dsd49s...}, goog:chromeOptions: {debuggerAddress: localhost:50523}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f61da5e190dc8a1d637050ee93fa313b\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"auth-error-message-box\"]//span}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat jdk.proxy2/jdk.proxy2.$Proxy19.getText(Unknown Source)\n\tat pages.SignInPage.getErrorMessageText(SignInPage.java:61)\n\tat steps.SignInPageStep.iVerifyErrorMessageIs(SignInPageStep.java:30)\n\tat ✽.I verify error message is\"Your password is incorrect\"(file:src/test/features/unsuccessfulSignIn.feature:23)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});