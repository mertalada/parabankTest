Feature: Currency Transfer

  Background:
    Given Navigate to Para Bank
    When Enter username and password and click login button

  Scenario:User transfer currency
    When User clicks on transfer funds
    Then User fills their info
    And User clicks on transfer button
    Then User gets verify message