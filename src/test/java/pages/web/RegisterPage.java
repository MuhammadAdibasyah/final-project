package pages.web;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static helper.Utility.*;

public class RegisterPage {

    By singUp = By.xpath("//a[@id='signin2']");
    By singUsername = By.xpath("//input[@id='sign-username']");
    By signPass = By.xpath("//input[@id='sign-password']");
    By signUpButton = By.xpath("//button[.='Sign up']");





    public void userOnSignUp(){
        driver.get("https://www.demoblaze.com/");
        driver.findElement(singUp).click();
    }

    public void userFillUsernameSignUpWith() {
        String username = generateRandomUsername();
        driver.findElement(singUsername).sendKeys(username);
    }

    public void userFillUsernameSignUpWithUsernameWithNumeric() {
        String username2 = generateRandomUsernameWithNumber();
        driver.findElement(singUsername).sendKeys(username2);
    }

    public void userFillUsernameSignUpWithUsernameWithSymbol() {
        String username3 = generateRandomUsernameSymbol();
        driver.findElement(singUsername).sendKeys(username3);
    }

    public void userFillPasswordSignUpWith(String password) {
        driver.findElement(signPass).sendKeys(password);
    }

    public void userFillNameSignUpWith(String usernameCredential) {
        driver.findElement(singUsername).sendKeys(usernameCredential);
    }

    public void userClickSignUpButton() throws InterruptedException {
        driver.findElement(signUpButton).click();
        Thread.sleep(2000);
    }

    public void userGetMessage(String expectedMessage) {
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        alert.accept();
    }
}
