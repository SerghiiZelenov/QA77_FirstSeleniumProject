package HomeWork06;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void createAccountPositiveTest() {

        clickOnRegisterLink();

        registerNewUser();

        Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));
        System.out.println("Registration completed");
        System.out.println("Logout present: " + isElementPresent(By.cssSelector(".ico-logout")));
    }

}