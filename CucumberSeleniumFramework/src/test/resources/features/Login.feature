
Feature: Login Functionality

  Background:
    Given User is on the login page

  @Smoke
  Scenario: Successful login
    When User enters valid username and password
    And User clicks on the login button
    Then User should be successfully logged in

  @Regression
  Scenario: Invalid login
    When User enters invalid username and password
    And User clicks on the login button
    Then User should see an error message
