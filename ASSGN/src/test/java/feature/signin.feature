
Feature: Testing Signin feature

  Background: 
    Given User should be on e-com website url "https://www.demoblaze.com/"
    When User to click on login button

  @Unit
  Scenario: Testing signing feature for E-commerce website
    Then login dialog box should be displayed.

  @Smoke
  Scenario Outline: 
    And User to enter valid <user_name> and <passwrd>
    And Click on Login
    Then User must be on "#nameofuser"

    Examples: 
      | user_name | passwrd  |
      | Rahul12121265     | Rah12121256     |
      | Dileep    | Dileep123 |
      | 121212   | 121212  |

