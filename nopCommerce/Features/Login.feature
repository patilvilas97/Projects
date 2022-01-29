
Feature: Login
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given User Launches Chrome Browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And User enter Email as "admin@yourstore.com" and password as "admin"
    And User click login
    Then Page title should be "Dashboard / nopCommerce administration"
    When I click logout
    Then Page title should be "Your store. Login"
    And I close Browser

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
