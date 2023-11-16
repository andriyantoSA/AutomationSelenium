package StepDefinitions.ThridProjectLoginDemo;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/ThirdProjectLoginWebsite", glue= {"StepDefinitions.ThridProjectLoginDemo"}, monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",}
		)
public class RunnerLoginDemoSteps {

}
