package HomeWork06;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void createAccountPositiveTest() {

        app.getUser().registerNewUser();

        Assert.assertTrue(app.getUser().isElementPresent(By.cssSelector(".ico-logout")));
    }

}