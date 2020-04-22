@userManagement
  Feature: User Management
#    Scenario Outline: Create SV Admin
#      Given I click on login after entering username "nirmita@gmail.com" and password "Orange1!"
#      Then I click on User management option from the top navigation bar
#      Then I click on the Silvervue option
#      Then I click on +Add User option
#      Then I choose the user Role
#      Then I enter other information of the user like "<email>", "<firstName>", "<lastName>", "<ccEmail>"
#      Then I click on Send Invitation button
#      Examples:
#        | email                 | firstName         | lastName         | ccEmail         |
#        | sampleemail@gmail.com | Sample First Name | Sample Last Name | nkc@sevadev.com |

    Scenario Outline: Verify SV Admin creation
      Given I enter the url of gmail
      Then I enter the login credential of gmail "<gemail>", "<gpassword>"
      Examples:
        | gemail               | gpassword       |
        | tester06@sevadev.com | tester@sevaDev6 |