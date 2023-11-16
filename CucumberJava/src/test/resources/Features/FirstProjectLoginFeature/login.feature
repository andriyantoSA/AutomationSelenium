@SmokeFeatures
Feature: Feature to test login Fungsionality

	@smoketest
  Scenario: Check login is successful with valid credentials
    Given user on login page
    When user input username and password
    And user click login button
    Then user navigate to home page
