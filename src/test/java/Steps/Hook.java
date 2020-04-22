package Steps;

import Utility.BaseUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {

        this.base = base;
    }

    @Before
    public void setUp() {
        System.out.println("Opening test");
        //Create a new ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "/Users/mac/IdeaProjects/CucumberSelenium/src/chromedriver");

        ChromeDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();

        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        base.wait = new WebDriverWait(base.driver, 15);
    }

    @After
    public void TearDownTest(Scenario scenario){
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        System.out.println("Closing test");
        base.driver.quit();
    }
}
