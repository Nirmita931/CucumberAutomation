@silversearch
Feature: Silver Web
  Scenario Outline:
    Given I click on login after entering username "nirmita@gmail.com" and password "Orange1!"
    Then I click on Hospital tab
    Then I search for the hospital with its name "<HospitalName>" and click on it
    Then I click on SilverSearch option
    Then I choose a facility type from the dropdown
    Then I enter the zip code "<zip>"
    Then I select the miles
    Then I select insurance "<Insurance>"
#      Then I select service "<serviceName>"
    Then I click on Search button
    Then I click on the provider from the list and verify facility name ""
    Examples:
      | HospitalName                 | zip   | Insurance       |
      | Lamjung Hospital Sundarbazar | 84070 | Lamjung Service |