@account_summary
Feature: Account summary page verification

  Scenario: Account summary page should have the title Zero – Account summary.
    Given user is on the login page
    When authorized user logs in
    Then user should verify that title is Zero - Account Summary

  Scenario: Account summary page should have to following account types: Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts.
    Given user is on the login page
    When authorized user logs in
    Then user should verify that page page has Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts account types.

  Scenario: Credit Accounts table must have columns Account, Credit Card and Balance.
    Given user is on the login page
    When authorized user logs in
    Then user should verify that Credit Accounts table must have columns Account, Credit Card and Balance.
