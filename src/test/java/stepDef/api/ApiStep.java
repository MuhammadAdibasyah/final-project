package stepDef.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.api.ApiPage;

public class ApiStep {

    ApiPage apiPage;

    public ApiStep(){
        this.apiPage = new ApiPage();
    }

    //scenario1
    @Given("prepare url valid for {string}")
    public void prepareValidUrl( String url){
        apiPage.prepareValidUrl(url);
    }

    @When("hit url to get list data")
    public void hitUrl(){
       apiPage.hitUrl();
    }

    @Then("validation get status code {int}")
    public void getStatusCode(int status_code){
        apiPage.getStatusCode(status_code);
    }

    @And("Validation response body list users")
    public void validationResponseBodyListUsers() {
        apiPage.validationResponseBodyListUsers();
    }

    @And("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String fileName) {
        apiPage.validationResponseJsonWithJSONSchema(fileName);
    }

    //scenario3
    @When("hit url to create new user")
    public void hitUrlToCreateNewUser() {
        apiPage.hitUrlToCreateNewUser();
    }

    @And("Validation response body new users")
    public void validationResponseBodyNewUsers() {
        apiPage.validationResponseBodyNewUsers();
    }

    //scenario4
    @When("hit url to create new user with empty data")
    public void hitUrlToCreateNewUserWithEmptyData() {
        apiPage.hitUrlToCreateNewUserWithEmptyData();
    }

    //scenario5
    @And("hit api delete user")
    public void hitApiDeleteUser() {
        apiPage.hitApiDeleteUser();

    }

    //scenario6
    @And("hit api update user")
    public void hitApiUpdateUser() {
        apiPage.hitApiUpdateUser();

    }

    @And("Validation response body update users")
    public void validationResponseBodyUpdateUsers() {
        apiPage.validationResponseBodyUpdateUsers();
    }
}
