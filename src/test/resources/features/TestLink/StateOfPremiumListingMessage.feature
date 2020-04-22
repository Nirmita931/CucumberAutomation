@MessageOfPremiumListingState
Feature: States of Premium Listing

  Background:
    Given I enter username "nirmita931@gmail.com" and password "Password1!" for PAC Login

  @NoPremiumListingCurrentMessage
  Scenario Outline: Verify current message for no premium listing
    Then I select "<facilityName>" provider of id "<facilitySVID>" from the dropdown menu
    Then I click on Premium Listing option from sub-left navigation bar
    Then I verify the current no premium listing message
    Examples:
      | facilityName             | facilitySVID |
      | Automation test facility | 31-49-102290 |

  @SomePremiumListingCurrentMessage
  Scenario Outline: Verify current message for some premium listing
    Then I select "<facilityName>" provider of id "<facilitySVID>" from the dropdown menu
    Then I click on Premium Listing option from sub-left navigation bar
    Then I verify the current some premium listing message
    Examples:
      | facilityName | facilitySVID |
      | A new snf    | 31-49-102309 |

  @NationalListingCurrentMessage
  Scenario Outline: Verify current and potential message for national listing
    Then I select "<facilityName>" provider of id "<facilitySVID>" from the dropdown menu
    Then I click on Premium Listing option from sub-left navigation bar
    Then I verify the current national listing message
    Examples:
      | facilityName  | facilitySVID |
      | lamjung snf_1 | 31-49-102262 |

  @PotentialNoPremiumListing
  Scenario Outline: Verify potential message for No premium listing
    Then I select "<facilityName>" provider of id "<facilitySVID>" from the dropdown menu
    Then I click on Premium Listing option from sub-left navigation bar
    Then I verify the potential no premium listing message
    Examples:
      | facilityName             | facilitySVID |
      | Automation test facility | 31-49-102290 |

  @PotentialSomePremiumListing
  Scenario Outline: Verify potential message for Some premium listing
    Then I select "<facilityName>" provider of id "<facilitySVID>" from the dropdown menu
    Then I click on Premium Listing option from sub-left navigation bar
    Then I verify the potential Some premium listing message
    Examples:
      | facilityName | facilitySVID |
      | A new snf    | 31-49-102309 |