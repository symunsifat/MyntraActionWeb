package pack.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class MyntraRunnerPage {
	
	
	@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
			"json:target/cucumber-jsonreports/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = {
					"src/test/resources/FeatureFolder" }, glue = {
							"myntra.StepDefinitions","myntra.Utilities" }, tags = {"@Sanity or @Regression"} , monochrome = true)

	public class RunCukesTest extends AbstractTestNGCucumberTests {

	}

}
