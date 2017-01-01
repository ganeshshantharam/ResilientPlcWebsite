package Resilient.ResilientPlcWebsite;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/features/",
		monochrome = true,
		plugin = {"pretty", "html:target/TestReport"}
		//tags= "@ResourcePage"
		)

public class TestRunnerTest {

}
