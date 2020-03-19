package Steps;

import Utility.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import pages.ProviderEdit;

import java.util.List;

public class SnfEditPremium extends BaseUtil {

    private BaseUtil base;
    ProviderEdit provideredit;

    // Constructor
    public SnfEditPremium(BaseUtil base) {
        this.base = base;
        provideredit = new ProviderEdit(base.driver, base.wait);
    }
   @Then("^I click on Premium Listing option from sub-left navigation bar$")
    public void iClickOnPremiumListingOptionFromSubLeftNavigationBar() throws InterruptedException {
        this.provideredit.ClickPremium();
        Thread.sleep(3000);
    }

    @Then("^I enter the description\"([^\"]*)\", \"([^\"]*)\" and Response of Rating \"([^\"]*)\"$")
    public void iEnterTheDescriptionAndResponseOfRating(String arg0, String arg1, String arg2){
        this.provideredit.EnterPremiumInfo(arg0, arg1, arg2);
    }

    @Then("^I enter the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iEnterThe(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11) throws InterruptedException {
        this.provideredit.EnterRatingResponse(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
    }

    @Then("^I enter the testimonial \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iEnterTheTestimonial(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9){
        this.provideredit.EnterTestimonial(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg8, arg9);
    }

    @Then("^I upload a brochure \"([^\"]*)\"$")
    public void iUploadABrochure(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        this.provideredit.BrochureUpload(arg0);
    }

    @Then("^I enter the special features$")
    public void iEnterTheSpecialFeatures(DataTable dt) {
        List<String> list = dt.asList(String.class);

    }
}
