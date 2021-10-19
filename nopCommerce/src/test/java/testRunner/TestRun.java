package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
			features=".//Features/Login.Feature",
			glue = "stepDefinitions",
			dryRun = false,
			monochrome = true,
			plugin = {"pretty",
	                "html:target/cucumber.html",
	                "json:target/cucumber.json"}
		)
public class TestRun {
	
}
