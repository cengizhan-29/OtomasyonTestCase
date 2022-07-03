package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/Features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty","html:target/site/cucumber-pretty"},
        tags = "@SmokeTest",
        dryRun = false

)

public class RunnerSmokeTest extends AbstractTestNGCucumberTests {

}
