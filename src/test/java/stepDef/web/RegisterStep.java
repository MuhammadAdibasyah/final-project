package stepDef.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.web.RegisterPage;

public class RegisterStep {

    RegisterPage registerPage;

    public RegisterStep(){
        this.registerPage = new RegisterPage();
    }

    @Given("user on sign up page")
    public void userOnSignUpPage(){
        registerPage.userOnSignUp();
    }

    @When("user fill username sign up with username")
    public void userFillUsernameSignUpWith() {
        registerPage.userFillUsernameSignUpWith();
    }

    @And("user fill password sign up with {string}")
    public void userFillPasswordSignUpWith(String password) {
        registerPage.userFillPasswordSignUpWith(password);
    }

    @And("user click sign up button")
    public void userClickSignUpButton() throws InterruptedException {
        registerPage.userClickSignUpButton();
    }

    @Then("user get message {string}")
    public void userGetMessage(String expectedMsg) {
        registerPage.userGetMessage(expectedMsg);
    }


    @When("user fill username sign up with {string}")
    public void userFillUsernameSignUpWith(String usernameCredential) {
        registerPage.userFillNameSignUpWith(usernameCredential);
    }

    @When("user fill username sign up with username with numeric")
    public void userFillUsernameSignUpWithUsernameWithNumeric() {
        registerPage.userFillUsernameSignUpWithUsernameWithNumeric();
    }

    @When("user fill username sign up with username with symbol")
    public void userFillUsernameSignUpWithUsernameWithSymbol() {
        registerPage.userFillUsernameSignUpWithUsernameWithSymbol();
    }
}
