package pages.web;

import org.junit.Assert;
import org.openqa.selenium.By;

import static helper.Utility.driver;

public class AboutPage {
    By about = By.xpath("//a[.='About us']");
    By video = By.xpath("//div[@id='example-video']");
    By close = By.xpath("//div[@id='videoModal']//button[@type='button'][normalize-space()='Close']");



    public void clickAboutMenu() throws InterruptedException {
        driver.findElement(about).click();
        Thread.sleep(1300);
    }

    public void validateVideoDisplayed(){
        driver.findElement(video).isDisplayed();
    }

    public void userClickCloseOnAboutPage(){
        driver.findElement(close).click();
    }
}
