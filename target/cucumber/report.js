$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Greenkart.feature");
formatter.feature({
  "line": 1,
  "name": "Greenkart Functions",
  "description": "",
  "id": "greenkart-functions",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Greenkart Purchaase",
  "description": "",
  "id": "greenkart-functions;greenkart-purchaase",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on greenkart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User searched for \"Cucumber\" vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinition.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "duration": 52466276607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 19
    }
  ],
  "location": "MyStepDefinition.user_searched_for_vegetable(String)"
});
formatter.result({
  "duration": 4600481910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "MyStepDefinition.results_are_displayed(String)"
});
formatter.result({
  "duration": 125414773,
  "status": "passed"
});
formatter.after({
  "duration": 847667853,
  "status": "passed"
});
});