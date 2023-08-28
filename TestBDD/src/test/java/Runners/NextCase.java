package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/Features/nextcase.feature",
	    glue = {"stepdefinitions.nextcase"},
	    plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class NextCase  extends AbstractTestNGCucumberTests {

}
