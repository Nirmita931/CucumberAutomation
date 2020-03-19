package Steps;

import Utility.BaseUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import pages.Services;

public class ServiceStep extends BaseUtil {

    private BaseUtil base;
    Services service;

    public ServiceStep(BaseUtil base){
        this.base = base;
        service = new Services(base.driver);
    }

    @Then("I click on Services option")
    public void click_on_services(){
        this.service.ServiceClick();
    }
    @And("I click on Add Services button")
    public void click_on_add_service_button(){
        this.service.AddServiceClick();
    }
    @And("^I enter service name \"([^\"]*)\"$")
    public void iEnterServiceName(String arg0){
        this.service.EnterServiceName(arg0);
    }
    @And("I choose some of the facilities")
    public void choose_facilities(){
        this.service.ChooseProviderType();
    }
    @And("I click on Submit button")
    public void click_submit(){
        this.service.SubmitService();
    }
    @And("^I enter the newly created service on the search bar which is \"([^\"]*)\"$")
    public void iEnterTheNewlyCreatedServiceOnTheSearchBarWhichIs(String arg0) throws InterruptedException {
        this.service.SearchService(arg0);
    }
    @Then("I should be able to see the newly created service displayed on the list and delete it")
    public void newly_created_service_displayed_on_the_list(){
        this.service.VerifyService();
        this.service.DeleteService();
    }
}
