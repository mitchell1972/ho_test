$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature_one.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Wikipediia Search",
  "description": "",
  "id": "search;wikipediia-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I have launched my browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to wikipedia",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the text XXXXXXXX",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select English as the search language",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am on the search result page",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});