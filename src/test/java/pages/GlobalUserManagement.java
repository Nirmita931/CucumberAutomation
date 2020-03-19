package pages;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalUserManagement {
    private WebDriver driver;
    private WebDriverWait wait;

    public static String gUrl = "https://mail.google.com/";

    @FindBy(xpath = "//a[contains(text(),'User Management')]") WebElement UserManagement;
    @FindBy(xpath = "//a[@id='silverVueSelect']") WebElement SilvervueTab;
    @FindBy(xpath = "//button[contains(@class,'pull-right btn btn-primary add-user-btn')]") WebElement Adduser;
    @FindBy(xpath = "//select[@name='role']") WebElement UserRole;
    @FindBy(xpath = "//option[@value='svAdmin']") WebElement SvAdmin;
    @FindBy(xpath = "//input[@name='email']") WebElement UserEmail;
    @FindBy(xpath = "//input[@name='firstName']") WebElement FirstName;
    @FindBy(xpath = "//input[@name='lastName']") WebElement LastName;
    @FindBy(xpath = "//input[@name='cc']") WebElement CcEmail;
    @FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-block add-edit-user-btn')]") WebElement SendInvitation;

    @FindBy(xpath = "//input[@name='identifier']") WebElement gemail;
    @FindBy(xpath = "//span[@class='RveJvd snByac']") WebElement nextButton;
    @FindBy(xpath = "//input[@name='password']") WebElement gpassword;

    public GlobalUserManagement(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }

    public void ClickUserManagement(){
        UserManagement.click();
    }
    public void ClickSilvervueTab(){
        SilvervueTab.click();
    }
    public void ClickAddUser(){
        Adduser.click();
    }
    public void ChooseUserRole(){
        Select select=new Select(UserRole);
        select.selectByValue("svAdmin");
    }
    public void EnterUserInfo(String email, String fname, String lname, String cc){
        UserEmail.sendKeys(email);
        FirstName.sendKeys(fname);
        LastName.sendKeys(lname);
        CcEmail.sendKeys(cc);
    }
    public void ClickSubmitInvitation(){
        SendInvitation.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'Your changes have been saved.')]")));
    }
    public void getURL(){
        driver.get(gUrl);
    }
    public void EmailLogin(String email, String password){
        gemail.sendKeys(email);
        nextButton.click();
        gpassword.sendKeys(password);
        nextButton.click();
    }
}
