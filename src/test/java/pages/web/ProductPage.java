package pages.web;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.Assert;
import org.openqa.selenium.By;

import static helper.Utility.driver;

public class ProductPage {

    By phones = By.xpath("(//a[normalize-space()='Phones'])");
    By laptops = By.xpath("(//a[normalize-space()='Laptops'])");
    By monitors = By.xpath("(//a[normalize-space()='Monitors'])");
    By phoneProduct = By.xpath("(//h4)[1]");
    By laptopProduct = By.xpath("(//h4[@class='card-title'])[5]");
    By monitorProduct = By.xpath("(//h4[@class='card-title'])[1]");


    public void onTheHomePage(){
        driver.findElement(phones).isDisplayed();
    }

    public void userClickPhonesCategories() {
        driver.findElement(phones).click();
    }


    public void userSeeAllPhonesProduct() throws InterruptedException {
        Assert.assertEquals(driver.findElement(phoneProduct).isDisplayed(),true);
        Thread.sleep(1000);
    }

    public void userClickLaptopsCategories() {
        driver.findElement(laptops).click();
    }

    public void userSeeAllLaptopsProduct() throws InterruptedException {
        Assert.assertEquals(driver.findElement(laptopProduct).isDisplayed(), true);
        Thread.sleep(1500);
    }


    public void userClickMonitorsCategories() {
        driver.findElement(monitors).click();
    }


    public void userSeeAllMonitorsProduct() throws InterruptedException {
        Assert.assertEquals(driver.findElement(monitorProduct).isDisplayed(),true);
        Thread.sleep(1500);
    }

}
