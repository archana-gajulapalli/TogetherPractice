$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/Search.feature");
formatter.feature({
  "name": "Search an item in menu section",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC_001_To search an item from women section in menu item",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page:\"URL\"",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I print all options in women section\"denim\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStep.iPrintAllOptionsInWomenSection(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"mainMenu\"]//a[@href\u003d\u0027/womens/\u0027]/../div/ul/li[1]/a\"}\n  (Session info: chrome\u003d94.0.4606.71)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027swathigudiasMBP\u0027, ip: \u00272a02:c7f:bb2d:f300:7585:49a1:bd87:ea67%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.71, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: /var/folders/85/q6_g238n48g...}, goog:chromeOptions: {debuggerAddress: localhost:49542}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 16db42dcd43393318390b747d5a31b76\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"mainMenu\"]//a[@href\u003d\u0027/womens/\u0027]/../div/ul/li[1]/a}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\n\tat pages.SearchPage.getSingleItem(SearchPage.java:64)\n\tat steps.SearchStep.iPrintAllOptionsInWomenSection(SearchStep.java:22)\n\tat ✽.I print all options in women section\"denim\"(file:src/test/features/Search.feature:5)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});