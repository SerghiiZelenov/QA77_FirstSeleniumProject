import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork01 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void openSiteTest() {
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void findTenElementsTest() {
        driver.get("https://demowebshop.tricentis.com/");

        WebElement registerLink = driver.findElement(By.linkText("Register"));
        System.out.println("1. " + registerLink.getText());

        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        System.out.println("2. " + loginLink.getText());

        WebElement searchField = driver.findElement(By.id("small-searchterms"));
        System.out.println("3. " + searchField.getAttribute("id"));

        WebElement searchButton = driver.findElement(By.cssSelector("input.button-1.search-box-button"));
        System.out.println("4. " + searchButton.getAttribute("value"));

        WebElement shoppingCart = driver.findElement(By.cssSelector(".cart-label"));
        System.out.println("5. " + shoppingCart.getText());

        WebElement wishlist = driver.findElement(By.cssSelector(".wishlist-label"));
        System.out.println("6. " + wishlist.getText());

        WebElement books = driver.findElement(By.linkText("Books"));
        System.out.println("7. " + books.getText());

        WebElement computers = driver.findElement(By.linkText("Computers"));
        System.out.println("8. " + computers.getText());

        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        System.out.println("9. " + electronics.getText());

        WebElement apparelShoes = driver.findElement(By.linkText("Apparel & Shoes"));
        System.out.println("10. " + apparelShoes.getText());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}