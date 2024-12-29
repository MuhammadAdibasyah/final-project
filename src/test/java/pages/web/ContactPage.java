package pages.web;


import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static helper.Utility.driver;

public class ContactPage {

    By contact = By.xpath("//a[.='Contact']");
    By email = By.xpath("//input[@id='recipient-email']");
    By name = By.xpath("//input[@id='recipient-name']");
    By message = By.xpath("//textarea[@id='message-text']");
    By send = By.xpath("//button[.='Send message']");
    By close = By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]");


    public void onTheHomepage(){
        driver.findElement(contact).isDisplayed();
    }

    public void userClickContactMenu() {
        driver.findElement(contact).click();
    }

    public void userInputContactNameContactEmailAndMessage() {
        driver.findElement(email).sendKeys("test");
        driver.findElement(name).sendKeys("asep");
        driver.findElement(message).sendKeys("tutor");
    }

    public void userClickSendMessage() throws InterruptedException {
        driver.findElement(send).click();
        Thread.sleep(1500);
    }

    public void validateGetAlertMessage(String alertMessage) {
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        Assert.assertEquals(alertMessage,actualMessage);
        alert.accept();
    }

    public void userClickClose() {
        driver.findElement(close).click();
    }


    public void userBackToHomePage() {
        Assert.assertTrue(driver.findElement(contact).isDisplayed());
    }

}
