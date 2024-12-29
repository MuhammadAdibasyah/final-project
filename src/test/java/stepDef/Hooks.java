package stepDef;

import context.ScenarioContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static helper.Utility.quitDriver;
import static helper.Utility.startDriver;

public class Hooks {

    private static ScenarioContext scenarioContext;

    public static ScenarioContext getScenarioContext() {
        return scenarioContext;
    }

    @Before
    public void beforeTest() {
        startDriver();
        scenarioContext = new ScenarioContext();
    }

    @After
    public void afterTest() {
        quitDriver();
        scenarioContext = null;
    }
}
