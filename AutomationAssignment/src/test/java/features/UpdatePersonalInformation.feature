Feature: Update personal information in My Accounts. Need to update first name of the user.

  Scenario: Login as a authenticated user
    Given user is on homepage
    When user navigates to Login Page
    And user enters username and Password
            
  Scenario: Update Account Information
    Given user is on Dashboard
    When user opens MyAccount page
    Then verify MyAccount page
    When user opens My Personal information
    Then verify Personal information page
    When user updates first name
    Then Personal Information gets updated
        
     
  Scenario: Quit Browser
   	Given Browser is opened
   	Then Close Browser 
