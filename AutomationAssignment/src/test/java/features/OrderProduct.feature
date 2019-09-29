Feature: Order Product Feature

  Scenario: Login as a authenticated user
    Given user is on homepage
    When user navigates to Login Page
    And user enters username and Password
        
  Scenario: Add a Product to Cart
    Given user is on Product page
    When user adds a Product in cart
    Then success message of Product added is displayed
        
  Scenario: Order Product
  	Given user is ready to order 
    When clicks on Proceed to checkout
    Then verify Shopping cart summary page
    When clicks on Proceed to checkout2
    Then verify Address page
    And verify Shipping page
    Then verify Payment page
    And complete Order
     
  Scenario: Verify Order history
    Given user is on Order Confirmation page
    When user verify order history
    Then user verifies ordered Product
    
  Scenario: Quit Browser
   	Given Browser is opened
   	Then Close Browser 
