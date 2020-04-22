package Runner;

import cucumber.api.*;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        monochrome = true,
        features = {"src/test/resources/features/TestLink"},
        glue = "Steps",
        tags = "@MessageOfPremiumListingState",
        plugin = {"pretty","json:target/cucumber.json","html:target/cucumber-reports"}
        )

public class TestRunner extends AbstractTestNGCucumberTests{
}