Feature: Login testing

  Scenario: User on login page
    Given user is on login page
    When user entered crn
    And user enters mpin
    Then able to do successful login
