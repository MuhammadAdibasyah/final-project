package stepDef.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.web.AboutPage;

public class AboutStep {

    AboutPage aboutPage;

    public AboutStep(){
        this.aboutPage = new AboutPage();
    }

    @When("user click about us menu")
    public void clickAboutMenu() throws InterruptedException {
        aboutPage.clickAboutMenu();

    }

    @Then("user see video")
    public void userSeeVideo() {
        aboutPage.validateVideoDisplayed();
    }

    @And("user click close on about page")
    public void userClickCloseOnAboutPage() {
        aboutPage.userClickCloseOnAboutPage();
    }
}
