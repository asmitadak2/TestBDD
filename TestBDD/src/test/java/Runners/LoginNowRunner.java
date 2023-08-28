package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/Features/LoginNow.feature",
	    glue = {"stepdefinitions.loginnow"},
	    plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class LoginNowRunner extends AbstractTestNGCucumberTests{
	

}
