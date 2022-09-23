$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/Login.feature");
formatter.feature({
  "name": "Login to App",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
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
  "location": "LoginStepDef.enter_search_criteria()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type the correct Password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
});