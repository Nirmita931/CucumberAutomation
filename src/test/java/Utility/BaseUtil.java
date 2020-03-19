package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtil {
    public static WebDriver driver;
    public WebDriverWait wait;
    public ExtentReports extent;

    public static ExtentTest scenarioDef;

    public static ExtentTest features;

    public static String reportLocation = "/Users/mac/Documents/Reports/";

}
