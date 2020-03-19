package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insurance {
    public WebDriver driver;
    public WebDriverWait wait;

    @FindBy(xpath = "//a[@id='insuranceSelect']") WebElement insurance;

    @FindBy(xpath = "//a[@class='btn btn-primary add-item-icon pull-right']") WebElement addInsurance;

    @FindBy(xpath = "//input[@id='healthSystem']") WebElement healthSystem;

    @FindBy(xpath = "//input[@id='insuranceCo']") WebElement InsuranceCo;

    @FindBy(xpath = "//input[@id='network']") WebElement Network;

    @FindBy(xpath = "//select[@id='orgName']") WebElement displayname;

    @FindBy(xpath = "//input[@id='rcvjTt4sjCjG6vHK6']") WebElement Phone;

    @FindBy(xpath = "//input[@id='T9Lv8sqmd5qdkToDL']") WebElement Address;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-block']") WebElement InsuranceSubmit;

    @FindBy(xpath = "//input[@id='customFilter']") WebElement search;

    @FindBy(xpath = "//table[@class='table table-striped table-condensed item-table']//tbody//tr") WebElement InsuranceVerify;

    @FindBy(xpath = "//span[@class='silvericon silvericon-trash searchable-item-icon']") WebElement delete;

    @FindBy(xpath = "//button[@class='btn btn-danger btn-block delete-button']") WebElement confirmDelete;

    public Insurance(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait= new WebDriverWait(driver,80);
    }
    public void InsuranceClick() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(insurance));
        insurance.click();
    }
    public void AddInsuranceClick(){
        wait.until(ExpectedConditions.visibilityOf(addInsurance));
        addInsurance.click();
    }
    public void EnterInsuranceInfo(String healthsystem, String insuranceCo, String network) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(healthSystem));
//        Thread.sleep(2000);
        healthSystem.sendKeys(healthsystem);
        wait.until(ExpectedConditions.visibilityOf(InsuranceCo));
//        Thread.sleep(2000);

        InsuranceCo.sendKeys(insuranceCo);
        wait.until(ExpectedConditions.visibilityOf(Network));
//        Thread.sleep(2000);

        Network.sendKeys(network);
        displayname.click();
    }
    public void ClickSaveButton(){

        InsuranceSubmit.click();
    }
    public void SearchInsurance(String insurance) throws InterruptedException {
        Thread.sleep(5000);
        search.sendKeys(insurance);
    }
    public void VerifyInsurance(){
        wait.until(ExpectedConditions.visibilityOf(InsuranceVerify));
        InsuranceVerify.isDisplayed();
    }
    public String select_display_name(String dname) {
        String xpath = String.format("//option[contains(text(),'%s')]", dname);
        return xpath;
    }
    public void DeleteInsurance(){
        wait.until(ExpectedConditions.visibilityOf(delete));
        delete.click();
        wait.until(ExpectedConditions.visibilityOf(confirmDelete));
        confirmDelete.click();
    }

}
