package stepDef.web;

import io.cucumber.java.en.And;
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

    @Then("user get message thanks for your purchases")
    public void userGetMessageThanksForYourPurchases() throws InterruptedException {
        checkoutPage.userGetMessageThanksForYourPurchases();
    }

}
