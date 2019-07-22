$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:cucumber/Purchase.feature");
formatter.feature({
  "name": "TestMe App",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Purchase Headphone",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I go to All \"categories\"",
  "keyword": "When "
});
formatter.match({
  "location": "Purchase.i_go_to_All_Categories(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to Electronics",
  "keyword": "And "
});
formatter.match({
  "location": "Purchase.i_go_to_Electronics()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Headphones and add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Purchase.click_on_Headphones_and_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Payment page appears",
  "keyword": "Then "
});
formatter.match({
  "location": "Purchase.payment_page_appears()"
});
formatter.result({
  "status": "passed"
});
});