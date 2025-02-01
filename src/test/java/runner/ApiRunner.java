package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"pretty","html:reports/cucumber-api.html"},
        glue = {"stepDef"},
        features = {"src/test/java/feature/api"},
        tags = "@Api"
)
public class ApiRunner {
}
