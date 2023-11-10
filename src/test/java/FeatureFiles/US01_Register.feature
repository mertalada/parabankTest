Feature: Register

  Scenario: Create a new account
    Given Navigate to website
    When User clicks on register button
    And User fills the necessary data
      | firstName       | Team             |
      | lastName        | Testing            |
      | address         | Adana |
      | city            | Adana        |
      | state           | Seyhan            |
      | zipCode         | 01000               |
      | phoneNumber     | 5444444444              |
      | ssn             | 111              |
      | userName        | TeamDort4        |
      | password        | Testing12               |
      | passwordConfirm | Testing12               |

    Then Successful message is displayed