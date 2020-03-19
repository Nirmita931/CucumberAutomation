package Steps;

import Utility.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CreateFacility;

public class ProviderStep {

    public BaseUtil base;
    CreateFacility createFacility;

    public ProviderStep(BaseUtil base){
        this.base = base;
        createFacility = new CreateFacility(base.driver, base.wait);
    }

    @Then("^I click on Create Account Button$")
    public void iClickOnCreateAccountButton() {
        this.createFacility.ClickOnCreateFacility();
    }

    @Then("^I choose \"([^\"]*)\" transitional care type$")
    public void iChooseTransitionalCareType(String arg0){
        this.createFacility.ChooseFacilityType(arg0);
    }

//    @Then("^I enter the Basic Information of the SNF facility as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
//    public void iEnterTheBasicInformationOfTheSNFFacilityAs(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5){
//        this.createFacility.ProviderBasicInfo(arg0, arg1, arg2, arg3, arg4, arg5);
//    }
    @And("^I click on submit the new facility creation and logout$")
    public void iClickOnSubmitTheNewFacilityCreation() {
        this.createFacility.SubmitSNFCreation();
    }

}
