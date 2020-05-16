@account_activity
Feature: Account activity page verification

  Scenario: Account activity page should have the title Zero – Account activity.
    Given user is on the login page
    When authorized user logs in
    And user navigates to Account Activity tab
    Then user should verify that title is Zero - Account Activity


  Scenario: Account drop down default option should be Savings.
    Given user is on the login page
    When authorized user logs in
    And user navigates to Account Activity tab
    Then user should verify that Account drop down default option is Savings.

  Scenario: Account drop down should have the following options: Savings, Checking, Loan, Credit Card, Brokerage.
    Given user is on the login page
    When authorized user logs in
    And user navigates to Account Activity tab
    Then user should verify that Account drop down has Savings, Checking, Loan, Credit Card, Brokerage options.

  Scenario: Transactions table should have column names Date, Description, Deposit, Withdrawal.
    Given user is on the login page
    When authorized user logs in
    And user navigates to Account Activity tab
    Then user should verify that Transactions table should have column names Date, Description, Deposit, Withdrawal.

