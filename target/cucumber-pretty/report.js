$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/REfeature/signup.feature");
formatter.feature({
  "name": "comments feature in Realestate application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify edit functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@edit_function"
    }
  ]
});
formatter.step({
  "name": "User clicks edit button",
  "keyword": "When "
});
formatter.step({
  "name": "User is directed to the edit comment box",
  "keyword": "Then "
});
formatter.step({
  "name": "User selects the text to be editted",
  "keyword": "And "
});
formatter.step({
  "name": "User selects any of one option\"\u003ceditoptions\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User selects update button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "editoptions"
      ]
    },
    {
      "cells": [
        "bold"
      ]
    },
    {
      "cells": [
        "italics"
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
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.fail(Assert.java:96)\r\n\tat REstepdefinition.stepdefinition.user_enter_username_and_password(stepdefinition.java:41)\r\n\tat ✽.User enter username and password(file:src/test/java/REfeature/signup.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is redirected to the dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.user_is_redirected_to_the_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User navigates to the comment section",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_navigates_to_the_comment_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify edit functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@edit_function"
    }
  ]
});
formatter.step({
  "name": "User clicks edit button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.user_clicks_edit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is directed to the edit comment box",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_is_directed_to_the_edit_comment_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User selects the text to be editted",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User selects any of one option\"bold\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User selects update button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_selects_update_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
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
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.fail(Assert.java:96)\r\n\tat REstepdefinition.stepdefinition.user_enter_username_and_password(stepdefinition.java:41)\r\n\tat ✽.User enter username and password(file:src/test/java/REfeature/signup.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is redirected to the dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.user_is_redirected_to_the_dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User navigates to the comment section",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_navigates_to_the_comment_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify edit functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@edit_function"
    }
  ]
});
formatter.step({
  "name": "User clicks edit button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.user_clicks_edit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is directed to the edit comment box",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_is_directed_to_the_edit_comment_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User selects the text to be editted",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User selects any of one option\"italics\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User selects update button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.user_selects_update_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});