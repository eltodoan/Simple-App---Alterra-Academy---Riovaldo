
@login @android
Feature: Login feature

  @positive
   Scenario: Verify user successfully login with valid credentials
     Given User at login page
     When  User input username with admin
     And   User input password with admin
     And   User click sign in or register button
     Then  User login successfully

  @negative
    Scenario Outline: Verify unsuccessfully login while user enter invalid credentials
      Given User at login page
      When  User input username with <username>
      And   User input password with <password>
      And   User click sign in or register button
      Then  User unsuccessfully login
      Examples:
        |username|password|
        |barca   |barca   |
        |12345   |12345   |
        |@#$%    |@#$%    |





