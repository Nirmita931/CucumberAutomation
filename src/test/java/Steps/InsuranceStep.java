package Steps;

import Utility.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Insurance;
import pages.Login;
import pages.Services;

import java.util.concurrent.TimeUnit;

public class InsuranceStep extends BaseUtil {
    public WebDriver driver;
    Login login;
    Insurance insurance;

    @Given("^I am logged in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iAmLoggedInWithUsernameAndPassword(String arg0, String arg1) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/CucumberSelenium/src/chromedriver");
        driver = new ChromeDriver();
        login.getCurrnetUrl();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login.loginToSite(arg0, arg1);
        login.clickLogin();
    }
    @When("I click on Insurance option")
    public void click_on_insurance() throws InterruptedException {
        insurance.InsuranceClick();
    }
    @And("I click on Add Insurance button")
    public void click_on_add_insurance_button(){

        insurance.AddInsuranceClick();
    }
    @And("^I enter the reqiured info like Health System with \"([^\"]*)\", Insurance Co\\. with \"([^\"]*)\", Network with \"([^\"]*)\"$")
    public void iEnterTheReqiuredInfoLikeHealthSystemWithInsuranceCoWithNetworkWith(String arg0, String arg1, String arg2) throws InterruptedException {
        insurance.EnterInsuranceInfo(arg0, arg1, arg2);
    }
    @And("^I select Insurance Name to Display$")
    public void iSelectInsuranceNameToDisplay() {
        String s = insurance.select_display_name("New Insurance");
        WebElement displayName = driver.findElement(By.xpath(s));
        displayName.click();
    }
    @And("I click on Save button")
    public void click_submit(){
        insurance.ClickSaveButton();
    }
    @And("^I enter the newly created insurance which is \"([^\"]*)\" on the search bar$")
    public void iEnterTheNewlyCreatedInsuranceWhichIsOnTheSearchBar(String arg0) throws InterruptedException {
        insurance.SearchInsurance(arg0);
    }
    @Then("I should be able to see the newly created insurance displayed on the list and delete it")
    public void newly_created_insurance_displayed_on_the_list(){
        insurance.VerifyInsurance();
        insurance.DeleteInsurance();
    }
    @And("I should be logged out of the Admin Portal")
    public void logout() throws InterruptedException {
        login.logout();
        Thread.sleep(5000);
        driver.quit();
//        driver.close();
    }



}
