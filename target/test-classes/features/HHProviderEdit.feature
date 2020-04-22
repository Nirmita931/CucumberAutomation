@EditProviderHH
Feature: Add Insurance and Services to HH
  Background:
    Given I enter username "nirmita931@gmail.com" and password "Password1!" for PAC Login

  Scenario Outline: Add standard information to HH
    Then I choose one facility from the dropdown "<ProviderName>"
    Then I select Insurance In-Network option from the sub-left navigation bar
    Then I search for the insurance
      | Coresource | 4C Medical Group | Aetna Assurant | Blue Advantage Medicare | Arkansas Medicaid |
    Then I click on Save Changes button and verify the snackbar message

    Then I click on the Services option from the sub-left navigation bar
    Then I search for the service
      | Behavioral Health | CNA | AA new service | Bereavement | Chaplain |
    Then I click on Save Changes button and verify the snackbar message
    Examples:
      | ProviderName  |
      | HH 01 New     |
      | Lamjung HH_01 |