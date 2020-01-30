Feature: Pixel store pos

  Background: 
   Given Sales executive logged into the machine
   @Mercurytours
    Scenario:Registration MercuryTours
    Given user is on the home page
   When user provides the 
    
    @RegressionTest
   Scenario:Executive signup
   Given executive is at the signup registration
   When executive provides "admin" and "admin"
    Then signup successful
   @Smoke @RegressionTest
   Scenario:shopping cart
    Given executive added the items to cart
    When items price is calculated
   Then bill is generated with final amount
    @datadriven
Scenario:Search a product
When larry searches for a product in the search field
   | Head |
   | Hand |
   | Lap |
  
 @FunctionalTest
 Scenario Outline: sales executive login
   When Sales executive provides "<user>" and "<password>" as credentials
   Then Login is successful

  Examples: 
    | user    | password    |
     | Lalitha | password123 |
     | John    | Ravi123     |
