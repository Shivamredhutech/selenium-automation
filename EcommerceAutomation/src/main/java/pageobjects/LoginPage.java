package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By email = By.id("userEmail");
    By password = By.id("userPassword");
    By loginButton = By.id("login");

    public void loginApplication(String userEmail, String userPassword) {

        driver.findElement(email).sendKeys(userEmail);

        driver.findElement(password).sendKeys(userPassword);

        driver.findElement(loginButton).click();
    }
}