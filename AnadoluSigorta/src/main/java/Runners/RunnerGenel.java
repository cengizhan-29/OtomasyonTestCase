package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty","html:target/site/cucumber-pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false

)

public class RunnerGenel extends AbstractTestNGCucumberTests {
}
