package Steps;

import Utility.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CreateFacility;

public class SnfCreationStep extends BaseUtil{

    private BaseUtil base;
    CreateFacility createFacility;

    // Constructor
    public SnfCreationStep(BaseUtil base) {
        this.base = base;
        createFacility = new CreateFacility(base.driver, base.wait);
    }
    @Then("^I enter the Basic Information for the SNF facility as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iEnterTheBasicInformationForTheSNFFacilityAs(String displayname, String legalname, String previousname, String phonenumber, String faxnumber, String address, String city, String zip, String npi) throws InterruptedException {
        this.createFacility.ProviderBasicInfo(displayname, legalname, previousname, phonenumber, faxnumber, address, city, zip, npi);
        Thread.sleep(10000);
    }
    @And("^I click on the submit button$")
    public void iClickOnTheSubmitButton() {
        this.createFacility.SubmitSNFCreation();
    }
}
