$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Jyothi G"
    }
  ],
  "line": 3,
  "name": "Fingertip Login test cases",
  "description": "",
  "id": "fingertip-login-test-cases",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@fingerTipLogin"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Validate login functionlity",
  "description": "",
  "id": "fingertip-login-test-cases;validate-login-functionlity",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user launches Url of fingertip",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user validate \"Sandbox: QASite\" in home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});