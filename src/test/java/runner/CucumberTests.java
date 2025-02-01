package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDef"},
        features = {"src/test/java/feature"},
        plugin = {"pretty" , "html:reports/cucumber-web.html","json:reports/cucumber.json"},
        tags = "@web"

)
public class CucumberTests {
}
