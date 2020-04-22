@02_SnfNonPremiumUpdate
Feature: Update Standard SNF Info

  Background:
    Given I click on login after entering username "nirmita@gmail.com" and password "Orange1!"
    Then I choose "skilledNursing" care type
    Then I search for the facility on the search field with name "A New SNF Facility"
    Then I click on the facility from the dropdown

  Scenario Outline: Update the Standard Information of recently created SNF in PAC portal.
    Then I should be directed to the PAC portal
    Then I select Insurance In-Network option from the sub-left navigation bar
    Then I search and select for the insurance
      | Coresource | 4C Medical Group |
    Then I click on Save Changes button and verify the snackbar message

    Then I click on the Services option from the sub-left navigation bar
    Then I search and select for the service
      | 1:1 Sitters | HIV/AIDS |
    Then I click on Save Changes button and verify the snackbar message

    Then I click on Standard Listing option from the left nav bar
    Then I should fill all information "<LegalName>", "<PreviousName>", "<NPI>", "<UniqueId>", "<FaxNumber>", "<Capacity>", "<Station>", "<Staff>"
    Then I click on Save Changes button and verify the snackbar message
    And I log out of the PAC portal
    Examples:
      | LegalName  | PreviousName  | NPI | UniqueId | FaxNumber  | Capacity | Station | Staff |
      | Legal Name | Previoud Name | 001 | 002      | 9872345178 | 500      | 50      | 5568  |
