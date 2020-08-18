package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\ssinha\\eclipse-workspace\\BidOne\\src\\main\\java\\features\\Login.feature",
	glue= {"stepDefinitions"},
	plugin = {"pretty", "html:test-output", "json:json_output/cucumber", "junit:junit_xml/cucumber.xml"},
	monochrome=true,
			strict=true,
			dryRun=false
		)

public class testRunner {
		

}
