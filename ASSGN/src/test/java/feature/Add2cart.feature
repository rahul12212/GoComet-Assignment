
@tag
Feature: Testing add to cart feature

  Background: 
    Given User must be logged in on "https://www.demoblaze.com/" and on "#nameofuser" page

  @tag1
  Scenario: User should Add items to cart
    When User click on Categories option
    And Add one Phone, one Laptop and a Monitor to Cart
    Then User should see a propmt message "Product added." and click ok.

  Scenario: User should place order successfully.
    When User click on cart option
    And User click on Place order button
    Then Dialog box should open to enter details to place order
    And after clicking on purchase. User must see successful message saying "Thank you for your purchase!"
