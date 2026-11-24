package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.List;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By products = By.cssSelector(".mb-3");

    // Cart Button Locator
    By cartButton = By.cssSelector("[routerlink*='cart']");

    // Get All Products
    public List<WebElement> getProductList() {

        return driver.findElements(products);
    }

    // Get Product By Name Using Java Streams
    public WebElement getProductByName(String productName) {

        return getProductList()
                .stream()
                .filter(product ->
                        product.findElement(By.cssSelector("b"))
                                .getText()
                                .equalsIgnoreCase(productName))
                .findFirst()
                .orElse(null);
    }

    // Add Product To Cart
    public void addProductToCart(String productName) {

        WebElement product = getProductByName(productName);

        if (product == null) {
            throw new RuntimeException(
                    "Product not found: " + productName
            );
        }

        product.findElement(
                By.xpath(".//button[contains(.,'Add To Cart')]")
        ).click();
    }

    // Navigate To Cart Page

    public void goToCart() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.id("toast-container")
        ));

        WebElement cart = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector("[routerlink*='cart']")
                )
        );

        cart.click();
    }

}
