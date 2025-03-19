package stepDef.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.web.LoginPage;

public class LoginStep {

    LoginPage loginPage;

    public LoginStep(){
        this.loginPage = new LoginPage();
    }

    @Given("user on login page")
    public void userOnLoginPage() throws InterruptedException {
        loginPage.openBrowser();
    }

    @When("user fill username with {string}")
    public void userFillUsernameWith(String username) {
        loginPage.userFillUsernameWith(username);
    }

    @And("user fill password with {string}")
    public void userFillPasswordWith(String password) {
        loginPage.userFillPasswordWith(password);
    }

    @And("user click login button")
    public void userClickLoginButton() throws InterruptedException {
        loginPage.userClickLoginButton();
    }

    @Then("user success to login and validate username show")
    public void userSuccessToLoginAndValidateUsernameShow() throws InterruptedException {
        loginPage.validateUsernameShow();
    }

    @Then("user get error message {string}")
    public void userGetErrorMessage(String expectedMessage) {
        loginPage.userGetErrorMessage(expectedMessage);
    }


}
