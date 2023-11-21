
Feature: Testing Sign-up button feature for E-commerce website

  Background: User must be on homepage of the E-commerce website
    Given User must be on homepage of the E-commerce website by clicking "https://www.demoblaze.com/"
    When User should click on signup button.

  @Unit
  Scenario: Clicking on Sign-up button on homepage.
    Then Sign-up dialog box should be displayed.

  @Smoke
  Scenario: User should be able to sign up with valid username and password.
    And Enter valid username and password
    And Click on signup
    Then A successful pop-up should be displayed saying "Sign up successful"
    And User should click on ok button.
