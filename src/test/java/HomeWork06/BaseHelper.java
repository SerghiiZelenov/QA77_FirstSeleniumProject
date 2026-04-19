package HomeWork06;

import org.openqa.selenium.By;

public class BaseHelper {

    ApplicationManager app;

    public BaseHelper(ApplicationManager app) {
        this.app = app;
    }

    public void click(By locator) {
        app.getDriver().findElement(locator).click();
    }

    public void type(By locator, String text) {
        app.getDriver().findElement(locator).clear();
        app.getDriver().findElement(locator).sendKeys(text);
    }

    public boolean isElementPresent(By locator) {
        return app.getDriver().findElements(locator).size() > 0;
    }
}
