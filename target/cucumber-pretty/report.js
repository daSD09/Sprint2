$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/REfeature/signup.feature");
formatter.feature({
  "name": "comments feature in Realestate application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify search comment functionality by name, email id",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search_funtion"
    }
  ]
});
formatter.step({
  "name": "User clicks the search field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the name\"\u003cbh\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks the search button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "bh"
      ]
    },
    {
      "cells": [
        "yash@gmail.com"
      ]
    }
  ]
});
formatter.background({
  "name": "Verify Login functionality",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.user_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is redirected to the dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.user_is_redirected_to_the_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to the comment section",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_navigates_to_the_comment_section()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify search comment functionality by name, email id",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search_funtion"
    }
  ]
});
formatter.step({
  "name": "User clicks the search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.user_clicks_the_search_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the name\"yash@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.user_enters_the_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_clicks_the_search_button1()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});