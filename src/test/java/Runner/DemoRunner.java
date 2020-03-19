package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        monochrome = true,
        features = {"src/test/resources/DemoFeatures"},
        glue = "Steps",
        tags = "@01_SnfCreation, @02_SnfNonPremiumUpdate, @03_SnfUpdatePremium, @04_ReplaceAllInfo",
        plugin = {"pretty","json:target/cucumber.json","html:target/cucumber-reports"}
        )

public class DemoRunner extends AbstractTestNGCucumberTests {

}
