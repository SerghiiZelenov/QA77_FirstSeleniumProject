package HomeWork06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/");
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector(".ico-register"));
    }

    public String registerNewUser() {
        clickOnRegisterLink();
        type(By.id("FirstName"), "Ivan");
        type(By.id("LastName"), "Ivanov");

        String email = "test" + System.currentTimeMillis() + "@mail.com";
        type(By.id("Email"), email);

        type(By.id("Password"), "123456");
        type(By.id("ConfirmPassword"), "123456");

        click(By.id("register-button"));
        return email;
    }
}