package steps;

import com.GreenNnnConsult.Base;
import com.GreenNnnConsult.Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps extends Base {
    loginPage LoginPage;
    @Given("User open the browser")
    public void user_open_the_browser() {
        luncher();

    }
    @When("User fill the email as {string} and password as {string} and click on login button")
    public void user_fill_the_email_as_and_password_as_and_click_on_login_button(String email, String password) throws InterruptedException {
        LoginPage =new loginPage();
        LoginPage.loginPerform(email, password);

    }
    @Then("User should navigate at the home page")
    public void user_should_navigate_at_the_home_page() {
        LoginPage.loginAssertion();

    }
    @Then("User shouldnt navigate at the home page")
    public void user_shouldnt_navigate_at_the_home_page() {
        LoginPage.loginAssertionFalse();
    }


}
