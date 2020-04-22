@ALoginTest
Feature: SVLogin
  Scenario: Login SV Admin
    Given I click on login after entering username "nirmit234a@gmail.com" and password "Orange1!"
    And I log out of the Admin Portal

#  Scenario: Login PAC Portal
#    Given I enter username "nirmita931@gmail.com" and password "Password1!" for PAC Login
#    And I log out of PAC portal
