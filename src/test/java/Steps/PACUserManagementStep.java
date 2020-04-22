package Steps;

import Utility.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import pages.PacUserManagement;

import javax.xml.crypto.Data;
import java.util.List;

public class PACUserManagementStep {

    private BaseUtil base;
    PacUserManagement pacUserManagement;

    // Constructor
    public PACUserManagementStep(BaseUtil base) {
        this.base = base;
        pacUserManagement = new PacUserManagement(base.driver, base.wait);
    }

    @Then("^I click on User management icon from the left navigation bar$")
    public void iClickOnUserManagementIconFromTheLeftNavigationBar() throws InterruptedException {
        Thread.sleep(3000);
        this.pacUserManagement.clickUserManagement();

    }

    @Then("^I click on Add User button$")
    public void iClickOnAddUserButton() throws InterruptedException {
        this.pacUserManagement.clickAddUserButton();
    }

    @Then("^I enter the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iEnterThe(String arg0, String arg1, String arg2, String arg3) {
        this.pacUserManagement.fillUserInfo(arg0, arg1, arg2, arg3);
    }

    @Then("^I click on Add and Close button$")
    public void iClickOnAddAndCloseButton() throws InterruptedException {
        this.pacUserManagement.clickAddAndCloseButton();
    }

    @Then("^I click on edit button$")
    public void iClickOnEditButton() {
        this.pacUserManagement.clickEditUserButton();
    }

    @Then("^I edit the user information \"([^\"]*)\", \"([^\"]*)\"$")
    public void iEditTheUserInformation(String arg0, String arg1) throws Throwable {
        this.pacUserManagement.editUserInfo(arg0, arg1);
    }

    @Then("^I click on Save and Close button$")
    public void iClickOnSaveAndCloseButton() throws InterruptedException {
        this.pacUserManagement.clickSaveAndCloseButton();
        this.pacUserManagement.userEditConfirmation();
    }

    @Then("^I click on resend invite button$")
    public void iClickOnResendInviteButton(DataTable dt) {
        List<String> list = dt.asList(String.class);
        this.pacUserManagement.clickResendInvite(list.get(0));
    }

    @Then("^I send the invitation to the user$")
    public void iSendTheInvitationToTheUser() throws InterruptedException {
        this.pacUserManagement.resendInvitation();
    }

    @Then("^I click on Delete button$")
    public void iClickOnDeleteButton(DataTable dt) {
        List<String> list = dt.asList(String.class);
        this.pacUserManagement.clickDeleteOption(list.get(0));
    }

    @Then("^I click on Yes button$")
    public void iClickOnYesButton() throws InterruptedException {
        this.pacUserManagement.clickYesButton();
    }



}
