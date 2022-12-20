package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstep {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("Hi am in");
		}

	@When("user entered crn")
	public void user_entered_crn() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi crn entered");
		System.out.println("This is for the commit");
	   
	}
	

	@And("user enters mpin")
	public void user_enters_mpin() {
		System.out.println("Hi this is not how i wanted");
	    // Write code here that turns the phrase above into concrete actions
	    	}

	@Then("able to do successful login")
	public void able_to_do_successful_login() {
		System.out.println("Hi check");
	  
	}


}
