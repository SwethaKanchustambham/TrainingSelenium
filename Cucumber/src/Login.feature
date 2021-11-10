Feature: Login Feature

  @smoke @regression
  Scenario: Login with valid Username Password
    Given User Navigate to Website


    When  User Enters Valid Username Password

    And User Clicks Login Button

    Then User Login Success

@regression
Scenario: Login WithOut UserName

    Given User Navigate to Website
