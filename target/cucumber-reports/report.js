$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PacUserManagement.feature");
formatter.feature({
  "line": 2,
  "name": "PAC User Management",
  "description": "",
  "id": "pac-user-management",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UserManagement"
    }
  ]
});
formatter.before({
  "duration": 7796942047,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I enter username \"nirmita931@gmail.com\" and password \"Password1!\" for PAC Login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on User management icon from the left navigation bar",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "nirmita931@gmail.com",
      "offset": 18
    },
    {
      "val": "Password1!",
      "offset": 54
    }
  ],
  "location": "LoginStep.iEnterUsernameAndPasswordForPACLogin(String,String)"
});
formatter.result({
  "duration": 58783397594,
  "status": "passed"
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnUserManagementIconFromTheLeftNavigationBar()"
});
formatter.result({
  "duration": 8310489534,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Add new PAC user",
  "description": "",
  "id": "pac-user-management;add-new-pac-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I click on Add User button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter the following information",
  "rows": [
    {
      "cells": [
        "name",
        "lname",
        "e@b.com",
        "e@c.com"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on Add and Close button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I log out of PAC portal",
  "keyword": "Then "
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnAddUserButton()"
});
formatter.result({
  "duration": 214448694,
  "status": "passed"
});
formatter.match({
  "location": "PACUserManagementStep.iEnterTheFollowingInformation(DataTable)"
});
formatter.result({
  "duration": 909948831,
  "status": "passed"
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnAddAndCloseButton()"
});
formatter.result({
  "duration": 5408093773,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iLogOutOfPACPortal()"
});
formatter.result({
  "duration": 2179808578,
  "status": "passed"
});
formatter.after({
  "duration": 282491321,
  "status": "passed"
});
formatter.before({
  "duration": 2682753912,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I enter username \"nirmita931@gmail.com\" and password \"Password1!\" for PAC Login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on User management icon from the left navigation bar",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "nirmita931@gmail.com",
      "offset": 18
    },
    {
      "val": "Password1!",
      "offset": 54
    }
  ],
  "location": "LoginStep.iEnterUsernameAndPasswordForPACLogin(String,String)"
});
formatter.result({
  "duration": 79873106767,
  "status": "passed"
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnUserManagementIconFromTheLeftNavigationBar()"
});
formatter.result({
  "duration": 8205847756,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Edit a PAC User",
  "description": "",
  "id": "pac-user-management;edit-a-pac-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I click on edit button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I edit the user information",
  "rows": [
    {
      "cells": [
        "penelope",
        "clearWater"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I click on Save and Close button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I log out of PAC portal",
  "keyword": "Then "
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnEditButton()"
});
formatter.result({
  "duration": 776556098,
  "status": "passed"
});
formatter.match({
  "location": "PACUserManagementStep.iEditTheUserInformation(DataTable)"
});
formatter.result({
  "duration": 868033048,
  "status": "passed"
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnSaveAndCloseButton()"
});
formatter.result({
  "duration": 5053091222,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iLogOutOfPACPortal()"
});
formatter.result({
  "duration": 2164874765,
  "status": "passed"
});
formatter.after({
  "duration": 234536514,
  "status": "passed"
});
formatter.before({
  "duration": 2710580175,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I enter username \"nirmita931@gmail.com\" and password \"Password1!\" for PAC Login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on User management icon from the left navigation bar",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "nirmita931@gmail.com",
      "offset": 18
    },
    {
      "val": "Password1!",
      "offset": 54
    }
  ],
  "location": "LoginStep.iEnterUsernameAndPasswordForPACLogin(String,String)"
});
formatter.result({
  "duration": 16575746973,
  "status": "passed"
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnUserManagementIconFromTheLeftNavigationBar()"
});
formatter.result({
  "duration": 8205300129,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Resend Invite to a PAC User",
  "description": "",
  "id": "pac-user-management;resend-invite-to-a-pac-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I click on resend invite button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I send the invitation to the user",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I log out of PAC portal",
  "keyword": "Then "
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnResendInviteButton()"
});
formatter.result({
  "duration": 1047982971,
  "status": "passed"
});
formatter.match({
  "location": "PACUserManagementStep.iSendTheInvitationToTheUser()"
});
formatter.result({
  "duration": 3835851503,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iLogOutOfPACPortal()"
});
formatter.result({
  "duration": 2176627178,
  "status": "passed"
});
formatter.after({
  "duration": 205203107,
  "status": "passed"
});
formatter.before({
  "duration": 2105850281,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I enter username \"nirmita931@gmail.com\" and password \"Password1!\" for PAC Login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on User management icon from the left navigation bar",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "nirmita931@gmail.com",
      "offset": 18
    },
    {
      "val": "Password1!",
      "offset": 54
    }
  ],
  "location": "LoginStep.iEnterUsernameAndPasswordForPACLogin(String,String)"
});
formatter.result({
  "duration": 146929319603,
  "status": "passed"
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnUserManagementIconFromTheLeftNavigationBar()"
});
formatter.result({
  "duration": 8204288817,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Delete a PAC User",
  "description": "",
  "id": "pac-user-management;delete-a-pac-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "I click on Delete button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I click on Yes button",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I log out of PAC portal",
  "keyword": "Then "
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnDeleteButton()"
});
formatter.result({
  "duration": 816529987,
  "status": "passed"
});
formatter.match({
  "location": "PACUserManagementStep.iClickOnYesButton()"
});
formatter.result({
  "duration": 4390333022,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iLogOutOfPACPortal()"
});
formatter.result({
  "duration": 2173195393,
  "status": "passed"
});
formatter.after({
  "duration": 316424570,
  "status": "passed"
});
});