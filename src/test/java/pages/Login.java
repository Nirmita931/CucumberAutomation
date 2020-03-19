package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login{
    private WebDriver driver;
    private WebDriverWait wait;

    public static String currentUrl = "https://slvsearch-qa.silvervue.com/";
    public static String PacUrl = "https://qa-pac.silvervue.com/";


    @FindBy(name= "email") WebElement userName;
    @FindBy(name = "password") WebElement passWord;
    @FindBy(xpath = "//form//button[@type='submit']") WebElement loginBtn;
    @FindBy(xpath = "//a[@class='dropdown-toggle user-profile-dropdown']") WebElement Dropdown;
    @FindBy(xpath = "//a[@id='logout-button']") WebElement Logout;

    @FindBy(xpath = "//button[contains(text(),'Login')]") WebElement PacLoginButton;
    @FindBy(xpath = "//span[@class='icon-pp-header-genericprofile-33x33']") WebElement PacAccountDropdown;
    @FindBy(xpath = "//p[contains(text(), 'Logout')]") WebElement PacLogout;

    public Login(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }

    public void loginToSite(String email, String pass){
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(email);
        passWord.sendKeys(pass);
    }

    public void clickLogin(){
        loginBtn.click();
    }


    public void getCurrnetUrl(){
        driver.get(currentUrl);
    }

    public void getPacUrl(){
        driver.get(PacUrl);
    }

    public void loginToPac(String pemail, String password){
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(pemail);
        passWord.sendKeys(password);
    }

    public void PacLogout() throws InterruptedException {
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//span[@class='icon-pp-header-genericprofile-33x33']"));
        PacLogout.click();
    }

    public void PacLogin(){
        PacLoginButton.click();
    }

    public void logout(){
        wait.until(ExpectedConditions.visibilityOf(Dropdown));
        Dropdown.click();
        Logout.click();
    }
}
