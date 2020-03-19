package Runner;

import Utility.BaseUtil;
import Utility.ReportUtil;
import com.aventstack.extentreports.gherkin.model.Feature;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListener extends BaseUtil implements ITestListener {
    ReportUtil reportUtil = new ReportUtil();

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        try{
            reportUtil.ExtentReportScreenshot();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        reportUtil.ExtentReport();
        features = reportUtil.extent.createTest(Feature.class, "Provider Feature");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        reportUtil.FlushReport();
    }
}
