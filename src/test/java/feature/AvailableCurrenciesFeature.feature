# Tags: available
@available
Feature: Available Currencies endpoint
  As an APP of currencies conversion
  I want a list of all available currencies
  To show it in my menu of currencies to convert

  Scenario: List all currencies available
    Given that I have access to the Currency Converter API
    When  I send the correct request to Get the List of All Currencies Available
    Then I will receive the list properly