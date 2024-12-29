package stepDef.web;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.web.ProductPage;
import stepDef.Hooks;

public class ProductStep {

    ProductPage productPage;


    public ProductStep(){
        this.productPage = new ProductPage();
    }

    @Given ("user on the home page")
    public void onTheHomePage(){
        productPage.onTheHomePage();
    }

    @When("user click {string}")
    public void userClick(String category) throws InterruptedException {
        productPage.userClick(category);
    }

    @Then("user see all {string}")
    public void userSeeAll(String product) throws InterruptedException {
        productPage.validateProductByCategory(product);
    }


    @When("user click title {string}")
    public void userClickTitle(String product) {
        productPage.userClickTitle(product);

    }

    @Then("user see {string}")
    public void userSee(String detail) throws InterruptedException {
        productPage.validateDetailProduct(detail);
    }

    @When("user click product")
    public void userClickProduct() {
        productPage.userClickProduct();
    }

    @Then("get alert message {string}")
    public void getAlertMessage(String alertMessage) {
        productPage.getAlertMessage(alertMessage);
    }

    @Then("The product in the table same with the detail page")
    public void theProductInTheTableSameWithTheDetailPage() throws InterruptedException {
    productPage.validateDetailProduct();
    }
}
