package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Services {
    public WebDriver driver;
    public WebDriverWait wait;

    @FindBy(xpath = "//a[@id='servicesSelect']") WebElement services;

    @FindBy(xpath = "//a[@class='btn btn-primary add-item-icon pull-right']") WebElement addServices;

    @FindBy(xpath = "//input[@name='serviceName']") WebElement serviceName;

    @FindBy(xpath = "//label[text()='Acute Rehab']") WebElement AcuteRehab;

    @FindBy(xpath = "//label[text()='Home Health']") WebElement HomeHealth;

    @FindBy(xpath = "//label[text()='Skilled Nursing (SNF)']") WebElement SNF;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-block']") WebElement serviceSubmit;

    @FindBy(xpath = "//input[@name='customFilter']") WebElement search;

    @FindBy(xpath = "//table[contains(@class,'table table-striped table-condensed item-table')]//tbody//tr") WebElement serviceVerify;

    @FindBy(xpath = "//span[@class='silvericon silvericon-trash searchable-item-icon']") WebElement delete;

    @FindBy(xpath = "//button[@class='btn btn-danger btn-block delete-button']") WebElement confirmDelete;

    public Services(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait= new WebDriverWait(driver,80);
    }
    public void ServiceClick(){
        wait.until(ExpectedConditions.visibilityOf(services));
        services.click();
    }
    public void AddServiceClick(){
        wait.until(ExpectedConditions.visibilityOf(addServices));
        addServices.click();
    }
    public void EnterServiceName(String service){
        wait.until(ExpectedConditions.visibilityOf(serviceName));
        serviceName.sendKeys(service);
    }
    public void ChooseProviderType(){
        AcuteRehab.click();
        wait.until(ExpectedConditions.visibilityOf(HomeHealth));
        HomeHealth.click();
        wait.until(ExpectedConditions.visibilityOf(SNF));
        SNF.click();
    }
    public void SubmitService(){
        wait.until(ExpectedConditions.visibilityOf(serviceSubmit));
        serviceSubmit.click();
    }
    public void SearchService(String service) throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(search));
        search.sendKeys(service);
    }
    public void VerifyService(){
        wait.until(ExpectedConditions.visibilityOf(serviceVerify));
        boolean sverify = serviceVerify.isDisplayed();
        Assert.assertEquals(sverify, true);
    }
    public void DeleteService(){
        wait.until(ExpectedConditions.visibilityOf(delete));
        delete.click();
        wait.until(ExpectedConditions.visibilityOf(confirmDelete));
        confirmDelete.click();
    }
}
