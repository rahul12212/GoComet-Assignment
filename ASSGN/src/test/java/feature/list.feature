Feature: Listing products and product details on DemoBlaze

  Background: User must be on the homepage of the DemoBlaze website
    Given User must be on homepage of the E-commerce website by clicking "https://www.demoblaze.com/index.html"

  @Unit
  Scenario: User should be able to view a list of all products
    When User clicks on "Categories" link in the navigation bar.
    Then A list of all products should be displayed.

  @Smoke
  Scenario: User should be able to view the details of a single product
    When User clicks on the name of any product.
    Then The product details page should be displayed.
    And A single product should be displayed on the page.