package HomeWork06;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase {
    String email;

    @BeforeMethod
    public void precondition() {
        email = app.getUser().registerNewUser();
        app.getItem().goToHomePage();
    }

    @Test
    public void  addItemToCartTest() {
        String productName = "14.1-inch Laptop";
        app.getItem().addItemToCart(productName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        app.getItem().openCart();
        Assert.assertTrue(app.getItem().isProductInCart(productName));
    }
}
