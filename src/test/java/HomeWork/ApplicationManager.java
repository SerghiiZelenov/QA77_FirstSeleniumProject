package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class ApplicationManager {

    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

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
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }  else if (browser.equals("safari")) {
            driver = new SafariDriver();
        }
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
