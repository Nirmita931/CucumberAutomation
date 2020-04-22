package Steps;

import Utility.BaseUtil;
import cucumber.api.java.en.Then;
import pages.Hospital;

public class HospitalStep {

    private BaseUtil base;
    Hospital hospital;

    // Constructor
    public HospitalStep(BaseUtil base) {
        this.base = base;
        hospital = new Hospital(base.driver, base.wait);
    }

    @Then("^I click on Hospital tab$")
    public void iClickOnHospitalTab() {
        this.hospital.HospitalClick();
    }
    @Then("^I search for the hospital with its name \"([^\"]*)\" and click on it$")
    public void iSearchForTheHospitalWithItsNameAndClickOnIt(String arg0){
        this.hospital.HospitalSearch(arg0);
    }
    @Then("^I click on SilverSearch option$")
    public void iClickOnSilverWebOption() throws InterruptedException {
        this.hospital.SilverwebClick();
    }
    @Then("^I choose a facility type from the dropdown$")
    public void iChooseAFacilityTypeFromTheDropdown() {
        this.hospital.ChooseFacility();
    }

    @Then("^I enter the zip code \"([^\"]*)\"$")
    public void iEnterTheZipCode(String arg0){
        this.hospital.EnterZip(arg0);
    }
    @Then("^I select the miles$")
    public void iSelectTheMiles() {
        this.hospital.ChooseMiles();
    }
    @Then("^I select insurance \"([^\"]*)\"$")
    public void iSelectInsurance(String arg0) throws Throwable {
        this.hospital.SelectInsurance(arg0);
    }
//    @Then("^I select service \"([^\"]*)\"$")
//    public void iSelectService(String arg0) throws Throwable {
//        this.hospital.SelectService(arg0);
//    }
    @Then("^I click on Search button$")
    public void iClickOnSearchButton() {
        this.hospital.ClickSearch();
    }
    @Then("^I click on the provider from the list and verify facility name \"([^\"]*)\"$")
    public void iClickOnTheProviderFromTheListAndVerifyFacilityName(String arg0) throws InterruptedException {
        this.hospital.ChooseFacilityFromList();
        this.hospital.getTextFromHeader(arg0);
        this.hospital.ClickBack();
    }


}
