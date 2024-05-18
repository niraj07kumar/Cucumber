@tag
Feature: Amazon Search

  @tag1
  Scenario: Amazon search laptops
    Given Browser is open
    And User is on "https://www.amazon.in/" page
    When user enters "Laptops" in search textbox
    And Click on search button
    Then Results should display