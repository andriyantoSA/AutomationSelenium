package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user on login page")
	public void user_on_login_page() {
	    System.out.println("Inside Step - User on Login Page");
	}

	@When("user input username and password")
	public void user_input_username_and_password() {
		System.out.println("Inside Step - Input Username and Password");
	}

	@And("user click login button")
	public void user_click_login_button() {
		System.out.println("Inside Step - Click Login Button");
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
		System.out.println("Inside Step - Success login and Navigate to Home Page");
	}
}
