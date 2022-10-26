
@calculator @android
Feature: Calculator Page
  Background:
    Given User at login page
    When  User input username with admin
    And   User input password with admin
    And   User click sign in or register button
    Then  User login successfully

@positive
  Scenario: Validate calculator main page
    Given  User login successfully
    Then First number field appear
    And  Arrow button appear
    And  Second number field appear
    And  Equal button appear
    And  Default result description appear

@positive
  Scenario: Validate calculator three stripes button
    Given User login successfully
    When  User tap three stripes button
    Then  Menu banner showed up
    And   Menu calculator and list showed up














