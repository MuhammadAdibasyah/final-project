package pages.web;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static helper.Utility.driver;

public class ProductPage {


    By phones = By.xpath("(//a[normalize-space()='Phones'])");
    By laptops = By.xpath("(//a[normalize-space()='Laptops'])");
    By monitors = By.xpath("(//a[normalize-space()='Monitors'])");
    By phoneProduct = By.xpath("//a[.='Samsung galaxy s6']");
    By laptopProduct = By.xpath("//a[normalize-space()='Sony vaio i7']");
    By monitorProduct = By.xpath("//a[normalize-space()='Apple monitor 24']");
    By tablePhone = By.xpath("//div[@id='tbodyid']/div[1]//h4[@class='card-title']");
    By detailProduct = By.xpath("//div[@id='tbodyid']//h2");
    By addToCart = By.xpath("//a[.='Add to cart']");

    private String dynamicItem = "//div[@id='tbodyid']/div[%s]//h4[@class='card-title']";


    public WebElement getElementByDynamicText(String text) {
        String dynamicXpath = String.format(dynamicItem, text);
        return driver.findElement(By.xpath(dynamicXpath));
    }

    public void onTheHomePage(){
        driver.findElement(phones).isDisplayed();
    }

    public void userClick(String category) {
        if (category.equalsIgnoreCase("Phones")) {
            driver.findElement(phones).click();
        } else if (category.equalsIgnoreCase("Laptops")) {
            driver.findElement(laptops).click();
        } else if (category.equalsIgnoreCase("Monitors")) {
            driver.findElement(monitors).click();
        } else {
            throw new IllegalArgumentException("Kategori tidak dikenal: " + category);
        }
    }


    public void validateProductByCategory(String product) throws InterruptedException {

        if (product.equalsIgnoreCase("Phones")) {
            driver.findElement(phoneProduct).isDisplayed();
            Thread.sleep(1500);
        } else if (product.equalsIgnoreCase("Laptops")) {
            driver.findElement(laptopProduct).isDisplayed();
            Thread.sleep(1500);
        } else if (product.equalsIgnoreCase("Monitors")) {
            driver.findElement(monitorProduct).isDisplayed();
            Thread.sleep(1500);
        } else {
            throw new IllegalArgumentException("Kategori tidak dikenal: " + product);
        }
    }

    public void userClickTitle(String product) {
        driver.findElement(tablePhone).click();
    }

    public void validateDetailProduct(String detail) throws InterruptedException {
        driver.findElement(detailProduct).isDisplayed();
        Thread.sleep(1500);
    }

    public String getProductTitleText(String item){
        WebElement productTitle = getElementByDynamicText(item);
        return productTitle.getText();
    }

    public void userClickTitleOfProduct(String item) throws InterruptedException {
        getElementByDynamicText(item).click();
        Thread.sleep(2000);
    }

    public void validateDetailOfSelectedProduct(String title) {
        String detailTitle = driver.findElement(detailProduct).getText();
        Assert.assertEquals(detailTitle,title);
    }

    public void userClickProduct() {
        driver.findElement(phoneProduct).click();
        driver.findElement(addToCart).click();
    }

    public void getAlertMessage(String alretMessage) {
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        Assert.assertEquals(alretMessage,actualMessage);
    }

}
