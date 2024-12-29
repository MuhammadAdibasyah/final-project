package stepDef.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.web.ContactPage;

public class ContactStep {

    ContactPage contactPage;

    public ContactStep(){
        this.contactPage = new ContactPage();
    }

    @Given("user on the homepage")
    public void onTheHomepage(){
        contactPage.onTheHomepage();
    }

    @When("user click contact menu")
    public void userClickContactMenu() {
        contactPage.userClickContactMenu();
    }

    @And("user input contact name, contact email and message")
    public void userInputContactNameContactEmailAndMessage() {
        contactPage.userInputContactNameContactEmailAndMessage();
    }

    @And("user click send message")
    public void userClickSendMessage() throws InterruptedException {
        contactPage.userClickSendMessage();
    }


    @Then("user get alert message {string}")
    public void userGetAlertMessage(String alertMessage) {
        contactPage.validateGetAlertMessage(alertMessage);
    }


    @And("user click close")
    public void userClickClose() {
        contactPage.userClickClose();
    }

    @Then("user back to home page")
    public void userBackToHomePage() {
        contactPage.userBackToHomePage();
    }

}
