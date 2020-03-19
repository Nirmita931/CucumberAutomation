package pages;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Hospital {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "hospitalsSelect") WebElement hospitalTab;
    @FindBy(id = "facilityTextSearch") WebElement searchProviderInput;
    @FindBy(xpath = "//div[@class = '-autocomplete-container']//li") WebElement selectProviderDropdown;
    @FindBy(xpath = "//p[contains(text(),'SilverSearch')]") WebElement SilverWeb;
    @FindBy(xpath = "//select[@name='facilityType']") WebElement FacilityType;
    @FindBy(xpath = "//input[@name='zip']") WebElement Zip;
    @FindBy(xpath = "//select[@name='distance']") WebElement Miles;
    @FindBy(xpath = "//a[@class='btn btn-block btn-info info-btn-changes edit-insurance-filter']") WebElement Insurance;
    @FindBy(xpath = "//label[text()='Lamjung Insurance']") WebElement ChooseInsurance;
    @FindBy(xpath = "//button[@id='btn-save']") WebElement SaveButton;
    @FindBy(xpath = "//a[@class='btn btn-block btn-info info-btn-changes edit-services-filter']") WebElement Service;
    @FindBy(xpath = "//input[@name='hospitalSearchCustomFilter']") WebElement ServiceSearch;
    @FindBy(xpath = "//label[text()='Lamjung Service']//parent::div") WebElement ChooseService;
    @FindBy(xpath = "//button[@id='search-butn']") WebElement Search;
    @FindBy(xpath = "//div[@id='results-holder']//div[@id='wtJFiq3zBsRr8j3Xt']//div[@class='container-fluid details']") WebElement ChooseFacility;
    @FindBy(xpath = "//div[@id='monoModalFreeView']//h2[@id='modal-title']") List<WebElement>  facilityTitle;
    @FindBy(xpath = "//button[@class='moreDetailsClose btn btn-default btn-lg pull-right not-printable']") WebElement Back;

    public Hospital(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
    public void HospitalClick(){
        hospitalTab.click();
    }
    public void HospitalSearch(String hospital){
        searchProviderInput.sendKeys(hospital);
        selectProviderDropdown.click();
    }
    public void SilverwebClick() throws InterruptedException {
        Thread.sleep(3000);
        SilverWeb.click();
    }
    public void ChooseFacility(){
        Select select=new Select(FacilityType);
        select.selectByValue("skilledNursing");
    }
    public void EnterZip(String zip){
        Zip.sendKeys(zip);
    }
    public void ChooseMiles(){
        Select select=new Select(Miles);
        select.selectByValue("10");
    }
    public void SelectInsurance(String sname) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(Insurance));
        Insurance.click();
        ServiceSearch.sendKeys(sname);
        Thread.sleep(2000);
        ChooseInsurance.click();
        SaveButton.click();
    }
    public void SelectService(String sname) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(Service));
        Service.click();
        ServiceSearch.sendKeys(sname);
        Thread.sleep(3000);
        ChooseService.click();
        SaveButton.click();
    }
    public void ClickSearch(){
        Search.click();
    }
    public void ChooseFacilityFromList() throws InterruptedException {
        Thread.sleep(3000);
        ChooseFacility.click();
        Thread.sleep(4000);
    }
    public String getTextFromHeader(String text) {
        for (WebElement elements : facilityTitle) {
            String headerText = elements.getText();
            if (headerText.contains(text)) {
                System.out.println(text);
                return headerText;
            }
        }
        return null;
    }
    public void ClickBack() throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOf(Back));
        Thread.sleep(3000);
        Back.click();
    }
}
