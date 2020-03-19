package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProviderEdit {

    public WebDriver driver;
    public WebDriverWait wait;

    //Facility Search
    @FindBy(name= "facilityType") WebElement FacilityType;
    @FindBy(xpath = "//input[@name='facilityTextSearch']") WebElement facilitySearch;
    @FindBy(xpath = "//div[@class = '-autocomplete-container']//li") WebElement facilitySelect;

    //Add Insurance
    @FindBy(linkText = "Insurance In-network") WebElement InsuranceInNetwork;
    @FindBy(xpath = "//input[@placeholder='Search all insurance...']") WebElement SearchInsurance;
    @FindBy(xpath = "//div[@id='insurance']//li[1]") WebElement SelectInsurance;
    @FindBy(xpath = "//div[@id='insurance']/div[3]/div[1]") List<WebElement> HeaderTextInsurance;

    //Save Changes
    @FindBy(xpath = "//button[contains(text(),'Save Changes')]") WebElement SaveButton;
    @FindBy(xpath = "//div[contains(text(), 'Your changes have been saved')]") WebElement SnackBar;

    @FindBy(xpath = "//a[@class='active']//div") WebElement YourListing;

    //Add Service
    @FindBy(linkText = "Services Offered") WebElement ServiecsOffered;
    @FindBy(xpath = "//input[@placeholder='Search all services...']") WebElement SearchServices;
    @FindBy(xpath = "//div[@id='services']//li[1]") WebElement SelectService;
    @FindBy(xpath = "//div[@id='services']/div[2]/div[1]") List<WebElement> HeaderTestService;

    //Standard Listing
    @FindBy(xpath = "//a[contains(text(),'Standard Listing')]") WebElement StandardListing;
    @FindBy(name = "legalName") WebElement LegalName;
    @FindBy(name = "previousName") WebElement PreviousName;
    @FindBy(name = "fax") WebElement FaxNumber;
    @FindBy(name = "npi") WebElement NpiNumber;
    @FindBy(name = "uniqueProviderId") WebElement UniqueId;
    @FindBy(name = "capacity") WebElement Capacity;
    @FindBy(name = "numberOfStations") WebElement StationNumber;
    @FindBy(name = "numberOfStaff") WebElement StaffNumber;
    @FindBy(xpath = "//*[contains(text(), 'offer private rooms')]//following::div[4]") WebElement PrivateRoom;
    @FindBy(xpath = "//*[contains(text(), 'offer private rooms')]//following::span[text() = 'Yes']") WebElement SelectPrivateRoomOption;

    //Premium Listing
    @FindBy(xpath = "//a[contains(text(),'Premium Listing')]") WebElement PremiumListing;
    @FindBy(xpath = "//textarea[@placeholder='Enter your description here']") WebElement EnterDescription;
    @FindBy(xpath = "//input[@placeholder='Enter your website here']") WebElement EnterWebsite;
    @FindBy(xpath = "//textarea[@id='providerResponsetextArea']") WebElement EnterRatingResponse;

    @FindBy(xpath = "//a[contains(text(),'Special Programs')]")WebElement SpecialPrograms;
    @FindBy(name = "specialPrograms_0") WebElement SpecialPrograms1;
    @FindBy(name = "specialPrograms_1") WebElement SpecialPrograms2;
    @FindBy(name = "specialPrograms_2") WebElement SpecialPrograms3;
    @FindBy(name = "specialPrograms_3") WebElement SpecialPrograms4;
    @FindBy(name = "specialPrograms_4") WebElement SpecialPrograms5;
    @FindBy(name = "specialPrograms_5") WebElement SpecialPrograms6;
    @FindBy(name = "specialPrograms_6") WebElement SpecialPrograms7;
    @FindBy(name = "specialPrograms_7") WebElement SpecialPrograms8;
    @FindBy(name = "specialPrograms_8") WebElement SpecialPrograms9;
    @FindBy(name = "specialPrograms_9") WebElement SpecialPrograms10;
    @FindBy(name = "specialPrograms_10") WebElement SpecialPrograms11;
    @FindBy(name = "specialPrograms_11") WebElement SpecialPrograms12;

    @FindBy(xpath = "//textarea[@name='testimonials_text_0']") WebElement Testimonial1;
    @FindBy(xpath = "//input[@name='testimonials_author_0']") WebElement TestimonialAuthor1;
    @FindBy(xpath = "//textarea[@name='testimonials_text_1']") WebElement Testimonial2;
    @FindBy(xpath = "//input[@name='testimonials_author_1']") WebElement TestimonialAuthor2;
    @FindBy(xpath = "//textarea[@name='testimonials_text_2']") WebElement Testimonial3;
    @FindBy(xpath = "//input[@name='testimonials_author_2']") WebElement TestimonialAuthor3;
    @FindBy(xpath = "//textarea[@name='testimonials_text_3']") WebElement Testimonial4;
    @FindBy(xpath = "//input[@name='testimonials_author_3']") WebElement TestimonialAuthor4;
    @FindBy(xpath = "//textarea[@name='testimonials_text_4']") WebElement Testimonial5;
    @FindBy(xpath = "//input[@name='testimonials_author_4']") WebElement TestimonialAuthor5;

    @FindBy(xpath = "//a[contains(text(),'Brochures')]") WebElement Brochuree;
    @FindBy(xpath = "//div[@id='brochuresuploader']//input") WebElement UploadBrochure;
    @FindBy(xpath = "//div[contains(text(), 'Upload Complete')]") WebElement UploadComplete;

    //Logout
    @FindBy(xpath = "//img[@alt='SilverSearch']") WebElement Logo;
    @FindBy(xpath = "//a[@class='dropdown-toggle user-profile-dropdown']") WebElement LogOutDropDown;
    @FindBy(xpath = "//a[@id='logout-button']") WebElement Logout;

    //@FindBy(xpath = "//input[@placeholder='Enter legal name here']") WebElement LegalName;
//    @FindBy(xpath = "//option[@value='homeHealth']") WebElement HHtransitionalCareType;
//    @FindBy(xpath = "//input[@placeholder='Search providers by name or id...']") WebElement PacFacility;
//    @FindBy(xpath = "//body//div[@id='layout']//div//div//div//div//a[1]") WebElement ChooseSNF;

    public ProviderEdit(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
    public void ChooseTransitionalType(String type){
        Select facility_type = new Select(FacilityType);
        facility_type.selectByValue(type);
    }
    public void SearchForFacility(String fname) {
        facilitySearch.sendKeys(fname);
    }

    public void ClickFacility() {
        facilitySelect.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void YourListingPage() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"));
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }

    public void InsuranceInNetworkClick() {
        wait.until(ExpectedConditions.visibilityOf(InsuranceInNetwork));
        InsuranceInNetwork.click();
    }

    public void SearchInsurance(String insurance) {
        wait.until(ExpectedConditions.visibilityOf(SearchInsurance));
        SearchInsurance.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), insurance);
    }

    public void SelectInsurance() {
        wait.until(ExpectedConditions.visibilityOf(SelectInsurance));
        SelectInsurance.click();
    }

    public void saveChanges() {
        wait.until(ExpectedConditions.visibilityOf(SaveButton));
        SaveButton.click();
    }

    public String checkForConfirmation() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(SnackBar));
        String confirmationMsg = SnackBar.getText();
        Thread.sleep(3000);
        return confirmationMsg;
    }

    public String getTextFromHeader(String text) {
        for (WebElement elements : HeaderTextInsurance) {
            String headerText = elements.getText();
            if (headerText.contains(text)) {
                return headerText;
            }
        }
        return null;
    }

    public void ServicesOfferedClick() {
        wait.until(ExpectedConditions.visibilityOf(ServiecsOffered));
        ServiecsOffered.click();
    }

    public void SearchServices(String service) {
        wait.until(ExpectedConditions.visibilityOf(SearchServices));
        SearchServices.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END),service);
    }

    public void SelectService() {
        wait.until(ExpectedConditions.visibilityOf(SelectService));
        SelectService.click();
    }
    public void SelectStandardListing(){
        StandardListing.click();
    }
    public void EnterStandardInfo(String ...arg){
        LegalName.clear();
        LegalName.sendKeys(arg[0]);
        PreviousName.clear();
        PreviousName.sendKeys(arg[1]);
        NpiNumber.clear();
        NpiNumber.sendKeys(arg[2]);
        UniqueId.clear();
        UniqueId.sendKeys(arg[3]);
        FaxNumber.clear();
        FaxNumber.sendKeys(arg[4]);
        Capacity.clear();
        Capacity.sendKeys(arg[5]);
        StationNumber.clear();
        StationNumber.sendKeys(arg[6]);
        PrivateRoom.click();
        SelectPrivateRoomOption.click();
        StaffNumber.clear();
        StaffNumber.sendKeys(arg[7]);
    }
    public void ClickPremium(){
        PremiumListing.click();
    }
    public void EnterPremiumInfo(String ...arg){
        EnterDescription.clear();
        EnterDescription.sendKeys(arg[0]);
        EnterWebsite.clear();
        EnterWebsite.sendKeys(arg[1]);
        EnterRatingResponse.clear();
        EnterRatingResponse.sendKeys(arg[2]);
    }
    public void EnterRatingResponse(String ...arg) throws InterruptedException {
        SpecialPrograms.click();
        SpecialPrograms1.clear();
        SpecialPrograms1.sendKeys(arg[0]);
        SpecialPrograms2.clear();
        SpecialPrograms2.sendKeys(arg[1]);
        SpecialPrograms3.clear();
        SpecialPrograms3.sendKeys(arg[2]);
        SpecialPrograms4.clear();
        SpecialPrograms4.sendKeys(arg[3]);
        SpecialPrograms5.clear();
        SpecialPrograms5.sendKeys(arg[4]);
        SpecialPrograms6.clear();
        SpecialPrograms6.sendKeys(arg[5]);
        SpecialPrograms7.clear();
        SpecialPrograms7.sendKeys(arg[6]);
        SpecialPrograms8.clear();
        SpecialPrograms8.sendKeys(arg[7]);
        SpecialPrograms9.clear();
        SpecialPrograms9.sendKeys(arg[8]);
        SpecialPrograms10.clear();
        SpecialPrograms10.sendKeys(arg[9]);
        SpecialPrograms11.clear();
        SpecialPrograms11.sendKeys(arg[10]);
        SpecialPrograms12.clear();
        SpecialPrograms12.sendKeys(arg[11]);
    }
    public void EnterTestimonial(String ...arg){
        Testimonial1.clear();
        Testimonial1.sendKeys(arg[0]);
        TestimonialAuthor1.clear();
        TestimonialAuthor1.sendKeys(arg[1]);
        Testimonial2.clear();
        Testimonial2.sendKeys(arg[2]);
        TestimonialAuthor2.clear();
        TestimonialAuthor2.sendKeys(arg[3]);
        Testimonial3.clear();
        Testimonial3.sendKeys(arg[4]);
        TestimonialAuthor3.clear();
        TestimonialAuthor3.sendKeys(arg[5]);
        Testimonial4.clear();
        Testimonial4.sendKeys(arg[6]);
        TestimonialAuthor4.clear();
        TestimonialAuthor4.sendKeys(arg[7]);
        Testimonial5.clear();
        Testimonial5.sendKeys(arg[8]);
        TestimonialAuthor5.clear();
        TestimonialAuthor5.sendKeys(arg[9]);
    }
    public String BrochureUpload(String brochure) throws InterruptedException {
        Brochuree.click();
//        UploadBrochure.click();
        UploadBrochure.sendKeys(brochure);
        wait.until(ExpectedConditions.visibilityOf(UploadComplete));
        String confirmationMsg = UploadComplete.getText();
        Thread.sleep(3000);
        return confirmationMsg;
    }









    public String getTextFromServiceHeader(String text) {
        for (WebElement elements : HeaderTestService) {
            String headerText = elements.getText();
            if (headerText.contains(text)) {
                return headerText;
            }
        }
        return null;
    }

    public void ChoosePacFacility(String snf) throws InterruptedException {
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        action.moveToElement(we).build().perform();
//        PacFacility.sendKeys(snf);
//        ChooseSNF.click();
    }

    public void PACLogout(){
        Logo.click();
        LogOutDropDown.click();
        Logout.click();
    }
}
