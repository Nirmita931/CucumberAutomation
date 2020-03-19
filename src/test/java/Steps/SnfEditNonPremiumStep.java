package Steps;

import Utility.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import pages.ProviderEdit;

import java.util.List;

public class SnfEditNonPremiumStep extends BaseUtil {

    private BaseUtil base;
    ProviderEdit providerEdit;

    // Constructor
    public SnfEditNonPremiumStep(BaseUtil base) {
        this.base = base;
        providerEdit = new ProviderEdit(base.driver, base.wait);
    }
    @Then("^I choose \"([^\"]*)\" care type$")
    public void iChooseCareType(String arg0) throws Throwable {
        this.providerEdit.ChooseTransitionalType(arg0);
    }
    @Then("^I search for the facility on the search field with name \"([^\"]*)\"$")
    public void iSearchForTheFacilityOnTheSearchFieldWithName(String arg0){
        this.providerEdit.SearchForFacility(arg0);
    }
    @Then("^I click on the facility from the dropdown$")
    public void iClickOnTheFacilityFromTheDropdown() {
        this.providerEdit.ClickFacility();
    }
    @Then("^I select Insurance In-Network option from the sub-left navigation bar$")
    public void iSelectInsuranceInNetworkOptionFromTheSubLeftNavigationBar() {
        this.providerEdit.InsuranceInNetworkClick();
    }
    @Then("^I search and select for the insurance$")
    public void iSearchAndSelectForTheInsurance(DataTable dt) {
        List<String> list = dt.asList(String.class);
        this.providerEdit.SearchInsurance(list.get(0));
        this.providerEdit.SelectInsurance();
        this.providerEdit.SearchInsurance(list.get(1));
        this.providerEdit.SelectInsurance();
    }
    @Then("^I click on Save Changes button and verify the snackbar message$")
    public void iClickOnSaveChangesButtonAndVerifyTheSnackbarMessage() throws InterruptedException {
        this.providerEdit.saveChanges();
        this.providerEdit.checkForConfirmation();
    }
    @Then("^I click on the Services option from the sub-left navigation bar$")
    public void iClickOnTheServicesOptionFromTheSubLeftNavigationBar() {
        this.providerEdit.ServicesOfferedClick();
    }
    @Then("^I search and select for the service$")
    public void iSearchAndSelectForTheService(DataTable dt) {
        List<String> list = dt.asList(String.class);
        this.providerEdit.SearchServices(list.get(0));
        this.providerEdit.SelectService();
        this.providerEdit.SearchServices(list.get(1));
        this.providerEdit.SelectService();
    }
    @Then("^I click on Standard Listing option from the left nav bar$")
    public void iClickOnStandardListingOptionFromTheLeftNavBar() {
        this.providerEdit.SelectStandardListing();
    }
    @Then("^I should fill all information \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iShouldFillAllInformation(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        this.providerEdit.EnterStandardInfo(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
}
