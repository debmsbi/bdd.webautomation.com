$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/foxtest.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Time Entry And Lunch default login",
  "description": "",
  "id": "application-login;time-entry-and-lunch-default-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is on Time Entry And Lunch page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User login to application with company,username,password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Time Entry And Lunch page is populated",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Timesheet is displayed",
  "keyword": "And "
});
});