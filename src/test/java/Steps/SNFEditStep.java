package Steps;

import Utility.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.ProviderEdit;

import java.util.List;

public class SNFEditStep extends BaseUtil {

    private BaseUtil base;
    ProviderEdit providerEdit;

    public SNFEditStep(BaseUtil base) {
        this.base = base;
        providerEdit = new ProviderEdit(base.driver, base.wait);
    }

    @Then("^I search the recently created SNF facility \"([^\"]*)\" from the search bar$")
    public void iSearchTheRecentlyCreatedSNFFacilityFromTheSearchBar(String arg0) {
        this.providerEdit.SearchForFacility(arg0);
    }

    @Then("^I click on the facility displayed on the dropdown list$")
    public void iClickOnTheFacilityDisplayedOnTheDropdownList() {
        this.providerEdit.ClickFacility();
    }


    @Then("^I should be directed to the PAC portal$")
    public void iShouldBeDirectedToThePACPortal() {
        this.providerEdit.YourListingPage();
    }



    @Then("^I search for the insurance$")
    public void iSearchForInsurance(DataTable dt) throws InterruptedException {
        List<String> list = dt.asList(String.class);
        this.providerEdit.SearchInsurance(list.get(0));
        this.providerEdit.SelectInsurance();
        this.providerEdit.SearchInsurance(list.get(1));
        this.providerEdit.SelectInsurance();
        this.providerEdit.SearchInsurance(list.get(2));
        this.providerEdit.SelectInsurance();
        this.providerEdit.SearchInsurance(list.get(3));
        this.providerEdit.SelectInsurance();
        this.providerEdit.SearchInsurance(list.get(4));
        this.providerEdit.SelectInsurance();
    }





    @Then("^I search for the service$")
    public void iSearchForTheService(DataTable dt) {
        List<String> list = dt.asList(String.class);
        this.providerEdit.SearchServices(list.get(0));
        this.providerEdit.SelectService();
        this.providerEdit.SearchServices(list.get(1));
        this.providerEdit.SelectService();
        this.providerEdit.SearchServices(list.get(2));
        this.providerEdit.SelectService();
        this.providerEdit.SearchServices(list.get(3));
        this.providerEdit.SelectService();
        this.providerEdit.SearchServices(list.get(4));
        this.providerEdit.SelectService();
    }

    @And("^I log out of the PAC portal$")
    public void iLogOutOfThePACPortal() {
        this.providerEdit.PACLogout();
    }
}