package pages;

import gherkin.lexer.Fa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateFacility {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//span[@class='silvericon silvericon-plus-circle bigger bold']") WebElement CreateAccount;
    @FindBy(xpath = "//select[@name='type']") WebElement FacilityType;
    @FindBy(xpath = "//select[@name='type']//option[@value='skilledNursing']") WebElement FacilityChoose;
    @FindBy(xpath = "//select[@name='type']//option[@value='homeHealth']") WebElement hhFacilityChoose;
    @FindBy(xpath = "//button[@id='continue-btn']") WebElement Continue;

    @FindBy(name = "provName") WebElement disname;
    @FindBy(name = "legalName") WebElement LegalName;
    @FindBy(name = "prevName") WebElement PreviousName;
    @FindBy(name = "fax") WebElement FaxNumber;
    @FindBy(name = "npi") WebElement NpiNumber;
    @FindBy(xpath = "//input[@name='phone']") WebElement phone;
    @FindBy(xpath = "//input[@name='location.address']") WebElement address;
    @FindBy(xpath = "//input[@name='location.city']") WebElement city;
    @FindBy(xpath = "//select[@name='location.state']") WebElement basicInfoStateClick;
    @FindBy(xpath = "//select[@name='location.state']//option[@value='UT']") WebElement basicInfoStateChoose;
    @FindBy(xpath = "//input[@name='location.zip']") WebElement basicInfoZip;
    @FindBy(xpath = "//button[contains(text(), 'Submit')]") WebElement basicInfoSubmit;

    @FindBy(xpath = "//input[@name='facilityTextSearch']") WebElement facilitySearch;
    @FindBy(xpath = "//div[@class = '-autocomplete-container']") WebElement facilitySelectWait;
    @FindBy(xpath = "//div[@class = '-autocomplete-container']//li") WebElement facilitySelect;

    @FindBy(xpath = "//a[@class='dropdown-toggle user-profile-dropdown']") WebElement AccountDropdown;
    @FindBy(xpath = "//a[@id='logout-button']") WebElement Logout;

    @FindBy(xpath = "//a[@class='blue-text pull-right upload-areas-link']") WebElement ServiceArea;
    @FindBy(xpath = "//input[@class='bootbox-input bootbox-input-text form-control']") WebElement servicezip;
    @FindBy(xpath = "//button[@class='btn btn-primary']") WebElement serviceOk;

    public CreateFacility(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
    public void ClickOnCreateFacility(){
        wait.until(ExpectedConditions.visibilityOf(CreateAccount));
        CreateAccount.click();
        FacilityType.click();
    }
    public void ChooseFacilityType(String ftype){
        Select facility_type = new Select(FacilityType);
        facility_type.selectByValue(ftype);
        Continue.click();
    }
    public void ProviderBasicInfo(String ...arg) {
//        wait.until(ExpectedConditions.visibilityOf(arg));
        disname.sendKeys(arg[0]);
        if (!LegalName.equals("") && !PreviousName.equals("") && !FaxNumber.equals("") && !NpiNumber.equals("")) {
            LegalName.sendKeys(arg[1]);
            PreviousName.sendKeys(arg[2]);
            FaxNumber.sendKeys(arg[4]);
            NpiNumber.sendKeys(arg[8]);
        } else if (LegalName.equals("") && PreviousName.equals("") && FaxNumber.equals("") && NpiNumber.equals("")) {
            ;
        }
        phone.sendKeys(arg[3]);
        address.sendKeys(arg[5]);
        city.sendKeys(arg[6]);
        basicInfoStateClick.click();
        basicInfoStateChoose.click();
        basicInfoZip.sendKeys(arg[7]);

    }
    public void SubmitSNFCreation(){
        wait.until(ExpectedConditions.visibilityOf(basicInfoSubmit));
        basicInfoSubmit.click();
    }

    public void ClickDropdown(){
        wait.until(ExpectedConditions.visibilityOf(AccountDropdown));
        AccountDropdown.click();
        Logout.click();
    }


}
