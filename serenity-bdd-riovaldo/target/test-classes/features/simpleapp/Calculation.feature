@calculation @android
Feature: Calculation function

  Background:
    Given User at login page
    When  User input username with admin
    And   User input password with admin
    And   User click sign in or register button


  @positive
  Scenario Outline: Validate calculator default function (+) with valid data
    Given User login successfully
    When  User input data <data a> on first field
    And   User input data <data b> on second field
    And   User Tap equal button
    Then  Accurate result appear
    Examples:
      |data a|data b |
      |10    |10     |


  @positive
  Scenario Outline: Validate math function (-) with valid data
    Given User login successfully
    When  User input data <data a> on first field
    And   User input data <data b> on second field
    And   User tap arrow button
    And   User set method (-)
    And   User Tap equal button
    Then  Accurate subtraction result appear

    Examples:
      |data a|data b |
      |10    |10     |
  @positive
  Scenario Outline: Validate math function (:) with valid data
    Given User login successfully
    When  User input data <data a> on first field
    And   User input data <data b> on second field
    And   User tap arrow button
    And   User set method division (:)
    And   User Tap equal button
    Then  Accurate division result appear
    Examples:
      |data a|data b |
      |100   |100    |

  @positive
  Scenario Outline: Validate math function (x) with valid data
    Given User login successfully
    When  User input data <data a> on first field
    And   User input data <data b> on second field
    And   User tap arrow button
    And   User set method multiplication (x)
    And   User Tap equal button
    Then  Accurate multiplication result appear
    Examples:
      |data a|data b |
      |100   |100    |