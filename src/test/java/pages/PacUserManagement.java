package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PacUserManagement {

    public WebDriver driver;
    public WebDriverWait wait;

    @FindBy(xpath = "//span[@class='icon-pp-leftnav-usermanagement-30x30']") WebElement userManagement;
    @FindBy(xpath = "//button[contains(text(),'Add User')]") WebElement addUserButton;
    @FindBy(name = "firstName") WebElement firstName;
    @FindBy(name = "lastName") WebElement lastName;
    @FindBy(name = "email") WebElement email;
    @FindBy(name = "cc") WebElement ccEmail;
    @FindBy(xpath = "//button[contains(text(),'Add and Close')]") WebElement addAndCloseButton;
    @FindBy(xpath = "//div[contains(text(), 'User was added and invitation sent')]") WebElement addUserSnackBarMessage;

    @FindBy(xpath = "//tr[2]//td[7]//a[4]") WebElement editUserButton;
    @FindBy(xpath = "//button[contains(text(),'Save and Close')]") WebElement saveAndCloseButton;
    @FindBy(xpath = "//div[contains(text(), 'User was updated')]") WebElement userEditSnackBarMessage;

//    @FindBy(xpath = "//tr[3]//td[7]//a[2]") WebElement resendInviteButton;
    @FindBy(xpath = "//button[contains(text(),'Send Invitation')]") WebElement sendInviteButton;
    @FindBy(xpath = "//div[contains(text(), 'Successfully Resent Invitation')]") WebElement invitationResendSnackBarMessage;

//    @FindBy(xpath = "//tr[3]//td[7]//a[3]") WebElement deleteuserButton;
    @FindBy(xpath = "//button[contains(text(),'Yes')]") WebElement yesButton;
    @FindBy(xpath = "//div[contains(text(), 'User was removed')]") WebElement userDeleteSnackBarMessage;

    public PacUserManagement(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
    public void clickUserManagement() throws InterruptedException {
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(userManagement));
        userManagement.click();
    }

    public void clickAddUserButton() throws InterruptedException {
        addUserButton.click();
    }
    public void fillUserInfo(String ...arg){
        firstName.sendKeys(arg[0]);
        lastName.sendKeys(arg[1]);
        email.sendKeys(arg[2]);
        ccEmail.sendKeys(arg[3]);
    }
    public String clickAddAndCloseButton() throws InterruptedException {
        addAndCloseButton.click();
        wait.until(ExpectedConditions.visibilityOf(addUserSnackBarMessage));
        String confirmationMsg = addUserSnackBarMessage.getText();
        Thread.sleep(3000);
        return confirmationMsg;
    }

    public void clickEditUserButton(){
        editUserButton.click();
    }
    public void editUserInfo(String editFirstName, String editLastName){
        firstName.clear();
        firstName.sendKeys(editFirstName);
        lastName.clear();
        lastName.sendKeys(editLastName);
    }
    public void clickSaveAndCloseButton(){
        saveAndCloseButton.click();
    }
    public String userEditConfirmation() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(userEditSnackBarMessage));
        String confirmationMsg = userEditSnackBarMessage.getText();
        Thread.sleep(3000);
        return confirmationMsg;
    }
    public void clickResendInvite(String name){
        String xpath = String.format("//a[text() = '%s']//parent::td//following-sibling::td//a[text() = 'resend invite']", name);
        WebElement resendInviteButton = driver.findElement(By.xpath(xpath));
        resendInviteButton.click();
    }

    public String resendInvitation() throws InterruptedException {
        sendInviteButton.click();
        wait.until(ExpectedConditions.visibilityOf(invitationResendSnackBarMessage));
        String confirmationMsg = invitationResendSnackBarMessage.getText();
        Thread.sleep(3000);
        return confirmationMsg;
    }
    public void clickDeleteOption(String name){
        String xpath = String.format("//a[text() = '%s']//parent::td//following-sibling::td//a[text() = 'delete']", name);
        WebElement deleteUserButton = driver.findElement(By.xpath(xpath));
        deleteUserButton.click();
    }
    public String clickYesButton() throws InterruptedException {
        yesButton.click();
        wait.until(ExpectedConditions.visibilityOf(userDeleteSnackBarMessage));
        String confirmationMsg = userDeleteSnackBarMessage.getText();
        Thread.sleep(3000);
        return confirmationMsg;
    }
}
