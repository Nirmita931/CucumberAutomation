package Steps;

import Utility.BaseUtil;
import com.aventstack.extentreports.GherkinKeyword;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pages.Login;
import pages.ProviderEdit;

public class PracticeStep  extends BaseUtil {

    private BaseUtil base;
    ProviderEdit pedit;

    // Constructor
    public PracticeStep(BaseUtil base) {
        this.base = base;
        pedit = new ProviderEdit(base.driver, base.wait);
    }

    @Then("^I choose one facility from the dropdown \"([^\"]*)\"$")
    public void iChooseOneFacilityFromTheDropdown(String arg0) throws InterruptedException, ClassNotFoundException {
//        scenarioDef.createNode(new GherkinKeyword("Then"), "I choose one facility from the dropdown \"([^\"]*)\"");
        this.pedit.ChoosePacFacility(arg0);
    }
}
