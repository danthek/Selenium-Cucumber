$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/Login.feature");
formatter.feature({
  "name": "Login to App",
  "description": "In roder to test the Login Page\nAs a registered user\nI want to verify login conditions",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "Open chrome browser and enter url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.open_chrome_browser_and_enter_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter valid userName",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.enter_valid_userName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type the correct Password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.type_the_correct_password()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BadCreds"
    }
  ]
});
formatter.step({
  "name": "Open browser and visit site",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.open_browser_and_visit_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter wrong credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.Enter_wrong_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on forgot your password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.click_on_forgot_your_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("./features/WithOutline.feature");
formatter.feature({
  "name": "Purchase the order from Ecommerce website",
  "description": "In roder to use an scenario Outline with Login Page\nAs a random user\nI want to run it with outline scenarios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Testing good and bad creds login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@withOutline"
    }
  ]
});
formatter.step({
  "name": "The user enters the web page",
  "keyword": "Given "
});
formatter.step({
  "name": "he logins with his name:  \u003cname\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "enters the password: \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "password"
      ]
    },
    {
      "cells": [
        "rahul",
        "rahulshettyacademy"
      ]
    },
    {
      "cells": [
        "Berenice",
        "FailPassword"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing good and bad creds login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@withOutline"
    }
  ]
});
formatter.step({
  "name": "The user enters the web page",
  "keyword": "Given "
});
formatter.match({
  "location": "OutLineLoginStepDef.The_user_enters_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he logins with his name:  rahul",
  "keyword": "When "
});
formatter.match({
  "location": "OutLineLoginStepDef.he_logins_with_his_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters the password: rahulshettyacademy",
  "keyword": "Then "
});
formatter.match({
  "location": "OutLineLoginStepDef.enters_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing good and bad creds login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@withOutline"
    }
  ]
});
formatter.step({
  "name": "The user enters the web page",
  "keyword": "Given "
});
formatter.match({
  "location": "OutLineLoginStepDef.The_user_enters_the_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he logins with his name:  Berenice",
  "keyword": "When "
});
formatter.match({
  "location": "OutLineLoginStepDef.he_logins_with_his_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters the password: FailPassword",
  "keyword": "Then "
});
formatter.match({
  "location": "OutLineLoginStepDef.enters_the_password(String)"
});
formatter.result({
  "status": "passed"
});
});