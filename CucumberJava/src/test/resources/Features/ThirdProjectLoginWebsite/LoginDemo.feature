Feature: Test Login Functionality

  Scenario: Check Login is Successful with valid Credentials
    Given User Open Browser
    When User is on login Page
    And User enters username and password
		Then User Click Login
		And User is Navigate to the Home Page
