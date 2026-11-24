
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        // Maximize temporarily disabled due to Chrome 157 issue

        driver.get(
                "https://rahulshettyacademy.com/client/auth/login"
        );
    }

//    @AfterMethod
//    public void tearDown() {
//
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
