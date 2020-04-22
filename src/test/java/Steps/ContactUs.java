package Steps;

import Utility.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pages.ProviderEdit;

public class ContactUs extends BaseUtil {

    private BaseUtil base;
    ProviderEdit providerEdit;

    public ContactUs(BaseUtil base) {
        this.base = base;
        providerEdit = new ProviderEdit(base.driver, base.wait);
    }

    @Then("^I click on Contact Us icon from the left navigation bar$")
    public void iClickOnContactUsIconFromTheLeftNavigationBar() throws InterruptedException {
        this.providerEdit.clickContactUs();
    }

    @Then("^I fill in the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iFillInTheAnd(String arg0, String arg1) throws Throwable {
        this.providerEdit.contactUsContents(arg0, arg1);
    }

    @Then("^I click on Send button$")
    public void iClickOnSendButton() {
        this.providerEdit.clickSendButton();
    }
}
