@CreateProvider
  Feature: Provider Creation
    Scenario Outline: Create a PAC provider from the admin portal
      Given I click on login after entering username "nirmita@gmail.com" and password "Orange1!"
      Then I click on Create Account Button
      Then I choose "<FacilityType>" transitional care type
      Then I enter the Basic Information of the SNF facility as "<SNFLegalName>", "<SNFPhoneNumber>", "<SNFAddress>", "<SNFCity>", "<SNFZIP>", "<ServiceArea>"
      And I click on submit the new facility creation and logout
      Examples:
        | FacilityType   | SNFLegalName         | SNFPhoneNumber | SNFAddress    | SNFCity        | SNFZIP | ServiceArea |
        | skilledNursing | Seva New SNF Name 01 | 9848976547     | Dummy Address | Salt Lake City | 84070  | na          |
        | homeHealth     | Seva New HH Name 01  | 9848976547     | Dummy Address | Salt Lake City | 84070  | 84117       |

