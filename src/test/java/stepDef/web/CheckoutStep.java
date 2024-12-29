package stepDef.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.web.CheckoutPage;

public class CheckoutStep {

    CheckoutPage checkoutPage;


    public CheckoutStep(){
        this.checkoutPage = new CheckoutPage();
    }


    @When("user click phone product")
    public void userClickPhoneProduct() {
        checkoutPage.clickProduct();
    }

    @And("user click add to cart")
    public void userClickAddToCart() throws InterruptedException {
        checkoutPage.userClickAddToCart();
    }

    @And("user click cart menu")
    public void userClickCartMenu() throws InterruptedException {
        checkoutPage.userClickCartMenu();
    }

    @And("user click place order")
    public void userClickPlaceOrder() {
        checkoutPage.userClickPlaceOrder();
    }

    @And("user fill {string} , {string}, {string}, {string}, {string}, {string}")
    public void userFill(String name, String Country, String City, String Credit, String Month, String Year) {
        checkoutPage.userFill(name,Country,City,Credit,Month,Year);
    }

    @And("user click purchase")
    public void userClickPurchase() {
        checkoutPage.userClickPurchase();
    }


    @Then("user get {string} based on {string} and {string} value")
    public void userGetBasedOnValue(String expectedMessage, String name, String credit) throws InterruptedException {
        checkoutPage.alertValidation(expectedMessage,name,credit);
    }

    @Given("user on the cart page")
    public void userOnTheCartPage() throws InterruptedException {
        checkoutPage.clickProduct();
        checkoutPage.userClickAddToCart();
        checkoutPage.userClickCartMenu();
    }

    @When("user click delete product")
    public void userClickDeleteProduct() throws InterruptedException {
        checkoutPage.userClickDeleteProduct();
    }

    @Then("user see product item not display")
    public void userSeeProductItemNotDisplay(){
        checkoutPage.validateProductItem();
    }
}
