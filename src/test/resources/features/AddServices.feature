@AddService
Feature: AddService
  Scenario: Add Services
    Given I click on login after entering username "nirmita@gmail.com" and password "Orange1!"
    Then I click on Services option
    And I click on Add Services button
    And I enter service name "New Service"
    And I choose some of the facilities
    And I click on Submit button
    And I enter the newly created service on the search bar which is "New Service"
    Then I should be able to see the newly created service displayed on the list and delete it
    And I log out of the Admin Portal