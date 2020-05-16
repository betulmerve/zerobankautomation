@login
Feature: Login
  As a user, I want to be able to login with username and password

  Background: open main page and go to login page
    Given user is on the login page

  Scenario: Login with valid credentials and verify that Account summary page is displayed
    When authorized user logs in
    Then user should verify that title is Zero - Account Summary

  Scenario: Login with wrong username and verify that error message is displayed
    When user logs in with wrong username
    Then user should verify that error message is displayed

  Scenario: Login with wrong password and verify that error message is displayed
    When user logs in with wrong password
    Then user should verify that error message is displayed

  Scenario: Login with blank username and verify that error message is displayed
    When user logs in with blank username
    Then user should verify that error message is displayed

  Scenario: Login with blank password and verify that error message is displayed
    When user logs in with blank password
    Then user should verify that error message is displayed






