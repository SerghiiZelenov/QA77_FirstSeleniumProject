package HomeWork06;

import org.openqa.selenium.By;

public class ItemHelper extends BaseHelper {

    public ItemHelper(ApplicationManager app) {
        super(app);
    }

    public void addItemToCart(String productName) {
        click(By.xpath("//a[text()='" + productName + "']/../..//input[@value='Add to cart']"));
    }

    public void openCart() {
        click(By.cssSelector(".bar-notification .close"));
        click(By.cssSelector(".ico-cart"));
    }

    public boolean isProductInCart(String productName) {
        return isElementPresent(By.linkText(productName));
    }

    public void goToHomePage() {
        app.getDriver().get("https://demowebshop.tricentis.com/");
    }
}
