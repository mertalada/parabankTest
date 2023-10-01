Feature: Register Functionality

  @Smoke @Regression @Accounts
  Scenario:Create a new Register
    Given Navigate to URL
    When Enter the required information for registration
    Then User should login successfully