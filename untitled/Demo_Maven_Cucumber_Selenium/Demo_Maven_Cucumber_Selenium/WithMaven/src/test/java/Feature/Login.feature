Feature: Login Feature


  Scenario: Login with valid Username Password
    Given User Navigate to Website


    When  User Enters Valid Username Password

    And User Clicks Login Button

    Then User Login Success
