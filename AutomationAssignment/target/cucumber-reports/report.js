$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/OrderProduct.feature");
formatter.feature({
  "name": "Order Product Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as a authenticated user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Login Page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_navigates_to_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and Password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_enters_username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a Product to Cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Product page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderProduct.user_is_on_Product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds a Product in cart",
  "keyword": "When "
});
formatter.match({
  "location": "OrderProduct.user_adds_a_Product_in_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "success message of Product added is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProduct.success_message_of_Product_added_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Order Product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is ready to order",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderProduct.user_is_ready_to_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "OrderProduct.clicks_on_Proceed_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Shopping cart summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProduct.verify_Shopping_cart_summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Proceed to checkout2",
  "keyword": "When "
});
formatter.match({
  "location": "OrderProduct.clicks_on_Proceed_to_checkout2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Address page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProduct.verify_Address_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Shipping page",
  "keyword": "And "
});
formatter.match({
  "location": "OrderProduct.verify_Shipping_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProduct.verify_Payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete Order",
  "keyword": "And "
});
formatter.match({
  "location": "OrderProduct.complete_Order()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Order history",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Order Confirmation page",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderProduct.user_is_on_Order_Confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify order history",
  "keyword": "When "
});
formatter.match({
  "location": "OrderProduct.user_verify_order_history()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies ordered Product",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProduct.user_verifies_ordered_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Quit Browser",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderProduct.Browser_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderProduct.Close_Browser()"
});
formatter.result({
  "status": "passed"
});
});