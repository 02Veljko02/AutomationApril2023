Feature: login test 1
Scenario: User enter wrong username and valid password
Given the user is on login page
When the user enters invalid username and valid password
And click submit button
Then the user should see message Your username is invalid!