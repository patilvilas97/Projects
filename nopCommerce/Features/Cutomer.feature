Feature: Customer

Scenario: Add a new customer
		Given User Launches Chrome Browser
		When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enter Email as "admin@yourstore.com" and password as "admin"
    And User click login
    Then User can view Dashboard
    When User clicks on Customer Menu
    And User click on Menu Item
    And click on Add new customer Page
    Then User can View Add customer Page
    When User enters customer info
    And Click on Save button
    Then User can view confirmation message "The new customer has beeen added successfully."
    And close browser