$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ssinha/eclipse-workspace/BidOne/src/main/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "BidOne Login Feature",
  "description": "",
  "id": "bidone-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "BidOne Login Test Scenarion",
  "description": "",
  "id": "bidone-login-feature;bidone-login-test-scenarion",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User is on the BidOne Loginpage and Title of the page is BidOne",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User logs into application",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User searches for Coconut Milk",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Search page is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Closes the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 9126504100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_BidOne_Loginpage_and_Title_of_the_page_is_BidOne()"
});
formatter.result({
  "duration": 7248800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_correct_username_and_password()"
});
formatter.result({
  "duration": 2770492500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_searches_for_Coconut_Milk()"
});
formatter.result({
  "duration": 1269819500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.search_page_is_displayed()"
});
formatter.result({
  "duration": 1708362400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.closes_the_application()"
});
formatter.result({
  "duration": 629270600,
  "status": "passed"
});
});