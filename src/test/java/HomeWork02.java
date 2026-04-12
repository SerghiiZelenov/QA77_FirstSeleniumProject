import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork02 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void findTenElementsByCssSelectorTest() {
        driver.get("https://demowebshop.tricentis.com/");

        WebElement registerLink = driver.findElement(By.cssSelector(".ico-register"));
        System.out.println(registerLink.getText());

        WebElement loginLink = driver.findElement(By.cssSelector(".ico-login"));
        System.out.println(loginLink.getText());

        WebElement searchField = driver.findElement(By.cssSelector("#small-searchterms"));
        System.out.println(searchField.getAttribute("id"));

        WebElement searchButton = driver.findElement(By.cssSelector(".button-1.search-box-button"));
        System.out.println(searchButton.getAttribute("value"));

        WebElement shoppingCart = driver.findElement(By.cssSelector(".cart-label"));
        System.out.println(shoppingCart.getText());

        WebElement wishlist = driver.findElement(By.cssSelector(".wishlist-label"));
        System.out.println(wishlist.getText());

        WebElement books = driver.findElement(By.cssSelector("a[href='/books']"));
        System.out.println(books.getText());

        WebElement computers = driver.findElement(By.cssSelector("a[href='/computers']"));
        System.out.println(computers.getText());

        WebElement electronics = driver.findElement(By.cssSelector("a[href='/electronics']"));
        System.out.println(electronics.getText());

        WebElement apparelShoes = driver.findElement(By.cssSelector("a[href='/apparel-shoes']"));
        System.out.println(apparelShoes.getText());
    }

    @Test
    public void findTenElementsByXPathTest() {
        driver.get("https://demowebshop.tricentis.com/");

        WebElement registerLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        System.out.println(registerLink.getText());

        WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        System.out.println(loginLink.getText());

        WebElement searchField = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println(searchField.getAttribute("id"));

        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
        System.out.println(searchButton.getAttribute("value"));

        WebElement shoppingCart = driver.findElement(By.xpath("//a[normalize-space()='Shopping cart']"));
        System.out.println(shoppingCart.getText());

        WebElement wishlist = driver.findElement(By.xpath("//a[normalize-space()='Wishlist']"));
        System.out.println(wishlist.getText());

        WebElement books = driver.findElement(By.xpath("//a[normalize-space()='Books']"));
        System.out.println(books.getText());

        WebElement computers = driver.findElement(By.xpath("//a[normalize-space()='Computers']"));
        System.out.println(computers.getText());

        WebElement electronics = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
        System.out.println(electronics.getText());

        WebElement apparelShoes = driver.findElement(By.xpath("//a[normalize-space()='Apparel & Shoes']"));
        System.out.println(apparelShoes.getText());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
