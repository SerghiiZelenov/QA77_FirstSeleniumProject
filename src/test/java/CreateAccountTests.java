import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void createAccountPositiveTest() {

        click(By.cssSelector(".ico-register"));

        type(By.id("FirstName"), "Ivan");
        type(By.id("LastName"), "Ivanov");

        type(By.id("Email"), "test" + System.currentTimeMillis() + "@mail.com");

        type(By.id("Password"), "123456");
        type(By.id("ConfirmPassword"), "123456"); // подтверждение

        click(By.id("register-button"));

        Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));
        System.out.println("Registration completed");
        System.out.println("Logout present: " + isElementPresent(By.cssSelector(".ico-logout")));
    }
}