Feature: Paying Bills

  Background:
    Given Navigate to Para Bank
    When Enter username and password and click login button

  Scenario Outline: Paying a Bill
    And Click
      | billPayButton |
    Then SendKeys
      | payeeName | <payeename> |
      | address2  | <address>   |
      | city2     | <city>      |
      | state2    | <state>     |
      | zipcode   | <zipcode>   |
      | phone     | <phone>     |
      | account   | <account>   |
      | verifyAcc | <verifyacc> |
      | amount    | <amount>    |

    And Click
      | sendPayment |
    Then Confrim order message
    And Click Accountoverview
    Then Click Accountacc
    And Price Comparison <billtype> Bill

    Examples:
      | payeename                  | address | city  | state | zipcode | phone      | account | verifyacc | amount | billtype    |
      | EnerjiSA Elektrik Faturasi | Turkiye | Adana | Seyhan | 01000   | 5444444444 | 118128  | 118128    | 85     | Electricity |
      | Su Faturasi Odeme          | Turkiye | Adana | Seyhan | 01000   | 5444444444 | 118128  | 118128    | 45     | Water       |
      | Dogalgaz Faturasi Odeme    | Turkiye | Adana | Seyhan | 01000   | 5444444444 | 118128  | 118128    | 120    | Natural Gas |