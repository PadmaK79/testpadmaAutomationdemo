package runner;

import org.junit.runner.RunWith;

import com.mipsdemo.base.TestBase;

import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="src//main//java//features",
		tags = {"@Login"},
		dryRun =false,
		glue={"stepDefinitions"},
		plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"},
		monochrome = true)
		

public class RunnerTest extends TestBase{
	
	
	
}
