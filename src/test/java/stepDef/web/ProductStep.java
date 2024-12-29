package stepDef.web;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.web.ProductPage;

public class ProductStep {

    ProductPage productPage;

    public ProductStep(){
        this.productPage = new ProductPage();
    }

    @Given ("user on the home page")
    public void onTheHomePage(){
        productPage.onTheHomePage();
    }

//    @When("user click phones categories")
//    public void userClickPhonesCategories() {
//        productPage.userClickPhonesCategories();
//    }
//
//    @Then("user see all phones product")
//    public void userSeeAllPhonesProduct() throws InterruptedException {
//        productPage.userSeeAllPhonesProduct();
//    }
//
//    @When("user click laptops categories")
//    public void userClickLaptopsCategories() {
//        productPage.userClickLaptopsCategories();
//    }
//
//    @Then("user see all laptops product")
//    public void userSeeAllLaptopsProduct() throws InterruptedException {
//        productPage.userSeeAllLaptopsProduct();
//    }
//
//    @When("user click monitors categories")
//    public void userClickMonitorsCategories() {
//        productPage.userClickMonitorsCategories();
//    }
//
//    @Then("user see all monitors product")
//    public void userSeeAllMonitorsProduct() throws InterruptedException {
//        productPage.userSeeAllMonitorsProduct();
//    }

    @When("user click {string}")
    public void userClick(String product) {
        productPage.userClick();
    }

    @Then("user see all {string}")
    public void userSeeAll(String element) throws InterruptedException {
        productPage.userSeeAll();
    }

    @Then("user see {string}")
    public void userSee(String arg0) {
    }

    @When("user click product")
    public void userClickProduct() {
    }

    @Then("get alert message")
    public void getAlertMessage() {
    }
}
