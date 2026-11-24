
package tests;

import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.ProductsPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginTest extends BaseTest {

    @Test
    public void loginAndAddProductToCart() {

        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginApplication(
                "shivamkopa4114@gmail.com",
                "Kopa@123"
        );

        // Step 2: Explicit Wait
        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 3: Wait Until Products Are Visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".mb-3")
        ));

        ProductsPage productsPage = new ProductsPage(driver);

        String productName = "ZARA COAT 3";

        // Step 4: Add Product To Cart
        productsPage.addProductToCart(productName);

        // Step 5: Wait For Confirmation Message
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("toast-container")
        ));

        System.out.println("Product added successfully");

        // Step 6: Navigate To Cart

        // Step 6: Navigate To Cart
        productsPage.goToCart();

        System.out.println("Cart button clicked");

        // Step 7: Wait Until Cart Product Is Visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".cartSection h3")
        ));

        System.out.println("Cart page loaded");

        // Step 8: Get Cart Products
        java.util.List<WebElement> cartProducts =
                driver.findElements(
                        By.cssSelector(".cartSection h3")
                );

        // Step 9: Verify Product Using Java Streams
        boolean productPresent = cartProducts.stream()
                .anyMatch(product ->
                        product.getText().equalsIgnoreCase(productName));

        // Step 10: Print Result
        if (productPresent) {

            System.out.println(
                    "PASS: " + productName + " is present in cart"
            );

        } else {

            throw new AssertionError(
                    "FAIL: Product not found in cart"
            );
        }

    }
}
