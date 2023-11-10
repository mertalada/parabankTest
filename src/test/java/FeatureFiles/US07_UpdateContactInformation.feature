Feature:Contact_Regression

  Background:
    Given Navigate to Para Bank
    When Enter username and password and click login button

  Scenario:Contact_Regression
    When Should be click update button
    Then SendKeys
      | customerName     | Team      |
      | customerLastname | Dort       |
      | customerAddress  | Adana      |
      | customerCity     | Adana      |
      | customerState    | Seyhan     |
      | customerZipcode  | 01000      |
      | customerPhone    | 5444444444 |
    And Click
      | updateButton |

    Then Should be see uptade message
    And Click
      | logout |
    When SendKeys
      | loginUser     | TeamDort4 |
      | loginPassword | Testing12       |
    Then Click
      | logInButton |
    When Should be click update button
    Then Checking the entered information

  Scenario: Contact_Regression Negavite
    When Should be click update button
    Then Clear firstname,lastName,city
    And Click
      | updateButton |
    Then Should be see errormessage
    And Click
      | logout |
    When SendKeys
      | loginUser     | TeamDort4 |
      | loginPassword | Testing12       |
    Then Click
      | logInButton |
    When Should be click update button
    Then Checking the entered information