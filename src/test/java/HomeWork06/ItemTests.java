package HomeWork06;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase {
    String email;
    String password = "123456";

    public void createNewUser() {

    }

    @BeforeMethod
    public void precondition() {
        email = registerNewUser();
        click(By.cssSelector(".header-logo"));
    }

    @Test
    public void  addItemToCartTest() {
        String productName = "14.1-inch Laptop";

        click(By.xpath("//a[text()='" + productName + "']/../..//input[@value='Add to cart']"));
        click(By.cssSelector(".ico-cart"));
        Assert.assertTrue(isElementPresent(By.linkText("14.1-inch Laptop")));
    }
}
