@AddInsurance
Feature: AddInsurance
  Scenario: Add Insurance
    Given I am logged in with username "nirmita@gmail.com" and password "Orange1!"
    When I click on Insurance option
    And I click on Add Insurance button
    And I enter the reqiured info like Health System with "New Insurance", Insurance Co. with "Insurance Co", Network with "Insurance Network"
    And I select Insurance Name to Display
    And I click on Save button
    And I enter the newly created insurance which is "New Insurance" on the search bar
    Then I should be able to see the newly created insurance displayed on the list and delete it
    And I should be logged out of the Admin Portal