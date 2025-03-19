package pages.web;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static helper.Utility.driver;

public class LoginPage {

    By login = By.xpath("//a[@id='login2']");
    By inputUsername = By.xpath("//input[@id='loginusername']");
    By inputPassword = By.xpath("//input[@id='loginpassword']");
    By buttonLogin = By.xpath("//button[normalize-space()='Log in']");
    By nameOfUser = By.xpath("//a[@id='nameofuser']");

    By cartButton = By.xpath("//a[@class='shopping_cart_link']");

    By eror_message(String mssg){
        return By.xpath("//*[contains(text (),'" + mssg + "')]");
    }

    public void openBrowser() throws InterruptedException {
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(5000);
    }

    public void userFillUsernameWith(String username) {
        driver.findElement(login).click();
        driver.findElement(inputUsername).sendKeys(username);
    }

    public void userFillPasswordWith(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void userClickLoginButton() throws InterruptedException {
        driver.findElement(buttonLogin).click();
        Thread.sleep(2000);

    }

    public void validateUsernameShow() throws InterruptedException {
        driver.findElement(nameOfUser).isDisplayed();
        Thread.sleep(2000);
    }

    public void userGetErrorMessage(String expectedMessage) {
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        alert.accept();
    }
}
