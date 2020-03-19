package Steps;

import Utility.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.GlobalUserManagement;

public class UserManagementStep {
    private BaseUtil base;
    GlobalUserManagement globalUserManagement;

    // Constructor
    public UserManagementStep(BaseUtil base) {
        this.base = base;
        globalUserManagement = new GlobalUserManagement(base.driver, base.wait);
    }

    @Then("^I click on User management option from the top navigation bar$")
    public void iClickOnUserManagementOptionFromTheTopNavigationBar() {
        this.globalUserManagement.ClickUserManagement();
    }

    @Then("^I click on the Silvervue option$")
    public void iClickOnTheSilvervueOption() {
        this.globalUserManagement.ClickSilvervueTab();
    }

    @Then("^I click on \\+Add User option$")
    public void iClickOnAddUserOption() {
        this.globalUserManagement.ClickAddUser();
    }

    @Then("^I choose the user Role$")
    public void iChooseTheUserRole() {
        this.globalUserManagement.ChooseUserRole();
    }

    @Then("^I enter other information of the user like \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iEnterOtherInformationOfTheUserLike(String arg0, String arg1, String arg2, String arg3){
        this.globalUserManagement.EnterUserInfo(arg0, arg1, arg2, arg3);
    }

    @Then("^I click on Send Invitation button$")
    public void iClickOnSendInvitationButton() {
        this.globalUserManagement.ClickSubmitInvitation();
    }

    @Given("^I enter the url of gmail$")
    public void iEnterTheUrlOfGmail() {
        this.globalUserManagement.getURL();
    }

    @Then("^I enter the login credential of gmail \"([^\"]*)\", \"([^\"]*)\"$")
    public void iEnterTheLoginCredentialOfGmail(String arg0, String arg1){
        this.globalUserManagement.EmailLogin(arg0, arg1);
    }
}
