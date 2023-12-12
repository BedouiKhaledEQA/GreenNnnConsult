package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",glue = "steps",
         plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
        ,stepNotifications = true,tags = "@Banner-03")

public class TestRunner {
}
