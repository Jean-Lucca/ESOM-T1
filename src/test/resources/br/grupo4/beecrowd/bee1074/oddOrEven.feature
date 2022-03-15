@domain
Feature: Odd Positive
  As a user
  I want to check if a number um odd positive, even positive, odd negative, even negative

  Scenario: Check if a number is odd positive
    Given the number 3
    Then the result should be "ODD POSITIVE"

  Scenario: Check if a number is even positive
    Given the number 2
    Then the result should be "EVEN POSITIVE"

  Scenario: Check if a number is odd negative
    Given the number -3
    Then the result should be "ODD NEGATIVE"

  Scenario: Check if a number is even negative
    Given the number -2
    Then the result should be "EVEN NEGATIVE"
  
  Scenario: Check if the number is zero
    Given the number 0
    Then the result should be "NULL"
  