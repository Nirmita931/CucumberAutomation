@01_SnfCreation
Feature: Provider Creation SNF

  Background:
    Given I click on login after entering username "nirmita@gmail.com" and password "Orange1!"
    Then I click on Create Account Button
    Then I choose "skilledNursing" transitional care type

  Scenario Outline: Create a Skilled Nursing Facility from the admin portal with only required information
    Then I enter the Basic Information for the SNF facility as "<DisplayName>", "<LegalName>", "<PreviousName>", "<PhoneNumber>", "<FaxNumber>", "<Address>", "<City>", "<ZIP>", "<NPI>"
    And I click on the submit button
    And I log out of the Admin Portal

    Examples:
      | DisplayName                | LegalName                   | PreviousName                   | PhoneNumber | FaxNumber  | Address           | City           | ZIP   | NPI  |
      | New SNF Name Required Info |                             |                                | 9848976547  |            | 4763  Kemper Lane | Salt Lake City | 84070 |      |
      | New SNF All Info           | New SNF All Info Legal Name | New SNF All Info Previous Name | 9087653456  | 7623415643 | 4763  Kemper Lane | Salt Lake City | 84117 | 0001 |
