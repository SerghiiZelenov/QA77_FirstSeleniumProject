import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;

public class FindElementlnTable {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().browserVersion("146").setup();
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findTableElements() {

        // найти таблицу
        WebElement table = driver.findElement(By.tagName("table"));
        System.out.println("Table found");

        // найти все строки
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        System.out.println("Rows count: " + rows.size());

        // найти все ячейки
        List<WebElement> cells = driver.findElements(By.tagName("td"));
        System.out.println("Cells count: " + cells.size());

        // первая ячейка
        WebElement firstCell = driver.findElement(By.tagName("td"));
        System.out.println("First cell: " + firstCell.getText());

        // заголовок таблицы
        WebElement header = driver.findElement(By.tagName("th"));
        System.out.println("Header: " + header.getText());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void findCssSelectorInTable() {
        //get all of rows
        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());
    }
}
