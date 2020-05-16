@pay_bills
Feature: Pay bills page verification

  Scenario: Pay bills page should have the title Zero – Pay Bills.
    Given user is on the login page
    When authorized user logs in
    And user navigates to Pay Bills tab
    Then user should verify that title is Zero - Pay Bills


  Scenario: Complete a successful pay operation and verify message
    Given user is on the login page
    When authorized user logs in
    And user navigates to Pay Bills tab
    And user makes a payment successfully
    Then user should verify that submitted message is displayed

  Scenario: Make a payment without entering amount and verify message
    Given user is on the login page
    When authorized user logs in
    And user navigates to Pay Bills tab
    And user makes a payment without entering amount
    Then user should verify that fillout amount message is displayed

  Scenario: Make a payment without entering date and verify message
    Given user is on the login page
    When authorized user logs in
    And user navigates to Pay Bills tab
    And user makes a payment without entering date
    Then user should verify that fillout date message is displayed