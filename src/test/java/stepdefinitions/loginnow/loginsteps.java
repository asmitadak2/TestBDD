package stepdefinitions.loginnow;

import java.time.Duration;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class loginsteps {
	@Before
	public void Before(){
		System.out.println("Before");
	}
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with_(String name) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(name);
	}

	
	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(int1);
	}

	
	@Then("I verify the {string} in step")
	public void i_verify_the_success_in_step(String successmesage) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(successmesage);
	}

	
	
	

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Failure");	}

	@After
	public void After(){
		System.out.println("After");
	}


}
