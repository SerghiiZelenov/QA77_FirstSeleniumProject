package HomeWork06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {

    public WebDriver getDriver() {
        return driver;
    }

    public ItemHelper getItem() {
        return item;
    }

    public UserHelper getUser() {
        return user;
    }

    public void init() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/");
        user = new UserHelper(this);
        item = new ItemHelper(this);
    }

    public void stop() {
        driver.quit();
    }
    WebDriver driver;

    UserHelper user;
    ItemHelper item;
}
