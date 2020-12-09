package starter.stepdefinitions;

import hrmpages.DashboardPage;
import hrmpages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginIntoApplication {
	@Steps
	HomePage homepage;
	
	@Steps
	DashboardPage dashboardpage;

	@Given("User is on login page")
	public void user_is_on_login_page() {

	}

	@When("User enter {string} as username")
	public void user_enter_as_username(String string) {

	}

	@When("User enter {string} as password")
	public void user_enter_as_password(String string) {

	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() {

	}

}
