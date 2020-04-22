@PacUserManagement
Feature: PAC User Management

  Background:
    Given I enter username "nirmita931@gmail.com" and password "Password1!" for PAC Login
#    Then I click on User management icon from the left navigation bar

  @ContactUsForm
  Scenario Outline: Contact Us Form
    Then I click on Contact Us icon from the left navigation bar
    Then I fill in the "<subject>" and "<message>"
    Then I click on Send button
    Then I click on Save Changes button and verify the snackbar message
    Then I log out of the PAC portal
      Examples:
        | subject | message |
        | sub     | test    |

#  @AddPacUser
#  Scenario Outline: Add new PAC user
#    Then I click on Add User button
#    Then I enter the "<firstname>", "<lastname>", "<email>", "<ccEmail>"
#    Then I click on Add and Close button
#    Then I log out of PAC portal
#    Examples:
#      | firstname | lastname | email   | ccEmail |
#      | Test      | Name    | test@test.com | e@c.com |
#  @EditPacUser
#  Scenario Outline: Edit a PAC User
#    Then I click on edit button
#    Then I edit the user information "<firstname>", "<lastname>"
#    Then I click on Save and Close button
#    Then I log out of PAC portal
#  Examples:
#    | firstname | lastname   |
#    | penelope1  | clearWater |


#  @ResendInviteToPacUser
#  Scenario: Resend Invite to a PAC User
#    Then I click on resend invite button
#      | sds sfg |
#    Then I send the invitation to the user
#    Then I log out of PAC portal
#
#  @DeletePacUser
#  Scenario: Delete a PAC User
#    Then I click on Delete button
#    | sds sfg |
#    Then I click on Yes button
#    Then I log out of PAC portal



