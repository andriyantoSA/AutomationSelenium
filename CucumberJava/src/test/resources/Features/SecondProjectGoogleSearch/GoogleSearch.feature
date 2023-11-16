Feature: Feature to Test Google Search Functionality

  Scenario: Validate Google Search is Working
    Given Browser is Open
    When User is on Google Search Page
    And User enter a text in Search Box
    Then User Hits Enter
    And User is Navigate to Search Result