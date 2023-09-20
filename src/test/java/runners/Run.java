package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import javax.swing.*;
@CucumberOptions(
        features = {"src/test/resources/LoginTest.feature",
                "src/test/resources/LoginTest1.feature" },
        glue = { "stepDefinitions" }
)

public class Run extends AbstractTestNGCucumberTests {
}
