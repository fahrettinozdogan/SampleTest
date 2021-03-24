@smoke
Feature: Testing login functionality

  Scenario Outline: User checks login functionality with valid credentionals
    Given User is on login page
    When User enters <username> and <password>
    And User clicks on login button
    Then User is navigated to the homepage

    Examples:
      | username | password |
      | Fahri    | 12345    |
      | Hakan    | 12345    |