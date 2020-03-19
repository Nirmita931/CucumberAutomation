package Steps;

import Utility.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.Login;

public class LoginStep extends BaseUtil {

    private BaseUtil base;
    Login log;

    // Constructor
    public LoginStep(BaseUtil base) {
        this.base = base;
        log = new Login(base.driver, base.wait);
    }

    @Given("^I click on login after entering username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iClickOnLoginAfterEnteringUsernameAndPassword(String arg0, String arg1){
        this.log.getCurrnetUrl();
        this.log.loginToSite(arg0, arg1);
        this.log.clickLogin();
    }

    @And("^I log out of the Admin Portal$")
    public void iLogOutOfTheAdminPortal(){
        this.log.logout();
    }

    @Given("^I enter username \"([^\"]*)\" and password \"([^\"]*)\" for PAC Login$")
    public void iEnterUsernameAndPasswordForPACLogin(String arg0, String arg1) throws ClassNotFoundException {
       this.log.getPacUrl();
       this.log.loginToPac(arg0, arg1);
       this.log.PacLogin();
    }

    @And("^I log out of PAC portal$")
    public void iLogOutOfPACPortal() throws InterruptedException {
        this.log.PacLogout();
    }
}
