#Niraj Kumar
@tag
Feature: Feature to check login functionality
  I want to use this template for my feature file

  @tag1
  Scenario: Login with valid credentials
    Given user is on login page
    When user enter "username" and "password"
    And click on login button
    Then user should navigate to home page

  @tag2
  Scenario Outline: login with set of data
    Given user is on login page
    When user enter <username> and <password>
    And click on login button
    Then user should navigate to home page

    Examples: 
      | username  | 	password		|
      | "name1" 		|     "abc1234"		|
      | "name2" 		|     "abcd1234" 	| 