package pages.web;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import static helper.Utility.driver;

public class CheckoutPage {

    By phones = By.xpath("(//a[normalize-space()='Phones'])");
    By phoneProduct = By.xpath("(//h4)[6]");
    By addToCart = By.xpath("//a[.='Add to cart']");
    By cart = By.xpath("//a[@id='cartur']");
    By home = By.xpath("//a[contains(.,'Home')]");
    By deleteProduct = By.xpath("//a[contains(.,'Delete')]");
    By placeOrder = By.xpath("//button[normalize-space()='Place Order']");
    By product1 = By.xpath("(//td[normalize-space()])[1]");
    By product2 = By.xpath("(//td[normalize-space()])[4]");
    By nameField =  By.xpath("//input[@id='name']");
    By country =  By.xpath("//input[@id='country']");
    By city =  By.xpath("//input[@id='city']");
    By credit =  By.xpath("//input[@id='card']");
    By month =  By.xpath("//input[@id='month']");
    By year =  By.xpath("//input[@id='year']");
    By purchase = By.xpath("//button[normalize-space()='Purchase']");
    By thanks = By.xpath("//h2[.='Thank you for your purchase!']");
    By delete = By.xpath("//a[.='Delete']");
    By deleteFirst = By.xpath("(//a[.='Delete'])[1]");
    By table = By.xpath("//tbody[@id='tbodyid']/tr");


    public void clickProduct(){
        driver.findElement(phones).click();
        driver.findElement(phoneProduct).click();
    }

    public void userClickAddToCart() throws InterruptedException {
        driver.findElement(addToCart).click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void userClickCartMenu() throws InterruptedException {
        driver.findElement(cart).click();
    }

    public void userClickPlaceOrder() {
        driver.findElement(placeOrder).click();
    }

    public void userFill(String name, String Country, String City, String Credit, String Month, String Year) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(country).sendKeys(Country);
        driver.findElement(city).sendKeys(City);
        driver.findElement(credit).sendKeys(Credit);
        driver.findElement(month).sendKeys(Month);
        driver.findElement(year).sendKeys(Year);
    }

    public void userClickPurchase() {
        driver.findElement(purchase).click();
    }

    public void alertValidation (String expectedMessage,String name,String credit) throws InterruptedException {
        if (name.isEmpty() || credit.isEmpty()){

            Alert alert = driver.switchTo().alert();
            String actualMessage = alert.getText();
            Assert.assertEquals(expectedMessage, actualMessage);
            Thread.sleep(1500);
        } else {
            Assert.assertTrue(driver.findElement(thanks).isDisplayed());
            Thread.sleep(1500);
        }
    }

    public void userClickDeleteProduct() throws InterruptedException {
        List<WebElement> elements = driver.findElements(delete);
        int size = elements.size();

        for (int i = 0; i < size; i++) {
            driver.findElement(deleteFirst).click();
            Thread.sleep(2000);
        }
    }

    public void validateProductItem(){
        List<WebElement> rows = driver.findElements(table);
        Assert.assertEquals(rows.size(),0);
    }
}
