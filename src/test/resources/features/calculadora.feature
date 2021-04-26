@stories
Feature: Perform an operation with the Windows calculator
  I as a User, I want to open the calculator, To perform basic operations

  @scenario1
  Scenario: Open the calculator
    Given Brandon is in the Windows calculator
    When he makes the sum
    Then  he should see the result

  @scenario2
  Scenario: Successful sum
    Given Brandon is in the Windows calculator
    When he makes the sum  of 6 and 8}
    Then he should see the result equal to 14

  @scenario3
  Scenario: Successful Subtract
    Given Brandon is in the Windows calculator
    When he makes the Subtract  of 6 and 8
    Then he should see the result equal to 12

  @scenario4
  Scenario: Successful division
    Given Brandon is in the Windows calculator
    When he makes the divide of 16 and 8
    Then he should see the result equal to 2