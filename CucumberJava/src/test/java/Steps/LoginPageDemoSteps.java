package Steps;



import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageDemoSteps {
	WebDriver driver= null;
	LoginPage_Pf login;
	
	@Given("^user id on login$")
	public void user_id_on_login() throws Throwable {
		
		
		
	}

	@When("^user enters Guilherme and (\\d+)$")
	public void user_enters_Guilherme_and(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("^user clicks on login$")
	public void user_clicks_on_login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	
	}

	@Then("^user is navigate to the home page$")
	public void user_is_navigate_to_the_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("^user enters Bruna and (\\d+)$")
	public void user_enters_Bruna_and(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

}
