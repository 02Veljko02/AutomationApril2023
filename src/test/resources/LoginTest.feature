Feature: login test
  Scenario: User should be able to login with valid credentials
    Given the user is on login page
    When the user enters valid username and password
    And click submit button
    Then the user should see message You logged into a secure area!





