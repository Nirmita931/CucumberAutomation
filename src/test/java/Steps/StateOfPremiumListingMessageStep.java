package Steps;

import Utility.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pages.ProviderEdit;

public class StateOfPremiumListingMessageStep extends BaseUtil {

    private BaseUtil base;
    ProviderEdit provider;

    // Constructor
    public StateOfPremiumListingMessageStep(BaseUtil base) {
        this.base = base;
        provider = new ProviderEdit(base.driver, base.wait);
    }

    @Then("^I select \"([^\"]*)\" provider of id \"([^\"]*)\" from the dropdown menu$")
    public void iSelectProviderOfIdFromTheDropdownMenu(String arg0, String arg1) throws Throwable {
        this.provider.selectPac(arg0, arg1);
    }

    @Then("^I verify the current no premium listing message$")
    public void iVerifyTheCurrentNoPremiumListingMessage() {
        this.provider.checkCurrentNoPremiumListingMessage();
    }

    @Then("^I verify the current some premium listing message$")
    public void iVerifyTheCurrentSomePremiumListingMessage() {
        this.provider.checkCurrentSomePremiumListingMessage();
    }

    @Then("^I verify the current national listing message$")
    public void iVerifyTheCurrentNationalListingMessage() {
        this.provider.checkNationalListingMessage();
    }

    @Then("^I verify the potential no premium listing message$")
    public void iVerifyThePotentialNoPremiumListingMessage() {
        this.provider.checkPotentialPremiumMessage();
    }

    @Then("^I verify the potential Some premium listing message$")
    public void iVerifyThePotentialSomePremiumListingMessage() {
        this.provider.checkPotentialPremiumMessage();
    }
}
