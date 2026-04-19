package HomeWork;

import org.openqa.selenium.By;

public class UserHelper extends BaseHelper {

    public UserHelper(ApplicationManager app) {
        super(app);
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector(".ico-register"));
    }

    public String registerNewUser() {
        clickOnRegisterLink();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        type(By.id("FirstName"), "Ivan");
        type(By.id("LastName"), "Ivanov");

        String email = "test" + System.currentTimeMillis() + "@mail.com";
        type(By.id("Email"), email);

        type(By.id("Password"), "123456");
        type(By.id("ConfirmPassword"), "123456");

        click(By.id("register-button"));

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }
        return email;
    }
}
