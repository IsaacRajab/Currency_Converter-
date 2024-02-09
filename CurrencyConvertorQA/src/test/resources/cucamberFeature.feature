Feature: Exchange Rate Calculation
  As an end-user
  I want to execute currency exchange operations
  So that I can view the result of the currency conversion

  Scenario: Conversion from USD to ILS
    Given I am present at the currency exchange portal
    When I fill in "100" in the amount field
    And I choose "United States Dollar" as the from currency
    And I choose "Israel new shekel" as the destination currency
    And I initiate the conversion process
    Then the converted value "374.24" should be displayed
    And the exchange rate "3.7424" should be visible
    Then I should exit the website

  Scenario: Conversion from ILS to USD
    Given I am present at the currency exchange portal
    When I fill in "100" in the amount field
    And I choose "Israel new shekel" as the from currency
    And I choose "United States Dollar" as the destination currency
    And I initiate the conversion process
    Then the converted value "26.56" should be displayed
    And the exchange rate "0.2656" should be visible
    Then I should exit the website

  Scenario: Conversion from RUB to ILS
    Given I am present at the currency exchange portal
    When I fill in "-1" in the amount field
    And I choose "Russian Ruble" as the from currency
    And I choose "Israel new shekel" as the destination currency
    And I initiate the conversion process
    Then the converted value "" should be displayed
    And the exchange rate "" should be visible
    Then I should exit the website