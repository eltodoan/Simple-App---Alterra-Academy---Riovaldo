
@android
Feature: List Page

  Background:
    Given User at login page
    When User input username with admin
    And User input password with admin
    And User click sign in or register button
    When User login successfully

  @positive
  Scenario: Validate tapping list on three stripes button
    Given User tap three stripes button
    When User tap list menu
    Then list results showing up
    And User can scroll down all list content

  @positive
  Scenario: Validate taping three stripes button while user at list page
    Given User at list menu page
    When User tap three stripes button
    Then Menu banner showed up

  @positive
  Scenario: Validate double tap three stripes button while user at list page
    Given User tap three stripes button
    And   User tap list menu
    When  User at list menu page
    And   User double tap a content
    Then  User will stay at list page

  @positive
  Scenario: Validate long tap a content at list page
    Given User tap three stripes button
    And   User tap list menu
    Then  list results showing up
    And   Hold tap a content
    Then  User will stay at list page


