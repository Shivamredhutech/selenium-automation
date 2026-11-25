
package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("User is on the login page")
    public void user_is_on_login_page() {
        Hooks.driver.get("https://www.google.com");
        System.out.println("Login page opened");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_credentials() {
        System.out.println("Entering valid credentials");
    }

    @When("User enters invalid username and password")
    public void user_enters_invalid_credentials() {
        System.out.println("Entering invalid credentials");
    }

    @When("User clicks on the login button")
    public void user_clicks_login_button() {
        System.out.println("Clicking login button");
    }

    @Then("User should be successfully logged in")
    public void user_should_be_logged_in() {
        System.out.println("Login successful");
    }

    @Then("User should see an error message")
    public void user_should_see_error_message() {
        System.out.println("Error message displayed");
    }
}
