package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Utility {

    public static WebDriver driver;

    public static void startDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public static void quitDriver(){
        driver.quit();
    }

    public static String generateRandomUsername(){
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "-_.";
        String username = "";
        username = RandomStringUtils.randomAlphanumeric(10);
        return username;
    }

    public static String generateRandomUsernameWithNumber(){
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "-_.";
        String username2 = "";
        username2 = RandomStringUtils.randomNumeric(5);
        return username2;
    }

    public static String generateRandomUsernameSymbol() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "-_.";
        String username3 = "";
        String temp = RandomStringUtils.randomAlphanumeric(6);
        username3 = temp + "@!#$%";
        return username3;
    }
}
