Feature: user should be able to verify currency change successfully
  @currencyChange
  Scenario: user should be able to see currency change in products
    Given user can change currency
    Then user should be able to see price changed with symbol change
