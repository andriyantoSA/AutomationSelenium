package StepDefinitions.SecondProjectGoogleSearch;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/SecondProjectGoogleSearch", glue= {"StepDefinitions.SecondProjectGoogleSearch"}, monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",}
	)
public class RunnerGoogleSearch {

}
