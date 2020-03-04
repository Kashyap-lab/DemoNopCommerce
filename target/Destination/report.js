$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addtocart.feature");
formatter.feature({
  "name": "verify Add To Cart Button Is Present On All Featured Product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Add To Cart Button Is Present On All Featured Product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addtocart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "verify Add To Cart Button Is Present On All Featured Product",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest1.MyStepdefs.verifyAddToCartButtonIsPresentOnAllFeaturedProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "All product has add to cart option",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest1.MyStepdefs.allProductHasAddToCartOption()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});