$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/HomePage.feature");
formatter.feature({
  "name": "Home page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "iam background for amazon .....this is just name no execution",
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
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for: \"jewellery\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.enetrSearchCriteria(String)"
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
});