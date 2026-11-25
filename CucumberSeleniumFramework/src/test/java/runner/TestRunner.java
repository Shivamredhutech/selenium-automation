
package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        tags = "@Regression",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html"
        },
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
